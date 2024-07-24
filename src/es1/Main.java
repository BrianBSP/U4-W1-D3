package es1;

public class Main {
    public static void main(String[] args) {

        Rettangolo rettangolo1 = new Rettangolo(20, 30);
        Rettangolo rettangolo2 = new Rettangolo(15, 45);
        

        rettangolo1.stampaRettangolo();
        rettangolo2.stampaRettangolo();

        Rettangolo.stampaDueRettangoli(rettangolo1, rettangolo2);

    }


}
