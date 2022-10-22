import java.util.Random;
public class Dados {
    public static void main(String[] args) {
        System.out.println("Para ganar necesitas pares de 1 o 6 \n o una suma ganadora de 3, 7 o 11 \n");

        Random  rnd1 = new Random();
        Random  rnd2 = new Random();

        int dado1=rnd1.nextInt(5+1)+1;
        int dado2=rnd2.nextInt(5+1)+1;
        int suma=dado1+dado2;

        if( (dado1==1 && dado2==1) || (dado1==6 && dado2==6) ){
            System.out.println("Ganastes, sacaste pares en \n Dado1: "+dado1+" y en Dado2: "+dado2);
        }
        else if( suma==3 || suma==11 || suma==7 ){
            System.out.println("Ganastes, sacaste una suma ganadora en \n Dado1: "+dado1+" y en Dado2: "+dado2);
        }  
        else {
            System.out.println("Perdiste, no sacaste una suma ganadora o pares en \n Dado1: "+dado1+" y en Dado2: "+dado2);
        }
    }
    
}
