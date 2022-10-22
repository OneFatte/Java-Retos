import java.util.Scanner;

public class Calculador {
    public static void main(String[] args) {
        //Se crea objeto lectura
        Scanner leer=new Scanner(System.in);

        //Se definen variables
        //Varibles calculadora
        int op,num1,num2,resultado;
        double valor1,valor2;

        //Variables usuarios
        String usuario1="jfajardo", cont1="12345678#", usuario2="fcabrera", cont2="qwerty2022", usuario,cont;

        System.out.println("Ingrese su usuario");
        usuario=leer.nextLine();

        System.out.println("Ingrese su contraseña");
        cont=leer.nextLine();

        System.out.println(" "+usuario+" "+cont);

        // ingreso

        if( (usuario.equals(usuario1) && cont.equals(cont1)) || (usuario.equals(usuario2) && cont.equals(cont2)) ) {

            System.out.println("Menu opciones \n 1.Suma \n 2.Resta \n 3.Multiplicacion \n 4.Division \n 5.Potenciacion \n 6.Raiz cuadrada \n Ingrese el numero de la opcion");
            op=leer.nextInt();

            System.out.println("Ingrese numero 1");
            num1=leer.nextInt();

            System.out.println("Ingrese numero 2");
            num2=leer.nextInt();

            switch(op){
                case 1:
                    resultado=num1+num2;
                    System.out.println("El resultado de la suma es: "+resultado);
                break;
                case 2:
                    resultado=num1-num2;
                    System.out.println("El resultado de la resta es: "+resultado);
                break;
                case 3:
                    resultado=num1*num2;
                    System.out.println("El resultado de la multiplicacion es: "+resultado);
                break;
                case 4:
                    double dnum1=num1,dnum2=num2;
                    valor1=dnum1/dnum2;
                    System.out.println("El resultado de la division es: "+valor1);
                break;
                case 5:
                    valor1=Math.pow(num1, num2);
                    System.out.println("El resultado de la potenciacion es: "+valor1);
                break;
                case 6: 
                    valor1=Math.sqrt(num1);
                    valor2=Math.sqrt(num2);
                    System.out.println("El resultado de la raiz cuadrada del primer numero es: "+valor1+" y la del segundo numero es: "+valor2);
                break;
                default:
                    System.out.println("Dato erroneo");
                break;
            }
        //Fin calculadora _______________________________________________________________________________________________________________
        }
        else if(usuario.equals(usuario1) || usuario.equals(usuario2)){ //Contraseña incorecta
            System.out.println("Contraseña no es correcta");
        }
        else if(cont.equals(cont1) || cont.equals(cont2)){ //Contraseña incorecta
            System.out.println("Usuario no existe");
        }
        else {
            System.out.println("Credenciales de acceso incorrectos");
        }
    
        //Calculadora proceso_________________________________________________________________________________________________________

        leer.close();
    }
}
