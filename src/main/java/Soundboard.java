import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Soundboard extends Application {
    public void start(Stage stage) {
        Pane root = new Pane();
        root.setStyle("-fx-background-color: white;");

        // Title
        Label title = new Label("Goat Soundboard");
        title.setFont(Font.loadFont(getClass().getResourceAsStream("/Fonts/28 Days Later.ttf"), 35.67));
        title.setLayoutX(250);
        title.setLayoutY(20);

        // Create 6 buttons with labels
        createButton(root, "Pink", 30, 80, "/SoundboardAssets/Sounds/Gop.mp3", "Gop");
        createButton(root, "Orange", 260, 80, "/SoundboardAssets/Sounds/TacoBell.mp3", "Taco Bell");
        createButton(root, "Purple", 490, 80, "/SoundboardAssets/Sounds/Song.mp3", "Song");
        createButton(root, "Blue", 30, 260, "/SoundboardAssets/Sounds/Ekh.mp3", "Ekh");
        createButton(root, "Red", 260, 260, "/SoundboardAssets/Sounds/FBI.mp3", "FBI");
        createButton(root, "Green", 490, 260, "/SoundboardAssets/Sounds/67.mp3", "67");

        root.getChildren().add(title);

        Scene scene = new Scene(root, 720, 450);
        stage.setTitle("Soundboard");
        stage.setScene(scene);
        stage.show();
    }

    private void createButton(Pane pane, String color, int x, int y, String soundPath, String labelText) {
        // Load unpressed and pressed images
        Image unpressed = new Image(getClass().getResourceAsStream("/SoundboardAssets/Buttons/" + color + "UnpressedState.png"));
        Image pressed = new Image(getClass().getResourceAsStream("/SoundboardAssets/Buttons/" + color + "PressedState.png"));
        
        ImageView buttonView = new ImageView(unpressed);
        buttonView.setX(x);
        buttonView.setY(y);
        buttonView.setFitWidth(200); // Makes them smaller
        buttonView.setFitHeight(125);
        
        // Create label below button
        Label label = new Label(labelText);
        label.setFont(new Font("Arial", 16));
        label.setLayoutX(x + 70);
        label.setLayoutY(y + 130);
        
        // Load sound
        Media sound = new Media(getClass().getResource(soundPath).toString());
        
        // Mouse pressed - change to pressed image and play sound
        buttonView.setOnMousePressed(e -> {
            buttonView.setImage(pressed);
            MediaPlayer player = new MediaPlayer(sound);
            player.play();
        });
        
        // Mouse released - change back to unpressed image
        buttonView.setOnMouseReleased(e -> {
            buttonView.setImage(unpressed);
        });
        
        pane.getChildren().addAll(buttonView, label);
    }

    public static void main(String[] args) {
        launch(args);
    }
}