import Entities.Carro;
import Entities.Moto;
import Entities.Vehiculo;

import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList<Vehiculo> vehiculos=new ArrayList<Vehiculo>();
        Scanner scanner=new Scanner(System.in);
        int opcion=0;

        while(opcion!=4){
            System.out.println("Selecciones la opción que desea ejecutar:\n1.Ingrese carro\n2.Ingrese moto\n3.Listar vehiculos\n4.Salir");
            opcion=scanner.nextInt();
            switch (opcion){
                case 1:
                    Carro car=new Carro();
                    System.out.println("ingrese Color:");
                    car.setColor(scanner.next());
                    System.out.println("ingrese numero de puertas:");
                    car.setNum_puertas(scanner.nextInt());
                    System.out.println("Ingrese puestos:");
                    car.setNum_puestos(scanner.nextInt());
                    System.out.println("Ingrese marca:");
                    car.setMarca(scanner.next());
                    System.out.println("Ingrese modelo:");
                    car.setModelo(scanner.nextInt());
                    System.out.println("Ingrese referencia:");
                    car.setReferencia(scanner.next());
                    vehiculos.add(car);
                    break;
                case 2:
                    Moto bike=new Moto();
                    System.out.println("ingrese Color:");
                    bike.setColor(scanner.next());
                    System.out.println("ingrese cilindraje:");
                    bike.setCilindraje(scanner.next());
                    System.out.println("Ingrese marca:");
                    bike.setMarca(scanner.next());
                    System.out.println("Ingrese modelo:");
                    bike.setModelo(scanner.nextInt());
                    System.out.println("Ingrese referencia:");
                    bike.setReferencia(scanner.next());
                    vehiculos.add(bike);
                    break;
                case 3:
                    for(Vehiculo vehiculo:vehiculos){
                        if(vehiculo instanceof Carro ) {
                            System.out.println(((Carro) vehiculo).toString());
                        }else {
                            System.out.println(((Moto) vehiculo).toString());
                        }
                    }
                    break;
            }
        }

    }
}