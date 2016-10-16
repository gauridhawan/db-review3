import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * Created by GAURI DHAWAN on 10/16/2016.
 */
public class current_sem_att extends Application {
    Stage window;
    Scene scene;
    Button button;

    public static void main(String args[]) {
        launch(args);
    }

    private TableView table = new TableView();

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        final Label label = new Label("Attendance-Fall Semester 2016-17");
        label.setFont(new Font("Arial", 20));

        table.setEditable(true);
        TableColumn course_code = new TableColumn("Course Code");
        TableColumn course_title = new TableColumn("Course Title");
        TableColumn att = new TableColumn("Attendance");
        table.getColumns().addAll(course_code, course_title, att);

        final VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 0, 0, 10));
        vbox.getChildren().addAll(label, table);

        Scene scene = new Scene(new Group());
        ((Group) scene.getRoot()).getChildren().addAll(vbox);
        scene.getStylesheets().add("current_sem.css");
        window.setScene(scene);
        window.show();

    }
}
