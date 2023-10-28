import java.util.ArrayList;

public class Usuario {

    private String nombre;
    private String apellido;

    private ArrayList<Transaccion> transacciones=new ArrayList<>();
    private ArrayList<Transaccion> fallidas=new ArrayList<>();


    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", transacciones=" + transacciones +
                ", fallidas=" + fallidas +
                '}';
    }

    public ArrayList<Transaccion> getFallidas() {
        return fallidas;
    }

    public void setFallidas(ArrayList<Transaccion> fallidas) {
        this.fallidas = fallidas;
    }

    public ArrayList<Transaccion> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(ArrayList<Transaccion> transacciones) {
        this.transacciones = transacciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
