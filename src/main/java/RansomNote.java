import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class RansomNote extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a simple label
        Label label = new Label("Hello from RansomNote!");
        
        // Create a layout and add the label
        StackPane root = new StackPane();
        root.getChildren().add(label);
        
        // Create a scene
        Scene scene = new Scene(root, 400, 300);
        
        // Set up the stage
        primaryStage.setTitle("Ransom Note App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
