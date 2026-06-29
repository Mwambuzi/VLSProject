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

public class CustomersGUI extends Application {

    @Override
    public void start(Stage stage) {

        GridPane grid = new GridPane();

        grid.setMinSize(600, 450);
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(10);
        grid.setHgap(10);
        grid.setAlignment(Pos.CENTER);

        Label heading = new Label("Customers");

        Label lblName = new Label("Name:");
        TextField txtName = new TextField();

        Label lblPhone = new Label("Phone:");
        TextField txtPhone = new TextField();

        Label lblEmail = new Label("Email:");
        TextField txtEmail = new TextField();

        Button btnSave = new Button("Save");

        Label lblRegistered = new Label("Registered:");
        ComboBox<String> cmbRegistered = new ComboBox<>();

        Button btnRemove = new Button("Remove");

        grid.add(heading, 0, 0, 2, 1);

        grid.add(lblName, 0, 1);
        grid.add(txtName, 1, 1);

        grid.add(lblPhone, 0, 2);
        grid.add(txtPhone, 1, 2);

        grid.add(lblEmail, 0, 3);
        grid.add(txtEmail, 1, 3);

        grid.add(btnSave, 1, 4);

        grid.add(lblRegistered, 0, 5);
        grid.add(cmbRegistered, 1, 5);

        grid.add(btnRemove, 1, 6);

        heading.setStyle("-fx-font: normal bold 20px 'serif';");
        lblName.setStyle("-fx-font: normal bold 18px 'serif';");
        lblPhone.setStyle("-fx-font: normal bold 18px 'serif';");
        lblEmail.setStyle("-fx-font: normal bold 18px 'serif';");
        lblRegistered.setStyle("-fx-font: normal bold 18px 'serif';");

        btnSave.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
        btnRemove.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");

        btnSave.setPrefWidth(180);
        btnRemove.setPrefWidth(180);

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