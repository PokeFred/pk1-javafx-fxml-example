package de.pokefred.app;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    @FXML
    private Label myText;
    private int counter;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        myText.setText("Hello World (" + counter + ")");
    }

    @FXML
    public void buttonClick(ActionEvent event) {
        counter++;
        myText.setText("Hello World (" + counter + ")");
    }
}
