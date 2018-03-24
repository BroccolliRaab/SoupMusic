package FutureSoup.SoupMusic;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.File;


public class Main extends Application {
    public static final String TITLE = "SoupMusic";
    public static final int DEFAULT_WIDTH = 900;
    public static final int DEFAULT_HEIGHT = 500;

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        //primaryStage.setScene(new Scene(root, DEFAULTWIDTH, DEFAULTHEIGHT));

        //BorderPane is a layout with a center, top, bottom, left, and right
         //Left will have selection of by what to sort: Contr. Artist, Album Artist, Album, Genres, Years, Composers, ECT
        BorderPane mainPane = new BorderPane();

        Scene mainScene = new Scene(mainPane, DEFAULT_WIDTH, DEFAULT_HEIGHT);

        primaryStage.setScene(mainScene);

        mainScene.getStylesheets().add("FutureSoup/SoupMusic/resources/style.css");

        primaryStage.setTitle(TITLE);

        HBox controls = new HBox();

        VBox bodyV = new VBox();

        bodyV.setId("bodyVBox");

        mainPane.setCenter(bodyV);

        VBox leftPane = new VBox();
        VBox queuePane = new VBox();

        leftPane.setPadding(new Insets(10, 5, 0, 5));
        leftPane.setId("leftPane");

        leftPane.setPrefWidth(240);

        HBox infoPane = new HBox();
        infoPane.setPadding(new Insets(0, 0, 0, 0));
        infoPane.setId("infoPane");

        VBox textInfoPane = new VBox();
        textInfoPane.setPadding(new Insets(0, 0, 0, 5));
        textInfoPane.setId("textInfoPane");

        //||||| This is just Temp to get idea of visuals
        //VVVVV
        Image imageAlbumArt = new Image(getClass().getResourceAsStream("resources/images/albumArtDef.png"), 100, 100, true, true);
        ImageView imageViewAlbumArt = new ImageView(imageAlbumArt);
        infoPane.getChildren().addAll(imageViewAlbumArt, textInfoPane);

        //Label artistLabel = new Label("Artist Name");

        Text artistLabel = new Text();
        artistLabel.setText("Artist Name");
        artistLabel.setId("infoText");
        //Label songLabel = new Label("Song Name");

        Text songLabel = new Text();
        songLabel.setText("Song Name");
        songLabel.setId("infoText");

        Text albumLabel = new Text();
        albumLabel.setText("Album Name");
        albumLabel.setId("infoText");

        Text yearLabel = new Text();
        yearLabel.setText("Year");
        yearLabel.setId("infoText");

        Text genreLabel = new Text();
        genreLabel.setText("Genre");
        genreLabel.setId("infoText");

        textInfoPane.getChildren().addAll( songLabel, artistLabel, albumLabel, yearLabel, genreLabel);

        queuePane.setPadding(new Insets(0, 0, 0, 0));
        queuePane.setId("queuePane");
        leftPane.getChildren().addAll(infoPane, queuePane);

        mainPane.setLeft(leftPane);

        controls.setPadding(new Insets(0,0,0,0));
        controls.setId("controlsBar");
        controls.setSpacing(10);
        controls.setAlignment(Pos.CENTER);
        controls.setMaxHeight(40);
        //controls.setFillHeight(true);

        PlayPauseButton playPauseButton = new PlayPauseButton(0);
        playPauseButton.setId("playButton");

        SkipButton forwardSkip = new SkipButton(SkipButton.FORWARD);
        forwardSkip.setId("forwardSkip");

        SkipButton backwardSkip = new SkipButton(SkipButton.BACKWARD);
        backwardSkip.setId("backwardSkip");





        controls.getChildren().addAll(backwardSkip, playPauseButton, forwardSkip);

        mainPane.setBottom(controls);

        primaryStage.show();
        
    }


    public static void main(String[] args) {
        launch(args);
    }
}
