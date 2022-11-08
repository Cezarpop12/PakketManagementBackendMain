package com.Code.Pakket.management.repository;

import com.Code.Pakket.management.model.Pakketje;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.util.Assert;

import static org.junit.jupiter.api.Assertions.*;

//@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
//@DataJpaTest
public class PakketjeRepositoryTest {

//    @Autowired
//    private PakketjeRepository pakketjeRepository;
//
//    @AfterEach
//    void tearDown(){
//        pakketjeRepository.deleteAll();
//    }
//
//    @Test
//    void pakketjeIsOpgeslagen(){
//        Pakketje pakketje = new Pakketje(100, 100);
//        pakketjeRepository.save(pakketje);
//        Assert.isTrue(pakketjeRepository.existsById(100));
//    }
}