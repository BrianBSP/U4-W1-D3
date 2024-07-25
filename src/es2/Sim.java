package es2;

import java.util.Arrays;

// Classe
public class Sim {
    public Chiamata[] chiamate;
    private String numeroTelefonico;
    private double credito;

    // Costruttore
    public Sim(String numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
        this.credito = 0;
        this.chiamate = new Chiamata[5];
    }

    // Metodi
    public void stampaSim() {
        System.out.println("Il numero della sim è: " + this.numeroTelefonico);
        System.out.println("Il credito della sim è: " + this.credito);
        System.out.println("Le ultime 5 chiamate effettuate: " + Arrays.toString(chiamate));

    }

    public void setChiamate(Chiamata[] chiamate) {
        this.chiamate = chiamate;
    }
}
