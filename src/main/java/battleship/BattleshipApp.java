package battleship;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class BattleshipApp extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        primaryStage.setTitle("Battleship"); //setter tittel på vinduet
        primaryStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("App.fxml")))); //sier at appen skal bruke "App.fxml"
        primaryStage.show(); //viser vinduet 
    }
}
