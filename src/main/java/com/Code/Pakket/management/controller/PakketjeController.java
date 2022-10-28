package com.Code.Pakket.management.controller;

import com.Code.Pakket.management.model.Pakketje;
import com.Code.Pakket.management.repository.PakketjeRepository;
import com.Code.Pakket.management.service.PakketjeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pakketje")
@CrossOrigin
public class PakketjeController {
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired ///Autowired: elke keer dat er een obj wordt gemaakt voor pakketjescontroler, is pakketjeService al injected
    private PakketjeService pakketjeService;

    @PostMapping("/add")
    public String add(@RequestBody Pakketje pakketje) {
        pakketjeService.pakketjeOpslaan(pakketje);
        return "Pakketje opgeslagenn!";
    }

    @GetMapping("/getAll")
    public List<Pakketje> getAllePakketjes(){
        return pakketjeService.getAllePakketjes();
    }

    @GetMapping("/getById/{id}")
    public Pakketje findPakketjeById(int id) {
        return pakketjeService.getPakketjeById(id);
    }

    @PutMapping("/updateOnderweg")
    public Pakketje statusIsOnderweg(@RequestBody Pakketje pakketje) {
        return pakketjeService.statusOnderweg(pakketje);
    }
}

