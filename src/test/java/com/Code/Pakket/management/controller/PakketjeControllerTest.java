package com.Code.Pakket.management.controller;
import com.Code.Pakket.management.model.Pakketje;
import com.Code.Pakket.management.repository.PakketjeRepository;
import com.Code.Pakket.management.service.PakketjeService;
import org.junit.jupiter.api.Test;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.util.Assert;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.*;

public class PakketjeControllerTest {
    private PakketjeController pakketjeController = new PakketjeController();

    @Test
    void codeIsMeegegeven(){
        Pakketje pakketje = new Pakketje(1, 1, "In magazijn");
        assertTrue(pakketjeController.codeIsMeegegeven(pakketje));
    }

    @Test
    void codeIsNietMeegegeven(){
        Pakketje pakketje = new Pakketje();
        assertFalse(pakketjeController.codeIsMeegegeven(pakketje));
    }
}