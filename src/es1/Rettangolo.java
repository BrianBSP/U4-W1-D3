package es1;

public class Rettangolo {
    // Attributi
    private double base;
    private double altezza;

    // Costruttori
    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    // 2° consegna
    public static void stampaDueRettangoli(Rettangolo rettangolo1, Rettangolo rettangolo2) {

        System.out.println("Rettangolo 1: ");
        rettangolo1.stampaRettangolo();
        System.out.println("rettangolo 2: ");
        rettangolo2.stampaRettangolo();

        double sommaPerimetri = rettangolo1.getPerimetro() + rettangolo2.getPerimetro();
        double sommaAree = rettangolo1.getArea() + rettangolo2.getArea();

        System.out.println("Somma dei perimetri: " + sommaPerimetri);
        System.out.println("Somma delle aree: " + sommaAree);

    }

    // Metodi
    // Calcola perimetro
    public double getPerimetro() {
        return (base + altezza) * 2;
    }

    // Calcola area
    public double getArea() {
        return base * altezza;
    }

    // 1° consegna
    public void stampaRettangolo() {
        System.out.println("Metodo stampaRettangolo: ");
        System.out.println("Perimetro: " + getPerimetro());
        System.out.println("Area: " + getArea());
    }
}
