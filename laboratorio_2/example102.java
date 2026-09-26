package laboratorio_2;

import java.util.Scanner;
import java.util.Random;

public class example102 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(100) + 1;
        int guess = 0;

        while (guess != secretNumber) {

            System.out.println("Adivine un número entre 1 y 100: ");
            guess = input.nextInt();

            if (guess < secretNumber) {
                System.out.println("Muy bajo...");
            } 
            
            else if (guess > secretNumber) {
                System.out.println("Muy alto!");
            } 
            
            else {
                System.out.print("Felicidades! Adivinaste el número");
            }
        }

        input.close();
    }
    
}
