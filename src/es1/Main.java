package es1;

public class Main {
    public static void main(String[] args) {

        Rettangolo rettangolo1 = new Rettangolo(20, 30);
        Rettangolo rettangolo2 = new Rettangolo(15, 45);
        Rettangolo rettangolo3 = new Rettangolo();

        rettangolo1.stampaRettangolo();
        rettangolo2.stampaRettangolo();

        rettangolo3.stampaDueRettangoli(rettangolo1, rettangolo2);

    }


}
