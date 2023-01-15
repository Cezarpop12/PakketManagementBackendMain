package com.Code.Pakket.management.controller;

import com.Code.Pakket.management.model.Object;
import com.Code.Pakket.management.model.Pakketje;
import com.Code.Pakket.management.service.BedrijfService;
import com.Code.Pakket.management.service.ObjectService;
import com.Code.Pakket.management.service.PakketjeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/object")
@CrossOrigin
public class ObjectController {

    @Autowired
    private ObjectService objectService;

    @Autowired
    private PakketjeService pakketjeService;

    @PostMapping("/saveObject")
    public ResponseEntity<Object> SaveObject(@RequestBody Object object) {
        if(objectService.getObjectOpNaam(object.getObjectNaam()) !=null){
            return new ResponseEntity("Object opslaan mislukt", HttpStatus.BAD_REQUEST);
        }
        objectService.objectOpslaan(object);
        return new ResponseEntity("Object succesvol opgeslagen", HttpStatus.BAD_REQUEST);
    }

    @PutMapping("/addObjectToPakketje/{objectId}/{pakketjeId}")
    public ResponseEntity<Object> AddObjectToPakketje(@PathVariable int objectId, @PathVariable int pakketjeId){
        Pakketje bestaandPakketje = pakketjeService.getPakketjeById(pakketjeId);
        Object bestaandObject = objectService.getObjectById(objectId);
        if(bestaandPakketje !=null && bestaandObject !=null ){
            bestaandPakketje.assignObjectToPakketje(bestaandObject);
            pakketjeService.pakketjeOpslaan(bestaandPakketje);
            return new ResponseEntity("Object succesvol toegevoegd aan pakketje", HttpStatus.OK);
        }
        return new ResponseEntity("Object Toevoegen aan pakketje mislukt", HttpStatus.BAD_REQUEST);
    }

    @GetMapping("/getAllObjects")
    public List<Object> getAllObjects() { return objectService.getAllObjects(); }

//    @GetMapping("/getAllObjectsOpPakketjesId/{pakketjeId}")
//    public List<Object> getAlleObjectsOpId(@PathVariable int pakketjeId){
//        return objectService.findObjectenBypakketje_id(pakketjeId);
//    }

}
