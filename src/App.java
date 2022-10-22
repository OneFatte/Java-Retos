import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("Como fueron vueltas");
        
        //Definir un objeto
        Scanner leer=new Scanner(System.in);

        // Rerciba el radio del circulo
        //Datos de entrada
        final double PI=3.14159265;
        double radio,area;

        System.out.println("Ingrese el radio del circulo");
        radio=leer.nextDouble();
        
        //Procesar la informacion
        area=(PI)*(radio*radio);

        // Salida
        System.out.println("El area del circulo con radio "+radio+" es: "+area);
        leer.close();

    }
}
