package com.Code.Pakket.management.repository;

import com.Code.Pakket.management.model.Object;
import com.Code.Pakket.management.model.Pakketje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PakketjeRepository extends JpaRepository<Pakketje, Integer> {
    public List<Pakketje> getAllePakketjesBezorgdByStatus(String status);
}
