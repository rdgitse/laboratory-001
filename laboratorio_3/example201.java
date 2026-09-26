package laboratorio_3;

import java.util.Scanner;

public class example201 {

    public static int sum (int number1, int number2) {
        return number1 + number2;
    }

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca el primer número :");
        int number1 = scanner.nextInt();

        System.out.println("Introduzca el segundo número: ");
        int number2 = scanner.nextInt();

        int result = sum (number1, number2);

        System.out.println("La suma es: " + result);

        scanner.close();
    }
    
}
