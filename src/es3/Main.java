package es3;

public class Main {
    public static void main(String[] args) {
        Articolo iPhone = new Articolo("Cellulare", 900, 10);
        Articolo MacBook = new Articolo("Laptop", 1800, 4);
        Articolo iPad = new Articolo("ProMax", 1200, 15);
        Articolo AppleWatch = new Articolo("Watch5", 400, 5);

        Cliente cliente1 = new Cliente("Aldo", "Baglio", "aldo.baglio@example.com", "24-07-2024");
        Cliente cliente2 = new Cliente("Giovanni", "Storti", "giovanni.storti@example.com", "22-07-2024");
        Cliente cliente3 = new Cliente("Giacomo", "Poretti", "giacomo.poretti@example.com", "20-07-2024");

        Articolo[] articoliCarrello = {iPad, iPhone, MacBook};
        Carrello carrello1 = new Carrello(cliente1, articoliCarrello);

        System.out.println("------CLIENTE--------\n" + cliente1);
        System.out.println("\n" + carrello1);

    }
}

