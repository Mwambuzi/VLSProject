package shared.model;

import java.io.Serializable;

public class Customer implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;
    private String fullname;
    private String phone;
    private String email;
    private boolean isActive;

    public Customer(int id, String fullname, String phone, String email, boolean isActive) {
        this.id = id;
        this.fullname = fullname;
        this.phone = phone;
        this.email = email;
        this.isActive = isActive;
    }

    public int getId() {
        return id;
    }

    public String getFullname() {
        return fullname;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}