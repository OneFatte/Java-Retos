import java.util.Scanner;
import java.util.Random;
public class Reto6 {
    public static void main(String[] args) {
        // Se define la variable de captura
        Scanner leer=new Scanner(System.in);

        // Se definen variables
        int prodTotal=0 , i=0 , brk=0 , precio=0 , cant=0, bolita;
        double totalPrecio=0 , cambio, pagar;
        String brk2;

        // Se define varible ramdom
        Random bola=new Random();

        System.out.println("Estamos de aniversario te daremos un descuanto segun tu compra. \n ");

        // While conteo de productos
        while ( brk<1){
            i=i+1;
            System.out.println("Ingrese el precio del "+i+" producto");
            precio=leer.nextInt();

            System.out.println("Ingrese la cantidad del "+i+" producto");
            cant=leer.nextInt();

            System.out.println("Para finalizar oprima -n- de lo contrario oprima cualquier tecla ");
            brk2=leer.next();
            
            prodTotal= precio*cant;
            totalPrecio= totalPrecio + prodTotal;
            if(brk2.equals("n") || brk2.equals("N")){
                brk=10;
            }
        }


        System.out.println("La cantidad de productos comprados es de "+ i);

        if (50000 <= totalPrecio){
            System.out.println("Aplicas para el descuento, \n el valor de tu compra es "+totalPrecio+"\n Saca una bolita!\n ");
            bolita=bola.nextInt(5)+1;
            if (bolita==1){
                totalPrecio=totalPrecio-(totalPrecio*0.1);
                System.out.println("Sacaste una bolita  roja, tienes un descuento del 10%. \n Tu valor a pagar es de: "+totalPrecio);
            }
            else if (bolita==2){
                totalPrecio=totalPrecio-(totalPrecio*0.3);
                System.out.println("Sacaste una bolita  azul, tienes un descuento del 30%. \n Tu valor a pagar es de: "+totalPrecio);
            }
            else if (bolita==3){
                totalPrecio=totalPrecio-(totalPrecio*0.5);
                System.err.println("Sacaste una bolita  amarilla, tienes un descuento del 50%. \n Tu valor a pagar es de: "+totalPrecio);
            }
            else {
                totalPrecio=0;
                System.out.println("Sacaste una bolita  blanca, Tu compra es gratis.");
            }
        }   
        else {
            System.out.println("No aplicas para el descuento, el valor de la compra es de:"+totalPrecio+" necesitas una compra superior a 50.000 COP");
        }
        // Devolucion de cambio   
        System.out.println("Con cuanto desea pagar?\n"); 
        pagar=leer.nextDouble();
        cambio=pagar-totalPrecio;
        System.out.println("Su cambio es de: "+cambio);

        leer.close();
    }
}
