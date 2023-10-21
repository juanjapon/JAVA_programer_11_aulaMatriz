import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Persona persona=new Persona("Juan",40);
        System.out.println(persona.getNombre());
        persona.setNombre("Pedro");
        System.out.println(persona.getNombre());
        modificar(persona);
        System.out.println(persona.getNombre());
        String apellido="Florez";
        modificarNombre(apellido);
        System.out.println(apellido);
        persona.setApellido(apellido);
        persona.setDocumento(8827359);
        List<Persona> personaList=new ArrayList<Persona>();
        personaList.add(persona);
        personaList.add(new Persona("Carlos","Correa",9878964));
        personaList.add(new Persona("Maria","Perez",1249654));
        personaList.add(new Persona("Gloria","Arjona",6457568));
        personaList.add(new Persona("Raul","Colmenares",9874563));
        //Como funciona el For
        for (int i=0;i<personaList.size();i++){
            System.out.println(personaList.get(i).toString());
        }
        for (Persona p: personaList
             ) {
            System.out.println(p);
        }
        //Que hacen los dos puntos
        personaList.forEach(System.out::println);
        personaList.forEach(p->System.out.println(p));

    }
    public static void modificar(Persona persona){
        persona.setNombre("marcela");
    }
    public static void modificarNombre(String persona){
        persona="Suarez";
        System.out.println(persona);
    }
}