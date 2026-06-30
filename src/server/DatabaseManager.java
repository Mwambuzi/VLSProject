package server;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import shared.model.Genre;
import shared.model.Customer;

public class DatabaseManager {

    private static final String URL = "jdbc:mysql://localhost:3306/vlsdb";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    private Connection connection;

    public DatabaseManager() {
        connect();
    }

    private void connect() {
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Database Connected Successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public void saveGenre(String genre) {

    String sql = "INSERT INTO Genres (genre, isactive) VALUES (?, ?)";

    try {

        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setString(1, genre);
        statement.setBoolean(2, true);

        statement.executeUpdate();

        System.out.println("Genre saved successfully.");

    } catch (SQLException e) {

        e.printStackTrace();

    }

    }

    public ArrayList<Genre> getGenres() {

    ArrayList<Genre> genres = new ArrayList<>();

    String sql = "SELECT * FROM Genres WHERE isactive = true";

    try {

        PreparedStatement statement = connection.prepareStatement(sql);

        ResultSet result = statement.executeQuery();

        while (result.next()) {

            Genre genre = new Genre(
                    result.getInt("id"),
                    result.getString("genre"),
                    result.getBoolean("isactive")
            );

            genres.add(genre);

        }

    } catch (SQLException e) {

        e.printStackTrace();

    }

    return genres;
    }

    public void saveCustomer(Customer customer) {

    String sql = "INSERT INTO Clients(fullname, phone, email, isactive) VALUES (?, ?, ?, ?)";

    try {

            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setString(1, customer.getFullname());
            statement.setString(2, customer.getPhone());
            statement.setString(3, customer.getEmail());
            statement.setBoolean(4, true);

            statement.executeUpdate();

            System.out.println("Customer saved successfully.");

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }

    public ArrayList<Customer> getCustomers() {

    ArrayList<Customer> customers = new ArrayList<>();

    String sql = "SELECT * FROM Clients WHERE isactive = true";

    try {

        PreparedStatement statement = connection.prepareStatement(sql);

        ResultSet result = statement.executeQuery();

        while (result.next()) {

            Customer customer = new Customer(
                    result.getInt("id"),
                    result.getString("fullname"),
                    result.getString("phone"),
                    result.getString("email"),
                    result.getBoolean("isactive")
            );

            customers.add(customer);

        }

    } catch (SQLException e) {

        e.printStackTrace();

    }

    return customers;

}

    public void removeCustomer(int id) {

    String sql = "UPDATE Clients SET isactive = false WHERE id = ?";

    try {

        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setInt(1, id);

        statement.executeUpdate();

    } catch (SQLException e) {

        e.printStackTrace();

    }

}
}