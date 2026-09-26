package laboratorio_3;

import java.util.Scanner;

public class example202 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] friends = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce el nombre del amigo " + (i + 1) + ": ");
            friends[i] = scanner.nextLine();
        }

        System.out.println("\nLista de amigos:");

        for (int i = 0; i < 5; i++) {
            System.out.println(friends[i]);
        }

        scanner.close();
    }
    
}
