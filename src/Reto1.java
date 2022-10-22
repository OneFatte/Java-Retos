import java.util.Scanner;
public class Reto1 {
    public static void main(String[] args) {
        //Definir un objeto para lectura
        Scanner leer=new Scanner(System.in);

        //Datos de entrada
        double centigrados,farenheit;

        System.out.println("Ingrese los grados q se van a convertir en farenheit ->");
        farenheit=leer.nextDouble();

        //Procesar informacion
        centigrados=(farenheit-32)/1.8;

        //Salida
        System.out.println("Los grados farenheit "+farenheit+" converitods a centigrados dan como resultado: "+centigrados);
        leer.close();
    }
}
