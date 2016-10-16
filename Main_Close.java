/**
 * Created by GAURI DHAWAN on 8/1/2016.
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
public class Main_Close extends Application {
    Stage window;
    Button button;
    public static void main(String[] args) {
        launch(args);// method that will go into Application^ set up program as javafx application

    } @Override
    public void start(Stage primaryStage){

        window=primaryStage;
        button= new Button();
        button.setText("Click here!");
        //////new/////////
        window.setOnCloseRequest(e -> {
            e.consume();// consumes the event. now it wont close
            close();
        });// will close anyway if we dont use consume
        button.setOnAction(e -> close());


        // button.setOnAction(e -> AlertBox.display("Hello","How are you"));
        button.setOnAction(e -> {
            boolean result = ConfirmBox.display("Confirm-Box","Do you want to continue?");
            System.out.println(result);
        });

        StackPane layout= new StackPane();// will position the button in the middle
        layout.getChildren().add(button);

        Scene scene= new Scene(layout,300,250);//first paramete = layout, other = size of scene
        primaryStage.setScene(scene);// pass your scene
        primaryStage.show();// needs to be closed in order to go back to original window
    }
    private void close(){
        boolean ans= ConfirmBox.display("Hello","Are you sure?");
        if(ans)
        { window.close();}
    }
}


