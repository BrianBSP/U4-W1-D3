package es3;

import java.util.Random;

public class Articolo {
    private final int id;
    private String description;
    private double price;
    private int availability;

    // Costruttori
    public Articolo(String description, double price, int availability) {
        Random random = new Random();
        this.id = random.nextInt(1, 100000);
        this.description = description;
        this.price = price;
        this.availability = availability;
    }

    public int getId() {
        return id;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Articolo{" +
                "id=" + id +
                ", descrizione='" + description + '\'' +
                ", prezzo=" + price +
                ", pezzi disponibili=" + availability +
                '}';
    }
}



