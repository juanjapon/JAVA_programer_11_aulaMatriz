import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //Collection
        /**
         * Objetos que tiene una agrupacion de datos
         *
         * add
         * Cotains
         * remove
         * removeIf
         * Size
         * Stream
         *
         *
         *  FOR/WHILE  vs Stream
         *
         *  Collection
         *
         *  Listas List
         *  Tablas  Maps
         *  conjuntos Arboles
         *  Colas
         *
         *  Listas
         *
         *  Cada elemento tiene una  posicion a partir del orden
         *  de llegada
         *
         *  List , son genericas
         *
         *  ArrayList es un arreglo dimanimo va por posicion
         *  Vector
         *  LinkedList
         *
         *
         */
        ArrayList<Integer> numerosList = new ArrayList<>();
        numerosList.add(1);
        numerosList.add(2);
        numerosList.add(3);


        //numerosList.forEach(System.out::println);

        LinkedList<Integer> numerosLinkedList = new LinkedList<>();

        numerosLinkedList.add(1);

        numerosLinkedList.addFirst(20);
        numerosLinkedList.addLast(7);
        numerosLinkedList.forEach(System.out::println);

        //System.out.println(numerosLinkedList.getFirst());
        System.out.println("......");
        numerosLinkedList.forEach(System.out::println);


        //crear una lista con valores aleatorios  minimo 5
        // mostrar la lista llena
        //eliminar los elementos que sean impares
        //volver a mostrar la lista

        Validaciones esImpar = numero -> numero % 2 !=0;

        List<Integer> numList =new ArrayList<>();
        Random  random = new Random();
        int sizeIterator=5;

        for (int i = 0; i < sizeIterator; i++) {
            numList.add(random.nextInt(100));
        }

        numList.forEach(System.out::println);

        numerosList.removeIf(numero->esImpar.verificcion(numero));

        numList.forEach(System.out::println);

    }
}

