package models;

import java.util.ArrayList;

public class Billboard {
    private ArrayList<Film> films;

    public Billboard() {

    }

    public ArrayList<Film> getFilms() {
        return films;
    }

    public void setFilms(ArrayList<Film> films) {
        this.films = films;
    }
}
