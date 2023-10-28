// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        IMostrarNombreCompleto nombre=(nombre1,nombre2,apellido1,apellido2)-> System.out.println(nombre1+" "+nombre2+" "+apellido1+" "+apellido2);
        IMostrarNombreCompleto nombreUpper=(nombre1,nombre2,apellido1,apellido2)-> System.out.println(nombre1.toUpperCase()+" "+nombre2.toUpperCase()+" "+apellido1.toUpperCase()+" "+apellido2.toUpperCase());
        IMostrarNombreCompleto nombreLower=(nombre1,nombre2,apellido1,apellido2)-> System.out.println(nombre1.toLowerCase()+" "+nombre2.toLowerCase()+" "+apellido1.toLowerCase()+" "+apellido2.toLowerCase());
        nombre.mostrarNombreCompleto("Juan","Pedro","Mendoza","Ramirez");
        nombreUpper.mostrarNombreCompleto("Juan","Pedro","Mendoza","Ramirez");
        nombreLower.mostrarNombreCompleto("Juan","Pedro","Mendoza","Ramirez");
    }

}