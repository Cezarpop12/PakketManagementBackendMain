package com.Code.Pakket.management.service;

import com.Code.Pakket.management.model.Pakketje;
import com.Code.Pakket.management.repository.PakketjeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PakketjeServiceImplimentation implements PakketjeService {

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private PakketjeRepository pakketjeRepository;

    @Override
    public Pakketje pakketjeOpslaan(Pakketje pakketje) {

        return pakketjeRepository.save(pakketje);
    }

    @Override
    public List<Pakketje> getAllePakketjes() {
        return pakketjeRepository.findAll();
    }
}
