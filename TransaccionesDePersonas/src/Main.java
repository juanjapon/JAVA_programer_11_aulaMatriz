import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double balance=0;
        double ingresos=0;
        double egresos=0;
        ArrayList<Usuario> usuarios=new ArrayList<Usuario>();
        String line=scanner.nextLine();
        while (!line.equals("exit")){
            System.out.println("ingrese la transacción en el siguiente orden\n" +
                    "separando los campos con '-'\n" +
                    "Nombre - Apellido - Monto - Ciudad - Pais - Detalle - ClaveVerificacion - Estado ");
            line=scanner.nextLine();
            if (line.equals("exit")){
                break;
            }
            else{
                String[] elementosTransaccion=line.split("-");
                Usuario usuario=new Usuario();
                usuario.setNombre(elementosTransaccion[0]);
                usuario.setApellido(elementosTransaccion[1]);
                double monto= Double.parseDouble(elementosTransaccion[2]);
                String ciudad=elementosTransaccion[3];
                String pais=elementosTransaccion[4];
                String detalle=elementosTransaccion[5];
                boolean claveVerificacion=Boolean.parseBoolean(elementosTransaccion[6]);
                String estado=elementosTransaccion[7];
                Transaccion transaccion=new Transaccion(monto,ciudad,pais,detalle,claveVerificacion);
                ArrayList<Transaccion> transacciones=new ArrayList<>();
                ArrayList<Transaccion> transaccionesFallidas=new ArrayList<>();

                IValidadorMonto validadorMonto=(a)->a<0;
                IValidadorEstado iValidadorEstado=(a)->a.equals("Ingreso")||a.equals("Egreso");
                if(!validadorMonto.validarMonto(monto)){
                    transaccionesFallidas.add(transaccion);
                }else if(transaccion.isSospechosa()){
                    transaccionesFallidas.add(transaccion);
                }else if (!iValidadorEstado.validarEstado(estado)){
                    transaccionesFallidas.add(transaccion);
                }else{
                    if(estado.equals("Ingreso")){
                        balance+=monto;
                        ingresos+=monto;
                    }else {
                        balance-=monto;
                        egresos+=monto;
                    }
                    transacciones.add(transaccion);
                }

                usuario.setTransacciones(transacciones);
                usuario.setFallidas(transaccionesFallidas);
                usuarios.add(usuario);

            }
        }
        System.out.println("las transacciones correctas son:");
        for (Usuario u:usuarios
             ) {
            u.getTransacciones().forEach(System.out::println);

        }
        System.out.println("Las transacciones incorrectas son:");
        for (Usuario u:usuarios
        ) {
            u.getFallidas().forEach(System.out::println);

        }

        System.out.println("El balance es: "+balance);
        System.out.println("Total ingresos: "+ingresos);
        System.out.println("Total egresos: "+egresos);

    }
}