package Entities;

public class Carro extends Vehiculo{
    private int num_puestos;
    private int num_puertas;

    @Override
    public String toString() {
        return super.toString()+" Carro{" +
                "num_puestos=" + num_puestos +
                ", num_puertas=" + num_puertas +
                '}';
    }

    @Override
    public void andar() {
        super.andar();
        System.out.println("En cuatro ruedas....");
    }

    public int getNum_puestos() {
        return num_puestos;
    }

    public void setNum_puestos(int num_puestos) {
        this.num_puestos = num_puestos;
    }

    public int getNum_puertas() {
        return num_puertas;
    }

    public void setNum_puertas(int num_puertas) {
        this.num_puertas = num_puertas;
    }
}
