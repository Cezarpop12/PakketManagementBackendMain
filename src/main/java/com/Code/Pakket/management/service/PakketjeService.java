package com.Code.Pakket.management.service;

import com.Code.Pakket.management.model.Pakketje;

import java.util.List;

public interface PakketjeService {
    public Pakketje pakketjeOpslaan(Pakketje pakketje);
    public List<Pakketje> getAllePakketjes();
}
