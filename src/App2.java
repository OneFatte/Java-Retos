import java.util.Scanner;
public class App2 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        
        //Variables
        int edad;
        System.out.println("Ingrese su edad");
        edad=leer.nextInt();

        if(edad>=18){
            //Si la condicion se cimple
            System.out.println("Bienvenido");
        }
        else{
            //Condicon no se cumple
            System.out.println("No puede ingresar");
        }

        leer.close();
    }
}
