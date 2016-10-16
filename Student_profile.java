import  javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import javax.security.auth.login.AppConfigurationEntry;

/**
 * Created by GAURI DHAWAN on 9/7/2016.
 */
public class Student_profile extends Application {
    Stage window;
    Scene scene;
    Button button;

    public static void main(String args[]) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        javafx.scene.layout.GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(10);
        grid.setHgap(10);

        Label regno = new Label("REGISTRATION NUMBER");
        grid.setConstraints(regno, 1, 0);

        Label name = new Label("NAME");
        grid.setConstraints(name, 2, 0);

        Label dob = new Label("DATE OF BIRTH");
        grid.setConstraints(dob, 3, 0);

        Label num = new Label("CONTACT NUMBER");
        grid.setConstraints(num, 4, 0);

        Label add = new Label("ADDRESS");
        grid.setConstraints(add, 5, 0);

        Label pinfo = new Label("PARENT'S INFO");
        grid.setConstraints(add, 6, 0);


        Button back = new Button("BACK");
        grid.setConstraints(back, 7, 0);

        grid.getChildren().addAll(name,regno,dob,num,add,back,pinfo);
        Scene scene = new Scene(grid, 300, 300);
        scene.getStylesheets().add("login.css");
        window.setScene(scene);
        window.show();


    }

}
