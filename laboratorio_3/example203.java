package laboratorio_3;

import java.util.Scanner;

public class example203 {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce el número: " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        int greater = numbers[0];
        int lesser = numbers[0];

        for (int i = 1; i < 5; i++) {

            if (numbers[i] > greater) {
                greater = numbers[i];
            }

            if (numbers[i] < lesser) {
                lesser = numbers[i];
            }
        }

        System.out.println("El número mayor es: " + greater);
        System.out.println("El número menor es: " + lesser);

        scanner.close();
    }
}