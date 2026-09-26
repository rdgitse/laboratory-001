package laboratorio_2;

import java.util.Scanner;

public class example101 {
    public static void main (String[] args){
        
        Scanner input = new Scanner(System.in);

        System.out.println("¿Cuál es tu edad?: ");
        int edad = input.nextInt();

        if (edad >= 18) {
            System.out.println("Usted es mayor de edad.");
        } 
        
        else {
            System.out.println("Usted es menor de edad.");
        }

        input.close();
    }
}
