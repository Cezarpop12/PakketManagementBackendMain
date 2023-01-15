package com.Code.Pakket.management.controller;

import com.Code.Pakket.management.model.Pakketje;
import com.Code.Pakket.management.service.PakketjeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

@RestController
@RequestMapping("/pakketje")
@CrossOrigin
public class PakketjeController {
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired ///Autowired: elke keer dat er een obj wordt gemaakt voor pakketjescontroler, is pakketjeService al injected
    private PakketjeService pakketjeService;

    @PostMapping("/add")
    public ResponseEntity<Pakketje> add(@RequestBody Pakketje pakketje) {
        if(codeIsMeegegeven(pakketje) == true) {
            pakketjeService.pakketjeOpslaan(pakketje);
            return new ResponseEntity("Pakketje succesvol Opgeslagen", HttpStatus.OK);
        }
        return new ResponseEntity("Opslaan mislukt", HttpStatus.BAD_REQUEST);
    }

    @GetMapping("/getAll")
    public List<Pakketje> getAllePakketjes(){
        return pakketjeService.getAllePakketjes();
    }
    @GetMapping("/getAllByStatusBezorgd")
    public List<Pakketje> getAllePakketjesByStatusBezorg(){
        String status = "Bezorgd";
        return pakketjeService.getAllePakketjesBezorgdByStatus(status);
    }

    @GetMapping("/getById/{id}")
    public Pakketje findPakketjeById(int id) {
        return pakketjeService.getPakketjeById(id);
    }

    @PutMapping("/statusOnderweg/{id}")
    public ResponseEntity<Pakketje> statusOnderweg(@PathVariable int id){
        Pakketje pakketje = pakketjeService.getPakketjeById(id);
        if(pakketje !=null){
            pakketje.setStatus("Onderweg");
            pakketjeService.pakketjeOpslaan(pakketje);
            return new ResponseEntity("Pakketje succesvol verstuurd", HttpStatus.OK);
        }
        return new ResponseEntity("Versturen mislukt", HttpStatus.BAD_REQUEST);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Pakketje> Delete(@PathVariable int id){
        Pakketje pakketje = pakketjeService.getPakketjeById(id);
        if(pakketje != null){
            pakketjeService.verwijderPakketje(pakketje);
            return new ResponseEntity("Succesvol verwijderd", HttpStatus.OK);
        }
        return new ResponseEntity("Verwijderen mislukt", HttpStatus.BAD_REQUEST);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Pakketje> Update(@RequestBody Pakketje pakketje, @PathVariable int id){
        Pakketje bestaandPakketje = pakketjeService.getPakketjeById(id);
        if(bestaandPakketje !=null){
            bestaandPakketje.setCode(pakketje.getCode());
            pakketjeService.pakketjeOpslaan(bestaandPakketje);
            return new ResponseEntity("Pakketje succesvol geupdatet", HttpStatus.OK);
        }
        return new ResponseEntity("Updaten mislukt", HttpStatus.BAD_REQUEST);
    }

    public boolean codeIsMeegegeven(Pakketje pakketje){
        if(pakketje.getCode() != 0 ){
            return true;
        }
        else return false;
    }
}

