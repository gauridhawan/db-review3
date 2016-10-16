/**
 * Created by GAURI DHAWAN on 8/3/2016.
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class Listview extends Application{
    Stage window;
    Button button;
    ListView<String> list;
    public static void main(String[] args) {
        launch(args);// method that will go into Application^ set up program as javafx application

    }
    @Override
    public void start(Stage primaryStage)  {
        window = primaryStage;

        list = new ListView<>();
      // list.setItems.addAll("A","B","C");
        list.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        VBox layout = new VBox(20);
        layout.getChildren().addAll(list);

        Scene scene = new Scene(layout, 300, 300);
        window.setScene(scene);
        window.show();
    }

    }
