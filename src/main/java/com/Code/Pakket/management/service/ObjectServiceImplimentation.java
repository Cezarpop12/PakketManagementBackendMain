package com.Code.Pakket.management.service;


import com.Code.Pakket.management.model.Object;
import com.Code.Pakket.management.model.Pakketje;
import com.Code.Pakket.management.repository.BedrijfRepository;
import com.Code.Pakket.management.repository.ObjectRepository;
import com.Code.Pakket.management.repository.PakketjeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Id;
import java.util.List;

@Service
public class ObjectServiceImplimentation implements ObjectService{

    @Autowired
    private ObjectRepository objectRepository;
    @Autowired
    private PakketjeRepository pakketjeRepository;

    public ObjectServiceImplimentation(ObjectRepository objectRepository) {
    }

    @Override
    public Object objectOpslaan(Object object) {
        return objectRepository.save(object);
    }

    @Override
    public Object getObjectById(int id) {
        return objectRepository.findById(id).orElse(null);
    }

    @Override
    public Object getObjectOpNaam(String objectNaam) {
        return objectRepository.findObjectByobjectNaam(objectNaam);
    }

    @Override
    public List<Object> getAllObjects() {
        return objectRepository.findAll();
    }

//    @Override
//    public List<Object> findObjectenBypakketje_id(int pakketjeId) {
//        return pakketjeRepository.findObjectenBypakketje_id(pakketjeId);
//    }
}
