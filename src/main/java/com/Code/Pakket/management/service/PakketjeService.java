package com.Code.Pakket.management.service;

import com.Code.Pakket.management.model.Pakketje;

import java.util.List;

//Dit wordt geimplimenteerd in de service class.
public interface PakketjeService {
    public Pakketje pakketjeOpslaan(Pakketje pakketje);
    public List<Pakketje> getAllePakketjes();
    public Pakketje getPakketjeById(int id);
    public void verwijderPakketje(Pakketje pakketje);

    public List<Pakketje> getAllePakketjesBezorgdByStatus(String status);
}
