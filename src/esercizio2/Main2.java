package esercizio2;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {

           System.out.print("Inserisci i km percorsi: ");
            double kmPercorsi = scanner.nextDouble();
            //int kmPercorsi = scanner.nextInt();


            System.out.print("Inserisci i litri di carburante consumati: ");
            double litriConsumati = scanner.nextDouble();
            //int litriConsumati = scanner.nextInt();



            if (litriConsumati == 0.0) {
               throw new ArithmeticException("Errore: Divisione per zero.");
            }

            double kmPerLitro = kmPercorsi / litriConsumati;
            //int kmPerLitro = kmPercorsi / litriConsumati;
            System.out.println("Consumo (km/litro): " + kmPerLitro);


        } catch (ArithmeticException e) {

            System.out.println("Impossibile che i litri consumati siano 0.0");

        } finally {

            scanner.close();
        }


    }
}

