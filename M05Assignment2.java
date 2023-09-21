import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class CircleColorChangeApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        Circle circle = new Circle(100, Color.WHITE); // Create a white circle with a radius of 100

        circle.setOnMousePressed(event -> {
            if (event.getButton() == MouseButton.PRIMARY) { // Check if the left mouse button is pressed
                circle.setFill(Color.BLACK); // Change the circle color to black
            }
        });

        circle.setOnMouseReleased(event -> {
            if (event.getButton() == MouseButton.PRIMARY) { // Check if the left mouse button is released
                circle.setFill(Color.WHITE); // Change the circle color back to white
            }
        });

        StackPane root = new StackPane();
        root.getChildren().add(circle);

        Scene scene = new Scene(root, 300, 300);
        primaryStage.setTitle("Circle Color Change");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
