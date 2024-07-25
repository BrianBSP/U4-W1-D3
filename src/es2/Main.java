package es2;

public class Main {
    public static void main(String[] args) {
        Sim sim1 = new Sim("320987");
        Chiamata call1 = new Chiamata("3209", 2);
        Chiamata call2 = new Chiamata("3209", 1);
        Chiamata call3 = new Chiamata("3209", 5);
        Chiamata call4 = new Chiamata("3209", 20);
        Chiamata call5 = new Chiamata("3209", 4);

        Chiamata[] ultimeChiamate = {call1, call2, call3, call4, call5};

        sim1.setChiamate(ultimeChiamate);
        sim1.stampaSim();
    }
}