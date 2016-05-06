package by.romanov.voice.recognation.entity;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "visitors")
public class Visitor implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Id
    @Column(name = "first_name")
    private String fisrtName;
    @Id
    @Column(name = "last_name")
    private String lastName;
    // private double[] voiceSample;

    public Visitor() {
    }

    public Visitor(String fisrtName, Integer id, String lastName) {
        this.fisrtName = fisrtName;
        this.id = id;
        this.lastName = lastName;
    }

    public String getFisrtName() {
        return fisrtName;
    }

    public void setFisrtName(String fisrtName) {
        this.fisrtName = fisrtName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
