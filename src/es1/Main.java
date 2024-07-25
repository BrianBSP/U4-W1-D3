package es1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Primo rettangolo: ");
        System.out.println("Inserisci la base: ");
        double base1 = Double.parseDouble(scanner.nextLine());
        System.out.println("Inserisci l'altezza: ");
        double altezza1 = Double.parseDouble(scanner.nextLine());

        System.out.println("Secondo rettangolo: ");
        System.out.println("Inserisci la base: ");
        double base2 = Double.parseDouble(scanner.nextLine());
        System.out.println("Inserisci l'altezza: ");
        double altezza2 = Double.parseDouble(scanner.nextLine());

        Rettangolo rettangolo1 = new Rettangolo(base1, altezza1);
        Rettangolo rettangolo2 = new Rettangolo(base2, altezza2);


        rettangolo1.stampaRettangolo();
        rettangolo2.stampaRettangolo();

        Rettangolo.stampaDueRettangoli(rettangolo1, rettangolo2);

    }


}
