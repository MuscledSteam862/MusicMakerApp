package sample;  //package sample

import javafx.application.Application; //imoprtowanie klas
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));  //getClass().getClassLoader().getResource("login/Login.fxml") - jest to możłiwa opcja ale na razie nie działa
        primaryStage.setTitle("Music Player");//ustawiabie tytułu aplikacji
        primaryStage.setScene(new Scene(root));
        primaryStage.show(); //pokazuej okno
    }



    public static void main(String[] args) {
        launch(args);
    }
}