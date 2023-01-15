package com.Code.Pakket.management.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Bedrijf {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(unique=true)
    private String email;
    private String password;
//    @OneToMany
//    private List<Pakketje> pakketjes;

    public Bedrijf() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {return email;}

    public void setEmail(String email) {this.email = email;}
}
