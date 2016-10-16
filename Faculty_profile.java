import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.stage.Stage;

/**
 * Created by GAURI DHAWAN on 9/7/2016.
 */
public class Faculty_profile extends Application {
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

        Label id = new Label("ID NUMBER");
        grid.setConstraints(id, 1, 0);

        Label name = new Label("NAME");
        grid.setConstraints(name, 2, 0);

        Label num = new Label("CONTACT NUMBER");
        grid.setConstraints(num, 3, 0);

        Label spe = new Label("SPECIALIZATION");
        grid.setConstraints(spe, 4, 0);

        Label pro = new Label("ONGOING PROJECTS");
        grid.setConstraints(pro, 6, 0);

        Label school = new Label("SCHOOL");
        grid.setConstraints(school, 5, 0);


        Button back = new Button("BACK");
        grid.setConstraints(back, 7, 0);

        grid.getChildren().addAll(name,id,spe,num,school,back,pro);
        Scene scene = new Scene(grid, 300, 300);
        scene.getStylesheets().add("login.css");
        window.setScene(scene);
        window.show();


    }

}
