package laboratorio_3;

import java.util.Scanner;

public class example201 {

    public static int sumar (int numero1, int numero2) {
        return numero1 + numero2;
    }

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca el primer número :");
        int numero1 = scanner.nextInt();

        System.out.println("Introduzca el segundo número: ");
        int numero2 = scanner.nextInt();

        int resultado = sumar (numero1, numero2);

        System.out.println("La suma es: " + resultado);

        scanner.close();
    }
    
}
