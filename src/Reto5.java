import java.util.Scanner;

public class Reto5 {
    public static void main(String[] args) {
        // Se cre la varible de captura
        Scanner leer=new Scanner(System.in);

        System.out.println("Cual es tu nombre");
        String nombre=leer.nextLine();

        System.out.println("Cual es tu apellido");
        String apellido=leer.nextLine();

        String nombreCompleto=nombre+" "+apellido;
        String correo=nombre.substring(0, 2)+apellido;

        System.out.println("Longitud del nombre: "+ nombre.length()+" longitud del apellido: "+apellido.length());
        System.out.println("Nombre en mayuscula: "+ nombre.toUpperCase()+" y Apellido en minuscula: "+apellido.toLowerCase());
        System.out.println("NOmbre completo: "+nombreCompleto);
        System.out.println("Combinacion correo: "+correo.toLowerCase());
        leer.close();
    }
}
