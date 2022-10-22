import java.util.Random;
import java.util.Scanner;
public class Reto3 {
    public static void main(String[] args) {
        // Definir objeto de captura
        Scanner leer=new Scanner(System.in);

        // Se capturan y definen varibles
        System.out.println("Seleccione \n 1. Cara \n 2. Sello \n");
        int eleccion=leer.nextInt();

        Random  rnd = new Random();
        int monedaRnd=rnd.nextInt(2)+1;


        //Procesar informacion

        if(eleccion==monedaRnd){
            System.out.println("Ganaste, tu elejiste: "+eleccion+" y cayó: "+monedaRnd);

        }
        else{
            System.out.println("Perdiste, tu elejiste: "+eleccion+" y cayó: "+monedaRnd);
        }
        leer.close();
    }
}
