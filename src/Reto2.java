import java.util.Scanner;
public class Reto2 {
    public static void main(String[] args) {
        // Definir objeto de captura
        Scanner leer=new Scanner(System.in);

        //Datos de entrada
        double peso, edad, dosis;

        System.out.println("Ingrese la edad del bebe en meses");
        edad=leer.nextDouble();

        System.out.println("Ingrese el peso del bebe");
        peso=leer.nextDouble();


        //Procesar informacion
        dosis=((peso+10)/(edad*10))*8;

        //Salida
        System.out.println("La dosis requeria para un bebe de "+edad+"meses y con "+peso+"kilos de peso es de "+dosis+"mililitros");
        leer.close();
    }
}
