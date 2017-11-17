package models;

import java.util.ArrayList;

public class DatabaseManager {

    public ArrayList<Film> getFilms() {
        ArrayList<Film> films = new ArrayList<Film>();

        films.add(new Film("Harry Potter and the Sorcerer's Stone", 152, 7, "Chris Columbus", false));
        films.add(new Film("Cars", 117, 0, "John Lasseter", true));
        films.add(new Film("Inception", 148, 12, "Christopher Nolan", false));

        return films;
    }

    public Billboard getBillboard(ArrayList<Film> films) {
        Billboard billboard = new Billboard();

        billboard.setFilms(films);

        return billboard;
    }
}
