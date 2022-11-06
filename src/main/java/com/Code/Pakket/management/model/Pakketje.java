package com.Code.Pakket.management.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.jpa.repository.Modifying;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//Men maakt een JPA entity class zodat hibernate met onze data kan werken.
@Entity
public class Pakketje {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int code;
    private String status = "In magazijn";

    public Pakketje() {
    }

    public Pakketje(int Id, int Code, String Status) {
        this.id = Id;
        this.code = Code;
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
}
