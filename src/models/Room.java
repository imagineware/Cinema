package models;

import java.util.ArrayList;

public class Room {
    private int state;
    private int id;
    private boolean is3D;
    private ArrayList<Seat> seats;
    private static int numberOfRooms = 0;

    public Room() {

    }

    public Room(int state, boolean is3D, ArrayList<Seat> seats) {
        this.state = state;
        this.is3D = is3D;
        this.seats = seats;
        this.id = numberOfRooms++;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        id = id;
    }

    public boolean is3D() {
        return is3D;
    }

    public void setIs3D(boolean is3D) {
        this.is3D = is3D;
    }

    public ArrayList<Seat> getSeats() {
        return seats;
    }

    public void setSeats(ArrayList<Seat> seats) {
        this.seats = seats;
    }
}
