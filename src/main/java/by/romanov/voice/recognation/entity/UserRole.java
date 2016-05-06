package by.romanov.voice.recognation.entity;

import javax.persistence.*;

/**
 * Created by graf on 30.04.2016.
 */
@Entity
@Table(name="user_roles")
public class UserRole {

    @Id
    @GeneratedValue
    private int id;
    @Column(name = "username", nullable = false)
    private String user;
    @Column(name = "role", nullable = false, length = 45)
    private String role;

    public UserRole() {
        super();
    }

    public UserRole(String user, String role, int id) {
        super();
        this.user = user;
        this.role = role;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public String getRole() {
        return role;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setRole(String role) {
        this.role = role;
    }

}
