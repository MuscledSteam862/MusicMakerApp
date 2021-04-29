package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import java.io.File;
public class MusicCreator {


    @FXML
    private void playSound1(ActionEvent event) {

        String path = "D:\\Projekt_Aplikacja_Okienkowa\\sounds\\sound1.wav";
        Media media = new Media(new File(path).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();


    }

    @FXML
    private void playSound2(ActionEvent event) {

        String path = "D:\\Projekt_Aplikacja_Okienkowa\\sounds\\sound2.wav";
        Media media = new Media(new File(path).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();

    }

    @FXML
    private void playSound3(ActionEvent event) {

        String path = "D:\\Projekt_Aplikacja_Okienkowa\\sounds\\sound3.wav";
        Media media = new Media(new File(path).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
    }


    @FXML
    private void playSound4(ActionEvent event) {

        String path = "D:\\Projekt_Aplikacja_Okienkowa\\sounds\\sound4.wav";
        Media media = new Media(new File(path).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();

    }

    @FXML
    private void playSound5(ActionEvent event) {

        String path = "D:\\Projekt_Aplikacja_Okienkowa\\sounds\\sound5.mp3";
        Media media = new Media(new File(path).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();

    }

    @FXML
    private void playSound6(ActionEvent event) {

        String path = "D:\\Projekt_Aplikacja_Okienkowa\\sounds\\sound3.wav";
        Media media = new Media(new File(path).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
        mediaPlayer.setCycleCount(100);


    }


    @FXML
    private void playSound7(ActionEvent event) {

        String path = "D:\\Projekt_Aplikacja_Okienkowa\\sounds\\sound1.wav";
        Media media = new Media(new File(path).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
        mediaPlayer.setCycleCount(100);
    }


    @FXML
    private void playSound8(ActionEvent event) {

        String path = "D:\\Projekt_Aplikacja_Okienkowa\\sounds\\sound2.wav";
        Media media = new Media(new File(path).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
        mediaPlayer.setCycleCount(100);
    }


    @FXML
    private void playSound9(ActionEvent event) {

        String path = "D:\\Projekt_Aplikacja_Okienkowa\\sounds\\sound4.wav";
        Media media = new Media(new File(path).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
        mediaPlayer.setCycleCount(100);
    }

}
