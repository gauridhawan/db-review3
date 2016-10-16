/**
 * Created by GAURI DHAWAN on 8/9/2016.
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.scene.layout.GridPane;
public class Studfac extends Application {
    Stage window;

    public static void main(String[] args) {
        launch(args);// method that will go into Application^ set up program as javafx application

    }

    @Override
    public void start(Stage primaryStage) {

        window = primaryStage;

        Button stud = new Button("STUDENT LOGIN");
        stud.setOnAction(e->{

        });
        Button fac = new Button("FACULTY LOGIN");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10,10,10,10));
        grid.setVgap(10);
        grid.setHgap(10);

        GridPane.setConstraints(stud, 3, 3);
        GridPane.setConstraints(fac,2,3);

        grid.getChildren().addAll(stud,fac);



        Scene scene = new Scene(grid, 300, 300);
        scene.getStylesheets().add("studfac.css");
        window.setScene(scene);
        window.show();


    }
}