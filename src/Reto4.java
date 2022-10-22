import java.util.Random;
import java.util.Scanner;
public class Reto4 {
    public static void main(String[] args) {
        // Se cre la varible de captura
        Scanner leer=new Scanner(System.in);

        //Se captura y definen variables
        System.out.println("Selecciona: \n 1) Piedra \n 2) Papel \n 3) Tijera \n ");
        int eleccion=leer.nextInt();
        // Variable random
        Random  rnd = new Random();
        int PPT=rnd.nextInt(3)+1;

        if ( (eleccion==1 && PPT==3) || (eleccion==2 && PPT==1) || (eleccion==3 && PPT==2) ){
            if (eleccion==1){
                System.out.println("Ganaste, sacaste Piedra y la maquina Tijeras");
            }
            else if (eleccion==2){
               System.out.println("Ganaste, sacaste Papel y la maquina Piedra");
            }
            else {
                System.out.println("Ganaste, sacaste Tijeras y la maquina Papel");  
            } 
        }
        else if ( (eleccion==1 && PPT==2) || (eleccion==2 && PPT==3) || (eleccion==3 && PPT==1) ){
            if (eleccion==1){
                System.out.println("Perdiste, sacaste Piedra y la maquina Papel");
            }
            else if (eleccion==2){
               System.out.println("Perdiste, sacaste Papel y la maquina Tijeras");
            }
            else {
                System.out.println("Perdiste, sacaste Tijeras y la maquina Piedra");  
            }
        }
        else {
            if (eleccion==1){
                System.out.println("Empataste, sacaste Piedra y la maquina Piedra");
            }
            else if (eleccion==2){
               System.out.println("Empataste, sacaste Papel y la maquina Papel");
            }
            else {
                System.out.println("Empataste, sacaste Tijeras y la maquina Tijeras");  
            }
        }

        leer.close();
    }
}
