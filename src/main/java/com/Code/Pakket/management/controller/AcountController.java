package com.Code.Pakket.management.controller;

import com.Code.Pakket.management.model.Bedrijf;
import com.Code.Pakket.management.model.Pakketje;
import com.Code.Pakket.management.service.BedrijfService;
import com.Code.Pakket.management.service.PakketjeService;
import com.Code.Pakket.management.service.TokenserviceImplimentation;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.logging.Logger;


@RestController
@RequestMapping("/account")
@CrossOrigin
public class AcountController {
    private final TokenserviceImplimentation tokenserviceImplimentation;

    public AcountController(TokenserviceImplimentation tokenserviceImplimentation){
        this.tokenserviceImplimentation = tokenserviceImplimentation;
    }
    @Autowired
    private BedrijfService bedrijfService;

    @PostMapping("/registreren")
    public ResponseEntity<Bedrijf> Registreren(@RequestBody Bedrijf bedrijf){
        Bedrijf bestaandbedrijf = bedrijfService.findBedrijfByEmail(bedrijf.getEmail());
        if(bestaandbedrijf != null){
            return new ResponseEntity("Email is al in gebruik", HttpStatus.BAD_REQUEST);
        }
        bedrijfService.registreren(bedrijf);
        return new ResponseEntity("Account succesvol aangemaakt", HttpStatus.OK);
    }

    @PostMapping("/accountToevoegTest")
    public void AccountToevoegenTest(@RequestBody Bedrijf bedrijf) {
        bedrijfService.registreren(bedrijf);
    }

    @PostMapping("/token")
    public String token(Authentication authentication) {
         String token = tokenserviceImplimentation.generateToken(authentication);
         return token;
    }
}
