/**
 * Created by GAURI DHAWAN on 8/3/2016.
 */
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Combobox extends Application {
    Stage window;
    Scene scene;
    Button button;
    ComboBox<String> cb;

    public static void main(String args[]) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;

        cb = new ComboBox<>();
        cb.getItems().addAll("A","B","C");

        VBox layout = new VBox(20);
        layout.getChildren().addAll(cb);

        Scene scene = new Scene(layout, 300, 300);
        window.setScene(scene);
        window.show();
    }

    }
