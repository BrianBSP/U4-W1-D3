package es2;

public class Chiamata {
    private String numeroChiamato;
    private int durata;

    // Costruttore
    public Chiamata(String numeroChiamato, int durata) {
        this.numeroChiamato = numeroChiamato;
        this.durata = durata;
    }

    // Metodi
    // Numeri chiamati
    public String getNumeroChiamato() {
        return numeroChiamato;
    }

    // durata della telefonata
    public int getDurata() {
        return durata;
    }

    @Override
    public String toString() {
        return "Chiamata{" +
                "Numero Chiamato='" + numeroChiamato + '\'' +
                ", durata= " + durata + " minuti" +
                '}';
    }
}
