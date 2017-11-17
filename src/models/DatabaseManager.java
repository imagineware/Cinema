package models;

import utils.Contract;

import java.util.ArrayList;

public class DatabaseManager {

    public ArrayList<Film> getInitialFilms() {
        ArrayList<Film> films = new ArrayList<Film>();

        films.add(new Film("Harry Potter and the Sorcerer's Stone", 152, 7, "Chris Columbus", false));
        films.add(new Film("Cars", 117, 0, "John Lasseter", true));
        films.add(new Film("Inception", 148, 12, "Christopher Nolan", false));

        return films;
    }

    public ArrayList<Room> getInitialRooms() {
        ArrayList<Room> rooms = new ArrayList<Room>();

        rooms.add(new Room(Contract.ROOM_STATE_AVAILABLE, false, new ArrayList<Seat>()));
        rooms.add(new Room(Contract.ROOM_STATE_AVAILABLE, false, new ArrayList<Seat>()));
        rooms.add(new Room(Contract.ROOM_STATE_FAULT, true, new ArrayList<Seat>()));
        rooms.add(new Room(Contract.ROOM_STATE_AVAILABLE, false, new ArrayList<Seat>()));


        return rooms;
    }


}
