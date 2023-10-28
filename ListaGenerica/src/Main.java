// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        ListaGenerica lista=new ListaGenerica();
        ListaGenerica<String>  lista2=new ListaGenerica<>();

        lista2.agregar("Esta es ");
        lista2.agregar("La otra lista");

        lista.agregar(1);
        lista.agregar(5);
        lista.agregar(8);

        lista.agregar("Hola");
        lista.agregar("Como estas");
        lista.agregar("Bien o no");

        lista.agregar(true);
        lista.agregar(false);

        lista.imprimir();
        lista2.imprimir();


    }
}