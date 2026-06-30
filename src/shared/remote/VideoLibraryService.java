package shared.remote;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import shared.model.Genre;
import shared.model.Customer;

public interface VideoLibraryService extends Remote {

    void saveGenre(Genre genre) throws RemoteException;

    ArrayList<Genre> getGenres() throws RemoteException;

    void removeGenre(int id) throws RemoteException;

    void saveCustomer(Customer customer) throws RemoteException;

    ArrayList<Customer> getCustomers() throws RemoteException;

    void removeCustomer(int id) throws RemoteException;

}