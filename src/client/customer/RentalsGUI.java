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

        GridPane grid = new GridPane();

        grid.setMinSize(650, 500);
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setAlignment(Pos.CENTER);

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

        grid.add(heading, 0, 0, 2, 1);

        grid.add(lblCustomer, 0, 1);
        grid.add(cmbCustomer, 1, 1);

        grid.add(lblGenre, 0, 2);
        grid.add(cmbGenre, 1, 2);

        grid.add(lblMovies, 0, 3);
        grid.add(cmbMovies, 1, 3);

        grid.add(btnSave, 1, 4);

        grid.add(lblBorrowed, 0, 5);
        grid.add(cmbBorrowed, 1, 5);

        grid.add(btnReturn, 1, 6);

        grid.add(lblReturned, 0, 7);
        grid.add(cmbReturned, 1, 7);

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

        grid.setStyle("-fx-background-color: BROWN;");

        Scene scene = new Scene(grid);

        stage.setTitle("Video Library System");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}