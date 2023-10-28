// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    ICalculadora suma=(a,b)->a+b;
    ICalculadora resta=(a,b)->a-b;
    ICalculadora multiplicacion=(a,b)->a*b;
    suma.mostrarOperacion(" "+suma.operacion(5,7));
        resta.mostrarOperacion(" "+resta.operacion(5,7));
        multiplicacion.mostrarOperacion(" "+multiplicacion.operacion(5,7));

    }
}
