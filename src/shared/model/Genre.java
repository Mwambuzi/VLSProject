package shared.model;

import java.io.Serializable;

public class Genre implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;
    private String genre;
    private boolean isActive;

    public Genre(int id, String genre, boolean isActive) {
        this.id = id;
        this.genre = genre;
        this.isActive = isActive;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }
}