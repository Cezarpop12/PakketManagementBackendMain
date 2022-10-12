package com.Code.Pakket.management.repository;

import com.Code.Pakket.management.model.Pakketje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//https://www.javadevjournal.com/spring-boot/spring-boot-with-hibernate/ -- Punt5.
@Repository
public interface PakketjeRepository extends JpaRepository<Pakketje,Integer> {
}
