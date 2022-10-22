import java.util.Random;
import java.util.Scanner;
public class Reto7 {
    public static void main(String[] args) {
        // Definir objeto de captura
        Scanner leer=new Scanner(System.in);

        // Se capturan y definen varibles
        int brk=0, i=0;
        String brk2;


        System.out.println("EL ingreso minimo es de 100 dolares para apostar \n con cuanto va a ingresar?");
        int presupuesto=leer.nextInt();


        while ( brk<1){
            i++;
            System.out.println("Ronda "+i);
            System.out.println("Cuanto desea apostar? \n");
            int apuesta=leer.nextInt();

            if ((presupuesto-apuesta)>0){
                presupuesto=presupuesto-apuesta;
                System.out.println("Seleccione \n 1. Cara \n 2. Sello \n");
                int eleccion=leer.nextInt();

                Random  rnd = new Random();
                int monedaRnd=rnd.nextInt(2)+1;

                if(eleccion==monedaRnd){
                    System.out.println("Ganaste, tu elejiste: "+eleccion+" y cayó: "+monedaRnd);
                    presupuesto=presupuesto+(apuesta*2);
                    System.out.println("Tu presupuesto es de: "+presupuesto);
                }
                else{
                    System.out.println("Perdiste, tu elejiste: "+eleccion+" y cayó: "+monedaRnd);
                    System.out.println("Tu presupuesto es de: "+presupuesto);
                }
            }
            else{
                System.out.println("No dispones de fondos suficientes");
            }



            System.out.println("Para finalizar oprima -n- de lo contrario oprima cualquier tecla ");
            brk2=leer.next();
            if(brk2.equals("n") || brk2.equals("N")){
                brk=10;
            }
        }
        System.out.println("Usted jugo "+i+" veces y su presupuesto final es de "+presupuesto);
        


        //Procesar informacion

        
        leer.close();
    }
}

