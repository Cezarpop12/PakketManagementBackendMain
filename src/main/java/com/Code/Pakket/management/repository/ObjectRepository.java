package com.Code.Pakket.management.repository;

import com.Code.Pakket.management.model.Object;
import com.Code.Pakket.management.model.Pakketje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ObjectRepository extends JpaRepository<Object, Integer> {
    public Object findObjectByobjectNaam(String objectNaam);
}
