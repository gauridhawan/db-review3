package com;

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
 * Created by GAURI DHAWAN on 10/17/2016.
 */
public class current_sem_fac_course extends Application {
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

        table.setEditable(true);
        TableColumn reg = new TableColumn("Registration Number");
        TableColumn name = new TableColumn("Name");
        TableColumn action = new TableColumn("Action"); // two options update marks , attendance

        table.getColumns().addAll(reg, name,action);

        final VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 0, 0, 10));
        vbox.getChildren().addAll(table); //button);

        Scene scene = new Scene(new Group());
        ((Group) scene.getRoot()).getChildren().addAll(vbox);
        scene.getStylesheets().add("C:\\Users\\GAURI DHAWAN\\IdeaProjects\\new\\src\\com\\current_sem.css");
        window.setScene(scene);
        window.show();


    }

}
