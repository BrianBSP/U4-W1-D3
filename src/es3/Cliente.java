package es3;

import java.util.Random;

public class Cliente {
    private int id;
    private String name;
    private String surname;
    private String email;
    private String registrationDate;

    public Cliente(String name, String surname, String email, String registrationDate) {
        Random random = new Random();
        this.id = random.nextInt(1, 110000);
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.registrationDate = registrationDate;
    }


    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + name + '\'' +
                ", cognome='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", data iscrizione='" + registrationDate + '\'' +
                '}';
    }
}
