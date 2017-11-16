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
}
