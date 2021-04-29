package sample; //package sample


import javafx.animation.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;


public class Controller implements  Initializable { //Initializable  - Interfejs inicjalizacji kontrolera.Ten interfejs został zastąpiony przez automatyczne wstawianie właściwości locationi resourcesdo kontrolera. FXMLLoaderbędzie teraz automatycznie wywoływać dowolną initialize()metodę bezargumentową z adnotacjami zdefiniowaną przez kontroler. Zaleca się, aby w miarę możliwości stosować metodę iniekcji.
    @FXML //inicjaja pol
    public  ImageView myImageView;
    @FXML
    public AnchorPane root;
    @FXML
    TextArea pole;
    @FXML
    Button Start;
    @FXML
    Button Mp4Player;
    @FXML
    Button MusicCreator;
    @FXML
    Button Wyjdz;
    @FXML
    Button hunter;
    @FXML
    Button NK;
    @FXML
    Button AJ;


    @FXML
    public void Info(ActionEvent event) throws IOException { //nowa metoda , kótra otwerta okno po naciśnięciu przycisku otwera się nowe okno
        System.out.println("zaczynamy");
        Stage Mp4Player = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("Info.fxml"));
        Mp4Player.setTitle("Info.FXML");
        Mp4Player.setScene(new Scene(root, 780,440));
        Mp4Player.showAndWait();
        System.out.println("Info.FXML");
    }
    @FXML
    public void MediaController(ActionEvent event) throws IOException {//nowa metoda
        System.out.println("zaczynamy");
        Stage Mp4Player = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("MediaController.FXML"));
        Mp4Player.setTitle("MediaController.FXML");
        Mp4Player.setScene(new Scene(root, 900,700));
        Mp4Player.showAndWait();
        System.out.println("MediaController.FXML");
    }
    @FXML
    public void MusicCreator(ActionEvent event) throws IOException {//nowa metoda
        System.out.println("zaczynamy");
        Stage MusicCreator = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("MusicCreator.FXML"));
        MusicCreator.setTitle("MusicCreator");
        MusicCreator.setScene(new Scene(root, 900,700));
        MusicCreator.showAndWait();
        System.out.println("MusicCreator");
    }
    @FXML
    public void Wyjdz(ActionEvent event)throws IOException{//nowa metoda
        System.out.println("zaczynamy");
        Stage Wyjdz = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("Wyjdz.FXML"));
        Wyjdz.setTitle("Wyjdz.FXML");
        Wyjdz.setScene(new Scene(root, 900,500));
        Wyjdz.showAndWait();
        System.out.println("Wyjdz.FXML");
    }
    public void NK(ActionEvent event) throws IOException {//nowa metoda
        System.out.println("zaczynamy");

            Alert alert = new Alert(Alert.AlertType.INFORMATION); //wyskacza alert informacyjny
            alert.setTitle("Informacje o Autorze");
            alert.setHeaderText("Norbert Konefał KL.2BT");
            alert.setContentText("Autor uczy się zawodu w Zespole Szkół im. ks. Stanisława Staszica w Tarnobrzegu na kierunku Technik Programista");
            System.out.println("Autor: Norbert Konefał");
            alert.showAndWait();

    }
    public void AJ(ActionEvent event) throws IOException {//nowa metoda
        System.out.println("zaczynamy");

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Informacje o Autorze");
        alert.setHeaderText("Adrian Janeczko KL.2BT");
        alert.setContentText("Autor uczy się zawodu w Zespole Szkół im. ks. Stanisława Staszica w Tarnobrzegu na kierunku Technik Programista");
        System.out.println("Autor: Norbert Konefał");
        alert.showAndWait();

    }


    @FXML
    private ImageView klapkaImage;
    @FXML
    private ImageView nutka1;
    @FXML
    private ImageView nutka2;
    @FXML
    private ImageView nutka3;
    @FXML
    private ImageView nutka4;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //Animacje - różne rodzaje
        /*TranslateTransition translate = new TranslateTransition();
        translate.setNode(klapkaImage);
        translate.setDuration(Duration.millis(1000)); //opóżnienie w milisekundach
        translate.setCycleCount(TranslateTransition.INDEFINITE);//ile razy bedzie robił ruch //INDEFINITE - w nieeskońcoznosć
        translate.setByX(250);//ruch po osi X
        translate.setByY(-250);//ruch po osi Y
        translate.setAutoReverse(true);//robi ruch w prawo i wpraca do głwonego miesjca
        translate.play();*/


        //rotate
        RotateTransition rotate = new RotateTransition();
        rotate.setNode(klapkaImage); // podanie zmiennej która odpoiwada za okreslone zdjęcie
        rotate.setDuration(Duration.millis(1000));//im mniej tym szybciej, liczone w milisekundach
        rotate.setCycleCount(TranslateTransition.INDEFINITE); //liczba powtarzań, obrotów wybosi nieskończoność
        rotate.setInterpolator(Interpolator.LINEAR);//Interpolacja liniowa – za pomocą funkcji liniowej jest najprostszym sposobem przybliżenia dowolnej funkcji f
        rotate.setByAngle(360);//kręci się do okoła
        rotate.setAxis(Rotate.Y_AXIS);//obracaie sie jak monety w grach - tych starych tak w jednej płaszycznie JESt X_AXIS, Y_AXIS i Z_AXIS - z do okoła siebie
        rotate.play(); //wywołąniemetody, animacja gra

        rotate = new RotateTransition();
        rotate.setNode(nutka1);
        rotate.setDuration(Duration.millis(1000));//im mniej tym szybciej
        rotate.setCycleCount(TranslateTransition.INDEFINITE);
        rotate.setInterpolator(Interpolator.LINEAR);
        rotate.setByAngle(360);//kręci się do okoła
        rotate.setAxis(Rotate.Y_AXIS);//obracaie sie jak monety w grach - tych starych tak w jednej płaszycznie JESt X_AXIS, Y_AXIS i Z_AXIS - z do okoła siebie
        rotate.play();

        rotate = new RotateTransition();
        rotate.setNode(nutka2);
        rotate.setDuration(Duration.millis(1000));//im mniej tym szybciej
        rotate.setCycleCount(TranslateTransition.INDEFINITE);
        rotate.setInterpolator(Interpolator.LINEAR);
        rotate.setByAngle(360);//kręci się do okoła
        rotate.setAxis(Rotate.Y_AXIS);//obracaie sie jak monety w grach - tych starych tak w jednej płaszycznie JESt X_AXIS, Y_AXIS i Z_AXIS - z do okoła siebie
        rotate.play();

        rotate = new RotateTransition();
        rotate.setNode(nutka3);
        rotate.setDuration(Duration.millis(1000));//im mniej tym szybciej
        rotate.setCycleCount(TranslateTransition.INDEFINITE);
        rotate.setInterpolator(Interpolator.LINEAR);
        rotate.setByAngle(360);//kręci się do okoła
        rotate.setAxis(Rotate.Y_AXIS);//obracaie sie jak monety w grach - tych starych tak w jednej płaszycznie JESt X_AXIS, Y_AXIS i Z_AXIS - z do okoła siebie
        rotate.play();

        rotate = new RotateTransition();
        rotate.setNode(nutka4);
        rotate.setDuration(Duration.millis(1000));//im mniej tym szybciej
        rotate.setCycleCount(TranslateTransition.INDEFINITE);
        rotate.setInterpolator(Interpolator.LINEAR);
        rotate.setByAngle(360);//kręci się do okoła
        rotate.setAxis(Rotate.Y_AXIS);//obracaie sie jak monety w grach - tych starych tak w jednej płaszycznie JESt X_AXIS, Y_AXIS i Z_AXIS - z do okoła siebie
        rotate.play();
        //fade
        /*
        FadeTransition fade = new FadeTransition();
        fade.setNode(klapkaImage);
        fade.setDuration(Duration.millis(1000));
        fade.setCycleCount(TranslateTransition.INDEFINITE);
        fade.setInterpolator(Interpolator.LINEAR);
        fade.setFromValue(0);//znika
        fade.setToValue(1);//pojawia się
        fade.play();*/

        //scale
        /*
        ScaleTransition scale= new ScaleTransition();
        scale.setNode(klapkaImage);
        scale.setDuration(Duration.millis(1000));
        scale.setCycleCount(TranslateTransition.INDEFINITE);
        scale.setInterpolator(Interpolator.LINEAR);
        scale.setByX(2.0);//poszerza sie i zwęrza
        scale.setByY(2.0);//powiększa sie i zmniejsza
        scale.setAutoReverse(true);
        scale.play();*/
    }
}
