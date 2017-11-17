import utils.Contract;

import java.util.Scanner;

public class View {
    public View() {

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

    private void doSelectedOption(int selectedOption) {
        switch (selectedOption) {
            case Contract.MENU_OPTION_SHOW_BILLBOARD:
                break;

            case Contract.MENU_OPTION_SHOW_ROOMS:
                break;

            default:
                break;
        }
    }
}
