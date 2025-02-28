import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("ingresa el nombre de usuario");
        Scanner scanner = new Scanner(System.in);
        String nombre = scanner.nextLine();
        System.out.println("Ingresa la edad del usuario");
        byte edad = scanner.nextByte();
        System.out.println("Escriba la altura del usuario en cm");
        byte altura = scanner.nextByte();
        System.out.println("Se llama: " + nombre + " Con edad: " + edad + " Y altura : " + altura);




    }
}
