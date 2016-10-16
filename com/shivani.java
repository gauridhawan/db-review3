import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.event.Event;

public class shivani extends Application{
    Stage window;
    Scene scene1,scene2;
    public static void main (String[] args) {
        launch(args);

    }
    @Override
    public void start(Stage primaryStage) throws Exception{
        window=primaryStage;

        Label label1=new Label ("Enter Your Choice \n 1. Chat \n 2.Send a file \n 3. Receieve a file");
        Button button1=new Button();



        VBox layout1=new VBox(10);
        scene1=new Scene(layout1,200,200) ;
        layout1.getChildren().addAll(label1,button1);
        button1.setOnAction(e -> window.setScene(scene1));

        Label label2=new Label ("Chat");
        Button button2=new Button("enter");
        button2.setOnAction(e->window.setScene(scene1));


        StackPane layout2= new StackPane();
        layout2.getChildren().addAll(button2);
        scene2= new Scene(layout2,200,200);

        window.setScene(scene1);
        window.setTitle("Shat program");
        window.show();




    }
}