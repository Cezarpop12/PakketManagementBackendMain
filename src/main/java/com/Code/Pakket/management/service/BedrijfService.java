package com.Code.Pakket.management.service;

import com.Code.Pakket.management.model.Bedrijf;

public interface BedrijfService {
    public Bedrijf registreren(Bedrijf bedrijf);
    public Bedrijf findBedrijfByEmail(String email);
    public Bedrijf getBedrijfById(int id);
}
