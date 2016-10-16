/**
 * Created by GAURI DHAWAN on 8/1/2016.
 */
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;
public class GridPane extends Application {

    Stage window;
    Scene scene;
    Button button;
    public static void main(String args[]){
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;

       /*GridPane grid = new GridPane();
        grid.setPadding(new Insets(10,10,10,10));
        grid.setVgap(10);
        */
        TextField input = new TextField();
        button = new Button("Click here!");
        button.setOnAction(e -> {
            isInt(input,input.getText());
        });
        //Sign up
        Button signUpButton = new Button("Sign Up");
        signUpButton.getStyleClass().add("button-blue");
       // GridPane.setConstraints(signUpButton, 1, 3);


        CheckBox box1 = new CheckBox("X");
        // Label
        Label l1 = new Label("Name");
       // GridPane.setConstraints
        VBox layout = new VBox(20);
        layout.getChildren().addAll(input,button,box1,signUpButton);
        Scene scene = new Scene(layout, 600, 600);
        scene.getStylesheets().add("Viper.css");
        window.setScene(scene);
        window.show();



    }
    private boolean isInt(TextField inp , String msg){
        try{
            int age = Integer.parseInt(inp.getText());
            System.out.println("User is " + age + " years old");
            return true;
        }
        catch(NumberFormatException e){
            System.out.println("Wrong input");
            return false;
        }
    }

}
