package com.Code.Pakket.management.service;

import java.util.List;
import com.Code.Pakket.management.model.Object;

public interface ObjectService {

    public Object objectOpslaan(Object object);
    public Object getObjectById(int id);
    public Object getObjectOpNaam(String objectNaam);
    public List<Object> getAllObjects();
//    public List<Object> findObjectenBypakketje_id(int pakketjeId);
}
