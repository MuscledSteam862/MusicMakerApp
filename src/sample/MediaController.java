package sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.media.MediaPlayer.Status;
import javafx.stage.FileChooser;
import javafx.stage.Window;
import javafx.util.Duration;

public class MediaController implements  Initializable{
    MediaPlayer player;
    @FXML
    private MediaView mediaView;
    @FXML
    private Button playBtn;
    @FXML
    private Button preBtn;
    @FXML
    private Button nextBtn;
    @FXML
    private Slider timeSlider;

    public MediaController() {
    }
    @FXML Slider volumeSlider;

    @FXML
    void openSongMenu(ActionEvent event) {
        try { //wyjątek try
            System.out.println("open song clicked"); //wypisywnaie do konsoli
            FileChooser chooser = new FileChooser(); //File chooser do wyborku pliku
            File file = chooser.showOpenDialog((Window)null);
            Media m = new Media(file.toURI().toURL().toString());//file.toURI() - tworzy plik: URI, który reprezentuje abstrakcyjną nazwę ścieżki, toURL -
            // Ta metoda nie powoduje automatycznego zmiany znaczenia znaków, które są niedozwolone w adresach URL.najpierw konwertując ją na URI za pomocą toURImetody, a następnie konwertując URI na adres URL za pomocą tej URI., toString() - usatwia jako String
            if (this.player != null) {
                this.player.dispose(); //Dispose () zwalnia te zasoby.
            }

            this.player = new MediaPlayer(m);
            this.mediaView.setMediaPlayer(this.player);//usatwienie mediaVeiw
            this.player.setOnReady(() -> { // -> (ta strzałka)t jedno z wyrażeń lambda, dzięki niej wizualniei obliczneiowo skaramy długosc naszych zmiennych tudzież metod
                this.timeSlider.setMin(0.0D);//usatwienie timieSlidera na czas wynoszący 0 i 0 , w jednostce double
                this.timeSlider.setMax(this.player.getMedia().getDuration().toMinutes());//konstruktot która wyznacza maksymalną długośc filmu na taka jak bedzei miał film i otrzymany on bedzie w minutach
                this.timeSlider.setValue(0.0D);

                try {
                    this.playBtn.setGraphic(new ImageView(new Image(new FileInputStream(""))));
                } catch (FileNotFoundException var2) {
                    var2.printStackTrace();
                }

            });
            this.player.currentTimeProperty().addListener(new ChangeListener<Duration>() {//klasa prywatna Animation.CurrentTimeProperty biorąca czas z komputera , idodaje go fo listy
                public void changed(ObservableValue<? extends Duration> observable, Duration oldValue, Duration newValue) {
                    Duration d = MediaController.this.player.getCurrentTime(); //duration d = czas trawanioa
                    MediaController.this.timeSlider.setValue(d.toMinutes());//ustawia wszytko na minuty
                }
            });
            this.timeSlider.valueProperty().addListener(new ChangeListener<Number>() {
                public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                    if (MediaController.this.timeSlider.isPressed()) {
                        double val = MediaController.this.timeSlider.getValue();
                        MediaController.this.player.seek(new Duration(val * 60.0D * 1000.0D));
                    }
                    //dodawanie paska - slidera to zmiany głośności
                    volumeSlider.setValue(player.getVolume() * 100); //pomnożone przez 100 dlatego że 100 to jest ustawiona maksymalna wartośc dźwięku
                    volumeSlider.valueProperty().addListener(new InvalidationListener() {
                        @Override
                        public void invalidated(Observable observable) {
                            player.setVolume(volumeSlider.getValue() /100); //dzielone przez 100 aby mozna było zmniejszać głoścność
                        }
                    });

                }

            });
        } catch (Exception var5) {
            var5.printStackTrace();
        }

    }

    @FXML
    void play(ActionEvent event) {
        try {
            Status status = this.player.getStatus();
            if (status == Status.PLAYING) {
                this.player.pause();
            } else {
                this.player.play();
            }
        } catch (Exception var3) {
            var3.printStackTrace();
        }

    }

    public void initialize(URL location, ResourceBundle resources) {


    }

    @FXML
    void preBtnClick(ActionEvent event) {
        double d = this.player.getCurrentTime().toSeconds(); //usatwienie czasu w sekundach
        d -= 10.0D;
        this.player.seek(new Duration(d * 1000.0D));
    }

    @FXML
    void nextBtnClick(ActionEvent event) {
        double d = this.player.getCurrentTime().toSeconds();//usatwienie czasu w sekundach
        d -= 10.0D;
        d += 10.0D;
        this.player.seek(new Duration(d * 1000.0D));
    }
    public void InfoAboutMedia(ActionEvent event) throws IOException {

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Informacje o Odtwarzaczu");
        alert.setHeaderText("VideoPlayer");
        alert.setContentText("Odtwarzacz powstał w celu oglądania filmów i słcuahnia muzyki. Miłego Oglądania ;)");
        System.out.println("VideoPlayer");
        alert.showAndWait();

    }
}
