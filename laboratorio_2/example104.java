package laboratorio_2;

import java.util.Scanner;

public class example104 {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        int option = 0;
        boolean validOption = false;

        while (!validOption) {
            

        System.out.println("-----MENÚ DEL ITSE-----");
        System.out.println("1. Pizza");
        System.out.println("2. Hamburguesa");
        System.out.println("3. Salchipapas");
        System.out.println("4. Empanada");
        System.out.println("5. Salir");
        System.out.println("¿Cuál desea?: ");

        option = scanner.nextInt();

        switch (option) {
            case 1:
                System.out.println("Escogiste Pizza");
                System.out.println("Precio: $1.00");
                validOption = true;
                break;

            case 2:
                System.out.println("Escogiste Hamburguesa");
                System.out.println("Precio: $2.00");
                validOption = true;
                break;
                

            case 3:
                System.out.println("Escogiste Salchipapas");
                System.out.println("Precio: $2.50");
                validOption = true;
                break;

            case 4:
                System.out.println("Escogiste Empanada");
                System.out.println("Precio: $1.00");
                validOption = true;
                break;

            case 5:
                System.out.println("Gracias por comprar!");
                validOption = true;
                break;

            default:
                System.out.println("Opción no válida...");

        } 
        
        if (option >=1 && option <=4) {
            System.out.println("Gracias por comprar.");
        }
    }
    scanner.close();
    }
}