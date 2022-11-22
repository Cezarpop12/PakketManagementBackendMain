package com.Code.Pakket.management.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Bedrijf {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String bedrijfsnaam;
    private String gebruikersnaam;
    private String wachtwoord;
    @OneToMany
    private List<Pakketje> pakketjes;

    public Bedrijf() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBedrijfsnaam() {
        return bedrijfsnaam;
    }

    public void setBedrijfsnaam(String bedrijfsnaam) {
        this.bedrijfsnaam = bedrijfsnaam;
    }

    public String getGebruikersnaam() {
        return gebruikersnaam;
    }

    public void setGebruikersnaam(String gebruikersnaam) {
        this.gebruikersnaam = gebruikersnaam;
    }

    public String getWachtwoord() {
        return wachtwoord;
    }

    public void setWachtwoord(String wachtwoord) {
        this.wachtwoord = wachtwoord;
    }
}
