import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> enteros=new ArrayList<Integer>();
        ArrayList<String> strings=new ArrayList<String>();
        ArrayList<Double> doubles=new ArrayList<Double>();
        ArrayList<Boolean> booleanos=new ArrayList<Boolean>();

        for (int i = 0; i < 20; i++) {
            enteros.add(i);
            strings.add(" el numero es: "+i);
            doubles.add(i*Math.random());
            booleanos.add(i%2==0);
        }

        //impresión con foreach
        for (int i:enteros
             ) {
            System.out.println(i);
        }
        for(String a:strings){
            System.out.println(a);
        }
        for (double d:doubles
             ) {
            System.out.println(d);
        }
        for (boolean b:booleanos
             ) {
            System.out.println(b);
        }
        //Impresión con lambdas
        enteros.forEach(System.out::println);
        strings.forEach(System.out::println);
        doubles.forEach(System.out::println);
        booleanos.forEach(System.out::println);


    }
}