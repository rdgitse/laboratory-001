package laboratorio_3;

import java.util.Scanner;

public class example204 {

    public static double sumar (double numero1, double numero2) {
        return numero1 + numero2;
    }

    public static double restar (double numero1, double numero2) {
        return numero1 - numero2;
    }

    public static double multiplicar (double numero1, double numero2) {
        return numero1 * numero2;
    }

    public static double dividir (double numero1, double numero2) {
        return numero1 / numero2;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Introduce el segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.println("\n¿Qué operación quieres realizar?");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");

        System.out.print("Elige una opción: ");
        int opcion = scanner.nextInt();

        switch (opcion) {

            case 1:
                System.out.println("Resultado: " + sumar (numero1,numero2));
                break;

            case 2:
                System.out.println("Resultado: " + restar (numero1,numero2));
                break;

            case 3:
                System.out.println("Resultado: " + multiplicar (numero1,numero2));
                break;

            case 4:
                if (numero2 !=0) {
                    System.out.println("Resultado: " + dividir (numero1,numero2));
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
