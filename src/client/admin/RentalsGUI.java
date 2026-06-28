package client.admin;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class RentalsGUI extends Application {

    @Override
    public void start(Stage stage) {

        GridPane root = new GridPane();

        root.setMinSize(650, 500);
        root.setPadding(new Insets(10, 10, 10, 10));
        root.setHgap(10);
        root.setVgap(10);
        root.setAlignment(Pos.CENTER);

        Label heading = new Label("Rentals");

        Label lblCustomer = new Label("Customer:");
        ComboBox<String> cmbCustomer = new ComboBox<>();

        Label lblGenre = new Label("Genre:");
        ComboBox<String> cmbGenre = new ComboBox<>();

        Label lblMovies = new Label("Movies:");
        ComboBox<String> cmbMovies = new ComboBox<>();

        Button btnSave = new Button("Save");

        Label lblBorrowed = new Label("Borrowed:");
        ComboBox<String> cmbBorrowed = new ComboBox<>();

        Button btnReturn = new Button("Return");

        Label lblReturned = new Label("Returned:");
        ComboBox<String> cmbReturned = new ComboBox<>();

        root.add(heading, 0, 0, 2, 1);

        root.add(lblCustomer, 0, 1);
        root.add(cmbCustomer, 1, 1);

        root.add(lblGenre, 0, 2);
        root.add(cmbGenre, 1, 2);

        root.add(lblMovies, 0, 3);
        root.add(cmbMovies, 1, 3);

        root.add(btnSave, 1, 4);

        root.add(lblBorrowed, 0, 5);
        root.add(cmbBorrowed, 1, 5);

        root.add(btnReturn, 1, 6);

        root.add(lblReturned, 0, 7);
        root.add(cmbReturned, 1, 7);

        heading.setStyle("-fx-font: normal bold 20px 'serif';");

        lblCustomer.setStyle("-fx-font: normal bold 18px 'serif';");
        lblGenre.setStyle("-fx-font: normal bold 18px 'serif';");
        lblMovies.setStyle("-fx-font: normal bold 18px 'serif';");
        lblBorrowed.setStyle("-fx-font: normal bold 18px 'serif';");
        lblReturned.setStyle("-fx-font: normal bold 18px 'serif';");

        btnSave.setPrefWidth(180);
        btnReturn.setPrefWidth(180);

        btnSave.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
        btnReturn.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");

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