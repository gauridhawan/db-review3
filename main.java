/**
 * Created by GAURI DHAWAN on 7/31/2016.
 */
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class main extends Application implements EventHandler<ActionEvent> { // to implement events

    Button button;
    public static void main(String[] args) {
        launch(args);// method that will go into Application^ set up program as javafx application

    } @Override
        public void start(Stage primaryStage) throws Exception {
                    //main javafx code begins here
           primaryStage.setTitle("NewTitle");
           button= new Button();
           button.setText("Click here!");
           //button.setOnAction(this);// code to handle it in this class for handle method
           button.setOnAction(e -> AlertBox.display("Hello","How are you"));

            StackPane layout= new StackPane();// will position the button in the middle
            layout.getChildren().add(button);

            Scene scene= new Scene(layout,300,250);//first paramete = layout, other = size of scene
            primaryStage.setScene(scene);// pass your scene
            primaryStage.showAndWait();// needs to be closed in order to go back to original window
        }

    @Override // when user clicks the button
    public void handle(ActionEvent event) {
        if(event.getSource()==button){
            System.out.println("Hello!");
        }

    }
}
