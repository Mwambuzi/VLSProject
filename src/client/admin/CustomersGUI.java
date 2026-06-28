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

        GridPane root = new GridPane();

        root.setMinSize(600, 450);
        root.setPadding(new Insets(10, 10, 10, 10));
        root.setVgap(10);
        root.setHgap(10);
        root.setAlignment(Pos.CENTER);

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

        root.add(heading, 0, 0, 2, 1);

        root.add(lblName, 0, 1);
        root.add(txtName, 1, 1);

        root.add(lblPhone, 0, 2);
        root.add(txtPhone, 1, 2);

        root.add(lblEmail, 0, 3);
        root.add(txtEmail, 1, 3);

        root.add(btnSave, 1, 4);

        root.add(lblRegistered, 0, 5);
        root.add(cmbRegistered, 1, 5);

        root.add(btnRemove, 1, 6);

        heading.setStyle("-fx-font: normal bold 20px 'serif';");
        lblName.setStyle("-fx-font: normal bold 18px 'serif';");
        lblPhone.setStyle("-fx-font: normal bold 18px 'serif';");
        lblEmail.setStyle("-fx-font: normal bold 18px 'serif';");
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