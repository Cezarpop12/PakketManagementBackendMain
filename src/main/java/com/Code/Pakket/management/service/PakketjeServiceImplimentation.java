package com.Code.Pakket.management.service;

import com.Code.Pakket.management.model.Pakketje;
import com.Code.Pakket.management.repository.PakketjeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//De Service communiceert met de JPA repository om database operations uit te voeren.
@Service
public class PakketjeServiceImplimentation implements PakketjeService {

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private PakketjeRepository pakketjeRepository;

    @Override
    public Pakketje pakketjeOpslaan(Pakketje pakketje) {
        return pakketjeRepository.save(pakketje);
        //De JPA repository (binnen PakketjeService) helpt ons met een
        //aantal methodes zoals save en findall.
    }

    //Ff override leren
    @Override
    public List<Pakketje> getAllePakketjes() {
        return pakketjeRepository.findAll();
    }
}
