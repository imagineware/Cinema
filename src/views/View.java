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
        System.out.println("3. Añadir película");
    }

    private int takeUserInput() {
        int selectedOption = readUserInputInt();

        while(!checkInput(selectedOption)) {
            selectedOption = readUserInputInt();
        }

        return selectedOption;
    }

    private int readUserInputInt() {
        Scanner reader = new Scanner(System.in);
        int option = reader.nextInt();

        return option;
    }

    private String readUserInputString() {
        Scanner reader = new Scanner(System.in);
        String string = reader.nextLine();

        return string;
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

    private void addFilmToBillboard() {
        Film film = createFilmFromUserInput();
        cinema.getBillboard().getFilms().add(film);
    }

    private Film createFilmFromUserInput() {
        Film film = new Film();
        System.out.println("Introduce el título de la película:");
        String title = readUserInputString();
        film.setTitle(title);

        System.out.println("Introducir director:");
        String director = readUserInputString();
        film.setDirector(director);

        System.out.println("Introducir duración:");
        int minutes = readUserInputInt();
        film.setMinutes(minutes);

        System.out.println("Introducir edad mínima:");
        int certificate = readUserInputInt();
        film.setCertificate(certificate);

        film.setIs3D(false);

        return film;
    }

    private void doSelectedOption(int selectedOption) {
        switch (selectedOption) {
            case Contract.MENU_OPTION_SHOW_BILLBOARD:
                showBillboard();
                break;

            case Contract.MENU_OPTION_SHOW_ROOMS:
                showRooms();
                break;

            case Contract.MENU_OPTION_ADD_FILM:
                addFilmToBillboard();
                break;
            
            default:
                break;
        }
    }
}
