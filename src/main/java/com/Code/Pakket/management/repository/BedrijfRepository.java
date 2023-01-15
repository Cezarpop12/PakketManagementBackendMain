package com.Code.Pakket.management.repository;

import com.Code.Pakket.management.model.Bedrijf;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BedrijfRepository extends JpaRepository<Bedrijf, Integer> {
    public Bedrijf findBedrijfByEmail(String email);
}
