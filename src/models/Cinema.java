package models;

import java.util.ArrayList;

public class Cinema {
    private Billboard billboard;
    private ArrayList<Room> rooms;

    public Cinema() {

    }

    public Billboard getBillboard() {
        return billboard;
    }

    public void setBillboard(Billboard billboard) {
        this.billboard = billboard;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    public void chargeInitialDataToCinema() {
        DatabaseManager database = new DatabaseManager();
        Billboard initialBillboard = new Billboard();

        ArrayList<Film> initialFilms = database.getInitialFilms();
        initialBillboard.setFilms(initialFilms);

        ArrayList<Room> rooms = database.getInitialRooms();

        this.setBillboard(initialBillboard);
        this.setRooms(rooms);
    }
}
