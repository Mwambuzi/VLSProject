package client.admin;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MoviesGUI extends Application {

    @Override
    public void start(Stage stage) {

        GridPane root = new GridPane();

        root.setMinSize(600, 400);
        root.setPadding(new Insets(10, 10, 10, 10));
        root.setVgap(10);
        root.setHgap(10);
        root.setAlignment(Pos.CENTER);

        Label heading = new Label("Movies");

        Label lblGenre = new Label("Genre:");
        ComboBox<String> cmbGenre = new ComboBox<>();

        Label lblName = new Label("Name:");
        TextField txtName = new TextField();

        Button btnSave = new Button("Save");

        Label lblRegistered = new Label("Registered:");
        ComboBox<String> cmbRegistered = new ComboBox<>();

        Button btnRemove = new Button("Remove");

        root.add(heading, 0, 0, 2, 1);

        root.add(lblGenre, 0, 1);
        root.add(cmbGenre, 1, 1);

        root.add(lblName, 0, 2);
        root.add(txtName, 1, 2);

        root.add(btnSave, 1, 3);

        root.add(lblRegistered, 0, 4);
        root.add(cmbRegistered, 1, 4);

        root.add(btnRemove, 1, 5);

        heading.setStyle("-fx-font: normal bold 20px 'serif';");
        lblGenre.setStyle("-fx-font: normal bold 18px 'serif';");
        lblName.setStyle("-fx-font: normal bold 18px 'serif';");
        lblRegistered.setStyle("-fx-font: normal bold 18px 'serif';");

        btnSave.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
        btnRemove.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");

        btnSave.setPrefWidth(180);
        btnRemove.setPrefWidth(180);

        root.setStyle("-fx-background-color: BEIGE;");

        Scene scene = new Scene(root);

        stage.setTitle("Video Library System");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}