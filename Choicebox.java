/**
 * Created by GAURI DHAWAN on 8/2/2016.
 */
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Choicebox extends Application {
    Stage window;
    Scene scene;
    Button button;

    public static void main(String args[]) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;

        ChoiceBox<String> choiceBox=new ChoiceBox<>();

        choiceBox.getItems().addAll("apple","banana","mango","watermelon");
        choiceBox.setValue("apple");

       // ChoiceBox choiceBox = new ChoiceBox(FXCollections.observableArrayList("First", "Second", "Third"));
      /*  ChoiceBox<String> choiceBox = new ChoiceBox<>();
        choiceBox.setItems().addAll("Chocolate","Pizza","Pasta"); // nahi chal raaaaaaaaaaaaaaaaa

     /*********Veryy Impppp********/
      // choiceBox.getSelectionModel.selectedItemProperty().addListener((v, oldValue, newValue)-> System.out.println(newValue)); // dont need to select its value, change krne se bhi dikhta
       // v is for observable
        VBox layout = new VBox(20);
        layout.getChildren().addAll(choiceBox);

        Scene scene = new Scene(layout, 300, 300);
        window.setScene(scene);
        window.show();
    }
}

/*public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        // Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        // primaryStage.setTitle("Hello World");


        ChoiceBox<String> choiceBox=new ChoiceBox<>();
        choiceBox.getItems().addAll("apple","banana","mango","watermelon");
        choiceBox.setValue("apple");
        Stage windows = primaryStage;
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(10);
        grid.setHgap(10);
        //Label
        Label name = new Label("UserName");
        grid.setConstraints(name, 0, 0);

        TextField input = new TextField();
        grid.setConstraints(input, 1, 0);


        Label pass = new Label("Password");
        grid.setConstraints(pass, 0, 1);

       /* TextField input2 = new TextField();
        input2.setPromptText("Password");*/
  /*      PasswordField input2 = new PasswordField();
        input2.setPromptText("Password");
        grid.setConstraints(input2, 1, 1);

        Button login = new Button("Login");
        grid.setConstraints(login, 1, 2);
        login.setOnAction(e -> {
            System.out.println(input.getText());
            System.out.println(input2.getText());

        });
        grid.getChildren().addAll(name,input,pass,input2,login,choiceBox);
        Scene scene1234 = new Scene(grid, 300, 300);
        windows.setScene(scene1234);
        windows.show();
    }
    public static void main(String[] args) {
        launch(args);

    }
}*/