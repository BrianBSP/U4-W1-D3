package es2;

import java.util.ArrayList;
import java.util.List;

public class Sim {
    private String numeroTelefonico;
    private double credito;
    private List<Chiamata> listaChiamate;

    public Sim(String numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
        this.credito = 0;
        this.listaChiamate = new ArrayList<>();
    }
    

}
