import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class RansomNote extends Application {

    @Override
    public void start(Stage stage) {
        Text word1 = new Text("BRING");
        word1.setFont(Font.loadFont(getClass().getResourceAsStream("/Fonts/Candy Planet.ttf"), 40));
        word1.setFill(Color.RED);

        Text word2 = new Text("THE");
        word2.setFont(Font.loadFont(getClass().getResourceAsStream("/Fonts/OldLondon.ttf"), 45));
        word2.setFill(Color.BLUE);

        Text word3 = new Text("COOKIES");
        word3.setFont(Font.loadFont(getClass().getResourceAsStream("/Fonts/Cowboy Movie.ttf"), 38));
        word3.setFill(Color.GREEN);

        Text word4 = new Text("NOW");
        word4.setFont(Font.loadFont(getClass().getResourceAsStream("/Fonts/28 Days Later.ttf"), 42));
        word4.setFill(Color.PURPLE);

        VBox root = new VBox(10);
        root.getChildren().addAll(word1, word2, word3, word4);
        root.setStyle("-fx-background-color: white; -fx-padding: 50;");

        Scene scene = new Scene(root, 280, 300);
        stage.setTitle("Ransom Note");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}