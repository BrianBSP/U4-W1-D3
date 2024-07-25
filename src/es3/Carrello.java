package es3;

import java.util.Arrays;

public class Carrello {
    public Cliente clienteAssociato;
    public Articolo[] elencoArticoli;
    public double totPrice;

    public Carrello(Cliente clienteAssociato, Articolo[] elencoArticoli) {
        this.clienteAssociato = clienteAssociato;
        this.elencoArticoli = elencoArticoli;
        this.totPrice = getTotPrezzoCarrello();
    }

    public Cliente getClienteAssociato() {
        return clienteAssociato;
    }

    public Articolo[] getElencoArticoli() {
        return elencoArticoli;
    }

    public double getTotPrice() {
        return totPrice;
    }


    private double getTotPrezzoCarrello() {
        double tot = 0;
        for (Articolo art : elencoArticoli) {
            tot += art.getPrice();
        }
        return tot;
    }

    @Override
    public String toString() {
        return "------Carrello----------{" +
                "clienteAssociato=" + clienteAssociato +
                ", elencoArticoli=" + Arrays.toString(elencoArticoli) +
                ", totPrice=" + totPrice +
                '}';
    }
}
