import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Plaid extends Application {

    public void start(Stage stage) {
        Pane root = new Pane();
        root.setStyle("-fx-background-color: white;");
        
        // Vertical stripes - Navy (thin 10px)
        root.getChildren().add(new Rectangle(100, 0, 10, 600) {{ setFill(Color.NAVY); }});
        root.getChildren().add(new Rectangle(250, 0, 10, 600) {{ setFill(Color.NAVY); }});
        root.getChildren().add(new Rectangle(400, 0, 10, 600) {{ setFill(Color.NAVY); }});
        root.getChildren().add(new Rectangle(550, 0, 10, 600) {{ setFill(Color.NAVY); }});
        root.getChildren().add(new Rectangle(700, 0, 10, 600) {{ setFill(Color.NAVY); }});
        
        // Vertical stripes - Red (medium 25px)
        root.getChildren().add(new Rectangle(35, 0, 25, 600) {{ setFill(Color.RED); }});
        root.getChildren().add(new Rectangle(140, 0, 25, 600) {{ setFill(Color.RED); }});
        root.getChildren().add(new Rectangle(290, 0, 25, 600) {{ setFill(Color.RED); }});
        root.getChildren().add(new Rectangle(440, 0, 25, 600) {{ setFill(Color.RED); }});
        root.getChildren().add(new Rectangle(590, 0, 25, 600) {{ setFill(Color.RED); }});
        root.getChildren().add(new Rectangle(720, 0, 25, 600) {{ setFill(Color.RED); }});
        
        // Vertical stripes - Grey (thick 30px)
        root.getChildren().add(new Rectangle(180, 0, 30, 600) {{ setFill(Color.GREY); }});
        root.getChildren().add(new Rectangle(330, 0, 30, 600) {{ setFill(Color.GREY); }});
        root.getChildren().add(new Rectangle(480, 0, 30, 600) {{ setFill(Color.GREY); }});
        root.getChildren().add(new Rectangle(630, 0, 30, 600) {{ setFill(Color.GREY); }});
        
        // Horizontal stripes - Navy (thin 10px)
        root.getChildren().add(new Rectangle(0, 100, 800, 10) {{ setFill(Color.NAVY); }});
        root.getChildren().add(new Rectangle(0, 250, 800, 10) {{ setFill(Color.NAVY); }});
        root.getChildren().add(new Rectangle(0, 400, 800, 10) {{ setFill(Color.NAVY); }});
        
        // Horizontal stripes - Red (medium 25px)
        root.getChildren().add(new Rectangle(0, 140, 800, 25) {{ setFill(Color.RED); }});
        root.getChildren().add(new Rectangle(0, 290, 800, 25) {{ setFill(Color.RED); }});
        root.getChildren().add(new Rectangle(0, 440, 800, 25) {{ setFill(Color.RED); }});
        
        // Horizontal stripes - Grey (thick 50px)
        root.getChildren().add(new Rectangle(0, 30, 800, 50) {{ setFill(Color.GREY); }});
        root.getChildren().add(new Rectangle(0, 180, 800, 50) {{ setFill(Color.GREY); }});
        root.getChildren().add(new Rectangle(0, 330, 800, 50) {{ setFill(Color.GREY); }});
        root.getChildren().add(new Rectangle(0, 480, 800, 50) {{ setFill(Color.GREY); }});
        root.getChildren().add(new Rectangle(0, 580, 800, 50) {{ setFill(Color.GREY); }});
        
        Scene scene = new Scene(root, 800, 600);
        stage.setTitle("Plaid Pattern");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}