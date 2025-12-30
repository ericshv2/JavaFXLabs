import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.Random;

public class Magic8Ball extends Application {

    @Override
    public void start(Stage stage) {
        // Create ImageView with blank ball
        ImageView ballImage = new ImageView(new Image(getClass().getResourceAsStream("/8BallStates/blankBall.png")));
        
        // Create button
        Button askButton = new Button("Ask the Magic 8 Ball");
        askButton.setStyle("-fx-font-size: 16px; -fx-padding: 10px;");
        
        // Random number generator
        Random random = new Random();
        
        // Button action - show random answer
        askButton.setOnAction(e -> {
            int answer = random.nextInt(15) + 1;
            
            if (answer == 1) ballImage.setImage(new Image(getClass().getResourceAsStream("/8BallStates/#1.png")));
            else if (answer == 2) ballImage.setImage(new Image(getClass().getResourceAsStream("/8BallStates/#2.png")));
            else if (answer == 3) ballImage.setImage(new Image(getClass().getResourceAsStream("/8BallStates/#3.png")));
            else if (answer == 4) ballImage.setImage(new Image(getClass().getResourceAsStream("/8BallStates/#4.png")));
            else if (answer == 5) ballImage.setImage(new Image(getClass().getResourceAsStream("/8BallStates/#5.png")));
            else if (answer == 6) ballImage.setImage(new Image(getClass().getResourceAsStream("/8BallStates/#6.png")));
            else if (answer == 7) ballImage.setImage(new Image(getClass().getResourceAsStream("/8BallStates/#7.png")));
            else if (answer == 8) ballImage.setImage(new Image(getClass().getResourceAsStream("/8BallStates/#8.png")));
            else if (answer == 9) ballImage.setImage(new Image(getClass().getResourceAsStream("/8BallStates/#9.png")));
            else if (answer == 10) ballImage.setImage(new Image(getClass().getResourceAsStream("/8BallStates/#10.png")));
            else if (answer == 11) ballImage.setImage(new Image(getClass().getResourceAsStream("/8BallStates/#11.png")));
            else if (answer == 12) ballImage.setImage(new Image(getClass().getResourceAsStream("/8BallStates/#12.png")));
            else if (answer == 13) ballImage.setImage(new Image(getClass().getResourceAsStream("/8BallStates/#13.png")));
            else if (answer == 14) ballImage.setImage(new Image(getClass().getResourceAsStream("/8BallStates/#14.png")));
            else if (answer == 15) ballImage.setImage(new Image(getClass().getResourceAsStream("/8BallStates/#15.png")));
        });
        
        // Layout
        VBox root = new VBox(20);
        root.setAlignment(Pos.CENTER);
        root.getChildren().addAll(ballImage, askButton);
        root.setStyle("-fx-background-color: white; -fx-padding: 50;");
        
        Scene scene = new Scene(root, 400, 400);
        stage.setTitle("Magic 8 Ball");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}