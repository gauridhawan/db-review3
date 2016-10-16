/**
 * Created by GAURI DHAWAN on 8/1/2016.
 */
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Stage;

//import static javafx.application.Application.launc;

public class Main_layout extends Application {
    Stage window;
    Button button;

    public static void main(String[] args) {
        launch(args);// method that will go into Application^ set up program as javafx application

    }

    @Override
    public void start(Stage primaryStage) {

        window = primaryStage;

        VBox left = new VBox(20);
        Button l1 = new Button("This");
        Button l2 = new Button("Is");
        Button l3 = new Button("LeftPane");
        left.getChildren().addAll(l1, l2, l3);

        VBox right = new VBox(20);
        Button l7 = new Button("This");
        Button l8 = new Button("Is");
        Button l9 = new Button("RightPane");
        right.getChildren().addAll(l7, l8, l9);


        HBox top = new HBox(20);
        Button l4 = new Button("This");
        Button l5 = new Button("Is");
        Button l6 = new Button("TopPane");
        top.getChildren().addAll(l4, l5, l6);

        HBox bottom = new HBox(20);
        Button l10 = new Button("This");
        Button l11 = new Button("Is");
        Button l12 = new Button("BottomPane");
        top.getChildren().addAll(l10, l11, l12);


        BorderPane borderpane = new BorderPane();
        borderpane.setTop(top);
        borderpane.setBottom(bottom);
        borderpane.setLeft(left);
        borderpane.setRight(right);

        Scene scene = new Scene(borderpane, 600, 600);
        window.setScene(scene);
        window.show();
    }
}