package com.Code.Pakket.management.repository;

import com.Code.Pakket.management.model.Pakketje;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

public class PakketjeRepositoryTest {

    @Autowired
    private PakketjeRepository pakketjeRepository;

    @Test
    void pakketjeIsOpgeslagen(){
        Pakketje pakketje = new Pakketje(3, 3, "in magazijn");
        pakketjeRepository.save(pakketje);
        assertTrue(pakketjeRepository.existsById(3));

    }
}