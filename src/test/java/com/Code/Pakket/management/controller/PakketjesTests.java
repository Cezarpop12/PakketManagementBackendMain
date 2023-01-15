package com.Code.Pakket.management.controller;
import com.Code.Pakket.management.model.Pakketje;
import com.Code.Pakket.management.repository.PakketjeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
public class PakketjesTests {

    @Autowired
    private PakketjeRepository pakketjeRepository;
    PakketjeController pakketjeController = new PakketjeController();

//    @Test
//    void add(){
//        Pakketje pakketjeGoed = new Pakketje(1, 1);
//        Pakketje pakketjeFalse = new Pakketje(1);
//        this.pakketjeController.add(pakketjeGoed);
//        this.pakketjeController.add(pakketjeFalse);
//        verify(pakketjeService.pakketjeOpslaan(pakketjeGoed));
//        verify(pakketjeService).never
//    }

    @Test
    void codeIsMeegegeven(){
        Pakketje pakketje = new Pakketje(1, 1);
        assertTrue(pakketjeController.codeIsMeegegeven(pakketje));
    }

    @Test
    void codeIsNietMeegegeven(){
        Pakketje pakketje = new Pakketje();
        assertFalse(pakketjeController.codeIsMeegegeven(pakketje));
    }

    @Test
    void pakketjeIsOpgeslagen(){
//        Pakketje pakketje = new Pakketje();
        Pakketje pakketje = new Pakketje(1, 1);
        Pakketje pakketje2 = new Pakketje(2, 2);
        Pakketje pakketje3 = new Pakketje(3, 3);
        pakketjeRepository.save(pakketje);
        pakketjeRepository.save(pakketje2);
        pakketjeRepository.save(pakketje3);
        boolean expected = pakketjeRepository.existsById(2);
        assertFalse(expected);
    }

//    @Test
//    void statusIsOnderweg(){
//        Pakketje pakketje = new Pakketje(1, 1);
//        pakketjeController.statusOnderweg(pakketje.getId());
//        assertTrue(pakketje.getStatus() == "Onderweg");
//    }
}