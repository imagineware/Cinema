import models.Cinema;
import models.DatabaseManager;
import views.View;

public class Main {

    public static void main(String[] args) {
        Cinema cinema = new Cinema();
        View view = new View(cinema);

        cinema.chargeInitialDataToCinema();
        while(true) {
            view.performUserOption();
        }
    }
}
