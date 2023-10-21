package Entities;

public class Vehiculo {
    private int inventario;

    @Override
    public String toString() {
        return "Vehiculo{" +
                "inventario=" + inventario +
                ", color='" + color + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo=" + modelo +
                ", referencia='" + referencia + '\'' +
                '}';
    }

    private String color;
    private String marca;
    private int modelo;
    private String referencia;

    public void andar(){
        System.out.println("rrruuuuuuuunnnnnnnnnnn....");
    }
    public int getInventario() {
        return inventario;
    }

    public void setInventario(int inventario) {
        this.inventario = inventario;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
}
