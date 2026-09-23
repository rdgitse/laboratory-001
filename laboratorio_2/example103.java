package laboratorio_2;

import java.util.Scanner;

public class example103 {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Introducza el número de estrellas: ");
        int number = input.nextInt();

        for (int i = 1; i <= number; i++) {
            System.out.print("*");
        }

        input.close();
    }
}
