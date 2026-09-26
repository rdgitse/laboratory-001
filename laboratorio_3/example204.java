package laboratorio_3;

import java.util.Scanner;

public class example204 {

    public static double sum (double number1, double number2) {
        return number1 + number2;
    }

    public static double subtraction (double number1, double number2) {
        return number1 - number2;
    }

    public static double multiply (double number1, double number2) {
        return number1 * number2;
    }

    public static double divide (double number1, double number2) {
        return number1 / number2;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        double number1 = scanner.nextDouble();

        System.out.print("Introduce el segundo número: ");
        double number2 = scanner.nextDouble();

        System.out.println("\n¿Qué operación quieres realizar?");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");

        System.out.print("Elige una opción: ");
        int option = scanner.nextInt();

        switch (option) {

            case 1:
                System.out.println("Resultado: " + sum (number1,number2));
                break;

            case 2:
                System.out.println("Resultado: " + subtraction (number1,number2));
                break;

            case 3:
                System.out.println("Resultado: " + multiply (number1,number2));
                break;

            case 4:
                if (number2 !=0) {
                    System.out.println("Resultado: " + divide (number1,number2));
                } else {
                    System.out.println("No se puede dividir entre cero.");
                }
                break;

            default:
                System.out.println("Opción no válida.");
        }

        scanner.close();
    }
    
}