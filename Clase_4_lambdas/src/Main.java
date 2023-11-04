import java.util.function.Consumer;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        /**
         * Expresion lambda
         * ()->
         * ->
         * (a,b)
         * (int a, int b)
         * Interfaz funcional: proporciona un unico metodo abstracto
         * Ventajas:
         * Codigo corto
         * Mejor interpretación
         * Reutilización
         *
         *
         *  Interfaces funcionales
         *      Predicate: 1) Realiza una comparación
         *                 2) Su metodo es test
         *                 Predicate<T> nombre=()->.....
         *      Function: 1) Su objetivo es realizar una operacion
         *                2) Su metodo es apply
         *                2) devuelve un resultado
         *                Function<T> nombre=()->operacion
         *      Consumer:1) Dispone del metodo abstracto accept
         *               2) Se utiliza en operaciones de procesamiento de datos
         *               Consumer<T> nombre= (a)->logica
         *      Supplier: 1) Dispone del metodo abstracto get que no recibe ningun parametro y devuelve un objeto
         *                2) Produce un valor sin necesidad de recibir algun parametro
         *                Supplier<T> nombreObjeto=()->logica;
         */


        Supplier<Integer> random=()->(int)(Math.random()*10+1);
        for (int i=0;i<15;i++){
            System.out.println(random.get());
        }

        Consumer<String> imprimir=System.out::println;
        imprimir.accept("Hola mundo");

    }
}