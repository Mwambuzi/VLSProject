package server;

import shared.model.Customer;
import shared.model.Genre;
import shared.remote.VideoLibraryService;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class VideoLibraryServer extends UnicastRemoteObject
        implements VideoLibraryService {

    DatabaseManager db;

    public VideoLibraryServer() throws RemoteException {
        super();
        db = new DatabaseManager();
    }

    @Override
    public void saveGenre(Genre genre) throws RemoteException {

    db.saveGenre(genre.getGenre());

    }

    @Override
    public ArrayList<Genre> getGenres() throws RemoteException {

        return db.getGenres();

    }

    @Override
    public void removeGenre(int id) throws RemoteException {

        System.out.println("Removing Genre " + id);

    }

     @Override
    public void saveCustomer(Customer customer) throws RemoteException {

        db.saveCustomer(customer);

    }

    @Override
    public ArrayList<Customer> getCustomers() throws RemoteException {

        return db.getCustomers();

    }

    @Override
    public void removeCustomer(int id) throws RemoteException {

        db.removeCustomer(id);

    }

    public static void main(String[] args) {

        try {

            VideoLibraryServer server = new VideoLibraryServer();

            Registry registry = LocateRegistry.createRegistry(1099);

            registry.rebind("VideoLibraryService", server);

            System.out.println("Server is ready.");

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

}