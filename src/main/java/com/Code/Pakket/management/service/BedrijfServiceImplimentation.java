package com.Code.Pakket.management.service;
import com.Code.Pakket.management.model.Bedrijf;
import com.Code.Pakket.management.repository.BedrijfRepository;
import com.Code.Pakket.management.repository.PakketjeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BedrijfServiceImplimentation implements BedrijfService {

    @Autowired
    private BedrijfRepository bedrijfRepository;
    PasswordEncoder passwordEncoder;

    public BedrijfServiceImplimentation(BedrijfRepository bedrijfRepository) {
        this.bedrijfRepository = bedrijfRepository;
        this.passwordEncoder = new BCryptPasswordEncoder();
    }

    public Bedrijf registreren(Bedrijf bedrijf){
        String encodedPassword = this.passwordEncoder.encode(bedrijf.getPassword());
        bedrijf.setPassword(encodedPassword);
        return bedrijfRepository.save(bedrijf);
    }

    public Bedrijf findBedrijfByEmail(String email){
        return bedrijfRepository.findBedrijfByEmail(email);
    }

    public Bedrijf getBedrijfById(int id){
        return bedrijfRepository.findById(id).orElse(null);
    }
}
