package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Label;
import java.net.URL;
import java.util.ResourceBundle;


public class Info  implements Initializable { //implementacja interfejsu
    @FXML
    public Label lblStatus;
    @FXML
    public PasswordField txtpassword;


    public void initialize(URL location, ResourceBundle resources) {

    }
    @FXML
    public void zatwierdz(ActionEvent event) {
        if (txtpassword.getText().equals("pasjonat")) {
            lblStatus.setText("Ogadłeś Hasło, Hasło to: pasjonat");
        }else{
            lblStatus.setText("Niepoprawne hasło");
        }
    }
}
