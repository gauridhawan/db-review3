/**
 * Created by GAURI DHAWAN on 8/1/2016.
 */
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ConfirmBox {
    static boolean ans;

    public static boolean display(String title, String message){
        Stage window= new Stage();

        window.initModality(Modality.APPLICATION_MODAL);//cannot open any other window until this window is taken care of
        window.setTitle(title);
        window.setMinWidth(250);

        Label label = new Label();
        label.setText(message);

        Button yes = new Button();
        yes.setText("yes");
        Button no = new Button();
        no.setText("no");

        yes.setOnAction(e -> {
            ans= true;
            window.close();
        });
        no.setOnAction(e -> {
            ans= false;
            window.close();
        });
        VBox layout = new VBox(20);
        layout.getChildren().addAll(label,yes,no);
        layout.setAlignment(Pos.CENTER); // will position the button in the middle


        Scene scene = new Scene(layout, 600, 600);
        window.setScene(scene);
        window.showAndWait();

        return ans;

    }
}

