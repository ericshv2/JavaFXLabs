import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ParallaxScroll extends Application {

    @Override
    public void start(Stage stage) {
        Pane root = new Pane();
        
        // Load images (4 layers)
        Image bgImage = new Image(getClass().getResourceAsStream("/Scrolling BG.jpg"));
        Image cloudsImage = new Image(getClass().getResourceAsStream("/Clouds For Scrolling BG.png"));
        Image buildingsImage = new Image(getClass().getResourceAsStream("/Buildings For Scrolling BG.png"));
        Image grassImage = new Image(getClass().getResourceAsStream("/Grass For Scrolling BG.png"));
        
        // Create image views - 2 copies of each for seamless scrolling
        ImageView bg1 = new ImageView(bgImage);
        ImageView bg2 = new ImageView(bgImage);
        
        ImageView clouds1 = new ImageView(cloudsImage);
        ImageView clouds2 = new ImageView(cloudsImage);
        
        ImageView buildings1 = new ImageView(buildingsImage);
        ImageView buildings2 = new ImageView(buildingsImage);
        
        ImageView grass1 = new ImageView(grassImage);
        ImageView grass2 = new ImageView(grassImage);
        
        // Position second copies to the right
        bg2.setX(1153);
        clouds2.setX(1153);
        buildings2.setX(1153);
        grass2.setX(1153);
        
        // Add all layers (back to front)
        root.getChildren().addAll(bg1, bg2, clouds1, clouds2, buildings1, buildings2, grass1, grass2);
        
        // Animation - different speeds for parallax effect
        new AnimationTimer() {
            @Override
            public void handle(long now) {
                // Move background (slowest)
                bg1.setX(bg1.getX() - 0.5);
                bg2.setX(bg2.getX() - 0.5);
                
                // Move clouds (Very Quckly)
                clouds1.setX(clouds1.getX() - 6.5);
                clouds2.setX(clouds2.getX() - 6.5);
                
                // Move buildings (medium)
                buildings1.setX(buildings1.getX() - 2);
                buildings2.setX(buildings2.getX() - 2);
                
                // Move grass (Quick)
                grass1.setX(grass1.getX() - 3);
                grass2.setX(grass2.getX() - 3);
                
                // Reset positions for seamless loop
                if (bg1.getX() <= -1153) bg1.setX(1153);
                if (bg2.getX() <= -1153) bg2.setX(1153);
                if (clouds1.getX() <= -1153) clouds1.setX(1153);
                if (clouds2.getX() <= -1153) clouds2.setX(1153);
                if (buildings1.getX() <= -1153) buildings1.setX(1153);
                if (buildings2.getX() <= -1153) buildings2.setX(1153);
                if (grass1.getX() <= -1153) grass1.setX(1153);
                if (grass2.getX() <= -1153) grass2.setX(1153);
            }
        }.start();
        
        Scene scene = new Scene(root, 1153, 467);
        stage.setTitle("Parallax Scrolling Background");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}