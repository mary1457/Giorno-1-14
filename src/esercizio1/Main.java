package esercizio1;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] array = new int[5];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);


        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1, 11);
        }


        System.out.println("Array iniziale: ");
        stampaArray(array);


        while (true) {
            try {

                System.out.println("Inserire un numero da 1 a 10. Inserire 0 per uscire:");
                int numero = scanner.nextInt();


                if (numero == 0) {
                    break;
                }


                System.out.println("Inserire la posizione (0-4) in cui inserire il numero:");
                int posizione = scanner.nextInt();


                array[posizione] = numero;


                System.out.println("Nuovo array: ");
                stampaArray(array);

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Errore: hai inserito una posizione non valida! Riprova.");
            }
        }

        scanner.close();

    }


    public static void stampaArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
