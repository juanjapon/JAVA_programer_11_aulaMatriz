import java.util.ArrayList;
import java.util.List;

public class ListaGenerica <T>{
    List<T> lista=new ArrayList<>();

    public void agregar(T valor){
        lista.add(valor);
    }

    public T getItem(int index){
        return lista.get(index);
    }
    public int tamaño(){
        return lista.size();
    }
    public void imprimir(){
        lista.forEach(System.out::println);
    }

    /*
    Tarea: Crear un metodo generico que aplique restricciones por tipo de dato
     */
}
