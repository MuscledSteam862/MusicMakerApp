package sample;

import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.FadeTransition;
import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.transform.Rotate;


public class Wyjdz implements Initializable{
    @FXML
    public Button Tak;
    public Button Nie;
    public ImageView yes;
    public ImageView no;

    @FXML
    public void Tak(ActionEvent event) {
        System.out.println("Wyłączono Aplikację");
        Platform.exit();
        System.exit(0);
    }

    @FXML
    public void Nie(ActionEvent event) throws IOException {
        String answer = "Nie";
        if(answer.equals("Nie")) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("NIe można opusić aplikacji");
            alert.setHeaderText("Aby opuśiciś aplikacje uruchom jeszcze raz program lub postraj się zamkną wszystkie okna dialogowe");
            alert.setContentText("Pozdrawiaja, Norbert Konefał i Adriaan Janeczko ;)");
            System.out.println("Wyświetlono Alert");
            alert.showAndWait();
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        RotateTransition rotate = new RotateTransition();
        rotate.setNode(yes);
        rotate.setDuration(javafx.util.Duration.millis(1000));//im mniej tym szybciej
        rotate.setCycleCount(TranslateTransition.INDEFINITE);
        rotate.setInterpolator(Interpolator.LINEAR);
        rotate.setByAngle(360);//kręci się do okoła
        rotate.setAxis(Rotate.Y_AXIS);//obracaie sie jak monety w grach - tych starych tak w jednej płaszycznie JESt X_AXIS, Y_AXIS i Z_AXIS - z do okoła siebie
        rotate.play();


        FadeTransition fade = new FadeTransition();
        fade.setNode(no);
        fade.setDuration(javafx.util.Duration.millis(1000));
        fade.setCycleCount(TranslateTransition.INDEFINITE);
        fade.setInterpolator(Interpolator.LINEAR);
        fade.setFromValue(0);//znika
        fade.setToValue(1);//pojawia się
        fade.play();

    }
}


