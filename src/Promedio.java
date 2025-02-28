import java.util.Scanner;

public class Promedio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("CALCULAR EL PROMEDIO DE 3 NUMEROS");

        System.out.print("Ingrese el primer numero: ");
        double numerouno = scanner.nextDouble();
        System.out.print("Ingrese el segundo numero: ");
        double numerodos = scanner.nextDouble();
        System.out.print("Ingrese el tercer numero: ");
        double numerotres = scanner.nextDouble();

        double Suma = numerouno + numerodos + numerotres;
        System.out.println("la suma de los numeros es: " + Suma); 
        double promedio = Suma/3;
        System.out.println("El promedio de los 3 números es: " + promedio);

    

    }
}