package com.Code.Pakket.management.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.jpa.repository.Modifying;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Pakketje {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int code;
    private String status = "In magazijn";

    @ManyToMany
    @JoinTable(
            name = "paketjes_objecten",
            joinColumns = @JoinColumn(name = "pakketje_id"),
            inverseJoinColumns = @JoinColumn(name = "object_id")
    )
    private Set<Object> objecten = new HashSet<>();

    public Pakketje() {
    }

    public Pakketje(int Id, int Code) {
        this.id = Id;
        this.code = Code;
        this.status = "In magazijn";
    }
    public Pakketje(int Id) {
        this.id = Id;
        this.status = "In magazijn";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void assignObjectToPakketje(Object object) {
        objecten.add(object);
    }
}
