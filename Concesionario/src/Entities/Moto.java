package Entities;

public class Moto extends Vehiculo{
    private String cilindraje;

    public String getCilindraje() {
        return cilindraje;
    }

    @Override
    public String toString() {
        return super.toString()+" Moto{" +
                "cilindraje='" + cilindraje + '\'' +
                '}';
    }

    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }
    @Override
    public void andar(){
        super.andar();
        System.out.println("En dos ruedas....");
    }
}
