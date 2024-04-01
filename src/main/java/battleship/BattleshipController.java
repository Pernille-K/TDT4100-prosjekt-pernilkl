package battleship;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class BattleshipController {

    @FXML
    private GridPane userGrid;

    public void handleUserButtonClick(ActionEvent event) {
        Button button = (Button) event.getSource();
        button.setStyle("-fx-background-color: gray;");

        int clickedRow = GridPane.getRowIndex(button);
        int clickedCol = GridPane.getColumnIndex(button);
        int adjacentRow = clickedRow;
        int adjacentCol = clickedCol + 1;

        Button adjacentButton = null;
        for (Node node : userGrid.getChildren()) {
            if (GridPane.getRowIndex(node) == adjacentRow && GridPane.getColumnIndex(node) == adjacentCol && node instanceof Button) {
                adjacentButton = (Button) node;
                break;
            }
        }
        if (adjacentButton != null) {
            adjacentButton.setStyle("-fx-background-color: red;");
        }
    }

     public void handleOpponentButtonClick(ActionEvent event) {
        Button button = (Button) event.getSource();
        button.setStyle("-fx-background-color: gray;");
        if (button.getStyle().contains("-fx-background-color: gray;")) {
            button.setStyle("-fx-background-color: black;");
        }
        else {
           button.setStyle("-fx-background-color: red;");
        }
    }

    public void isActive() {

    }



}
