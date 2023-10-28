public interface ICalculadora {
    int operacion(int a,int b);
    default void mostrarOperacion(String message){
        System.out.println(message);
    }
}
