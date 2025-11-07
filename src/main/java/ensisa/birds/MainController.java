package ensisa.birds;

import java.io.IOException;
import javafx.fxml.FXML;
import ensisa.birds.model.BirdRepository;

public class MainController {
    private BirdRepository repository;

    public MainController() {
        repository = new BirdRepository();
        repository.load();
    }
}