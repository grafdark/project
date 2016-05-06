package by.romanov.voice.recognation.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by graf on 30.04.2016.
 */
@Entity
@Table(name = "users")
public class User {
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "username", unique = true, nullable = false, length = 45)
    private String username;
    @Column(name = "password", nullable = false, length = 60)
    private String password;

    public User() {
    }

    public User(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
