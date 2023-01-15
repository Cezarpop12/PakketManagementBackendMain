package com.Code.Pakket.management.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Object {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String objectNaam;

    @JsonIgnore
    @ManyToMany(mappedBy = "objecten")
    private Set<Pakketje> pakketjes = new HashSet<>();

    public Object(){
    }

    public Object(int Id, String ObjectNaam){
        this.id = Id;
        this.objectNaam = ObjectNaam;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getObjectNaam() {
        return objectNaam;
    }

    public void setObjectNaam(String objectNaam) {
        this.objectNaam = objectNaam;
    }

    public void assignPakketjeToObject(Pakketje pakketje) {
        pakketjes.add(pakketje);
    }
}
