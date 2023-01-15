package com.Code.Pakket.management.service;

import com.Code.Pakket.management.exceptions.PakketjeNietGevondenException;
import com.Code.Pakket.management.model.Bedrijf;
import com.Code.Pakket.management.model.Pakketje;
import com.Code.Pakket.management.repository.PakketjeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

//De Service communiceert met de JPA repository om database operations uit te voeren.

@Service
public class PakketjeServiceImplimentation implements PakketjeService {

//    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private PakketjeRepository pakketjeRepository;

    public PakketjeServiceImplimentation(PakketjeRepository pakketjeRepository) {
    }

    @Override
    public Pakketje pakketjeOpslaan(Pakketje pakketje) {
        return pakketjeRepository.save(pakketje);
    }

    @Override
    public List<Pakketje> getAllePakketjes() {
        return pakketjeRepository.findAll();
    }

    public List<Pakketje> getAllePakketjesBezorgdByStatus(String status){
        return pakketjeRepository.getAllePakketjesBezorgdByStatus(status);
    }
    @Override
    public Pakketje getPakketjeById(int id) {
    return pakketjeRepository.findById(id).orElse(null);
    }

    @Override
    public void verwijderPakketje(Pakketje pakketje) {
        this.pakketjeRepository.delete(pakketje);
        }
}
