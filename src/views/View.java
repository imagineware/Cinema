package views;

import models.Cinema;
import models.Film;
import models.Room;
import utils.Contract;

import java.util.ArrayList;
import java.util.Scanner;

public class View {
    private Cinema cinema;

    public View(Cinema cinema) {
        this.cinema = cinema;
    }

    public void performUserOption() {
        showMenu();
        int selectedOption = takeUserInput();
        doSelectedOption(selectedOption);
    }

    private void showMenu() {
        System.out.println("1. Ver Cartelera");
        System.out.println("2. Ver Salas");
    }

    private int takeUserInput() {
        int selectedOption = readUserInput();

        while(!checkInput(selectedOption)) {
            selectedOption = readUserInput();
        }

        return selectedOption;
    }

    private int readUserInput() {
        Scanner reader = new Scanner(System.in);
        int option = reader.nextInt();

        return option;
    }

    private boolean checkInput(int option) {
        if (option < 10) {
            return true;
        } else {
            return false;
        }
    }

    private void showBillboard() {
        ArrayList<Film> films = getBillboardFilms();
        printBillboardFilms(films);
    }

    private ArrayList<Film> getBillboardFilms() {
        return cinema.getBillboard().getFilms();
    }

    private void printBillboardFilms(ArrayList<Film> films) {
        for (Film film: films) {
            System.out.println(film.getTitle());
        }
    }

    private void showRooms() {
        ArrayList<Room> rooms = cinema.getRooms();
        printRooms(rooms);
    }

    private void printRooms(ArrayList<Room> rooms) {
        for (Room room: rooms) {
            System.out.println("Sala " + room.getId());
        }
    }

    private void doSelectedOption(int selectedOption) {
        switch (selectedOption) {
            case Contract.MENU_OPTION_SHOW_BILLBOARD:
                showBillboard();
                break;

            case Contract.MENU_OPTION_SHOW_ROOMS:
                showRooms();
                break;

            default:
                break;
        }
    }
}
