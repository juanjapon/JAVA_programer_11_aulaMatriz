import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        HashMap<String,Integer> inventario=new HashMap<>();
        inventario.put("Manzanas",59);
        inventario.put("Naranjas",23);
        inventario.put("Fresas",12);

        String[] keys=inventario.keySet().toArray(new String[0]);
        for(int i=0;i<keys.length;i++){
            System.out.println(keys[i]+" "+inventario.get(keys[i]));
        }
        System.out.println("Con foreach");
        inventario.forEach((k,v)-> System.out.println((k+v)));

        Set<String> set=new HashSet<>();
        set.add("manzana");
        set.add("pera");



    }
}