import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * Created by GAURI DHAWAN on 9/7/2016.
 */
public class Faculty_main extends Application {
    Stage window;

    public static void main(String[] args) {
        launch(args);// method that will go into Application^ set up program as javafx application

    }
    @Override
    public void start(Stage primaryStage) {

        window = primaryStage;

        Button profile = new Button("PROFILE");
        Button current_sem = new Button("FALL 2016-17");
        Button proc = new Button("PROCTEES");

        javafx.scene.layout.GridPane grid = new javafx.scene.layout.GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(10);
        grid.setHgap(10);

        GridPane.setConstraints(profile, 1, 1);
        GridPane.setConstraints(current_sem, 1, 2);
        GridPane.setConstraints(proc, 1, 3);

        grid.getChildren().addAll(profile, current_sem, proc);

        Scene scene = new Scene(grid, 300, 300);
        scene.getStylesheets().add("studfac.css");
        window.setScene(scene);
        window.show();


    }

    }
