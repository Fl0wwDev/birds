package ensisa.birds;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class BirdApplication extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
    // resources are located under /birds/ensisa in src/main/resources
    FXMLLoader fxmlLoader = new FXMLLoader(
        BirdApplication.class.getResource("/birds/ensisa/main-view.fxml"));
    scene = new Scene(fxmlLoader.load(), 800, 600);
        stage.setTitle("Des oiseaux");
        stage.setScene(scene);
        stage.show();
    } 

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
    FXMLLoader fxmlLoader = new FXMLLoader(BirdApplication.class.getResource("/birds/ensisa/" + fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}