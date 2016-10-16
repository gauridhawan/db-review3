import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import javax.security.auth.login.AppConfigurationEntry;

/**
 * Created by GAURI DHAWAN on 9/7/2016.
 */
public class Student_AcademicDetails extends Application {
    Stage window;
    Scene scene;
    Button button;

    public static void main(String args[]) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        javafx.scene.layout.GridPane grid = new javafx.scene.layout.GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(10);
        grid.setHgap(10);

        Label regno = new Label("REGISTRATION NUMBER");
        grid.setConstraints(regno, 1, 0);

        Label proctor = new Label("PROCTOR");
        grid.setConstraints(proctor, 2, 0);

        Label prog = new Label("PROGRAM");
        grid.setConstraints(prog, 3, 0);

        Label branch= new Label("BRANCH");
        grid.setConstraints(branch, 4, 0);

        Label school = new Label("SCHOOL");
        grid.setConstraints(school, 5, 0);

        Button back = new Button("BACK");
        grid.setConstraints(back, 6, 0);

        grid.getChildren().addAll(proctor,regno,prog,branch,school,back);
        Scene scene = new Scene(grid, 300, 300);
        scene.getStylesheets().add("login.css");
        window.setScene(scene);
        window.show();


    }

}
