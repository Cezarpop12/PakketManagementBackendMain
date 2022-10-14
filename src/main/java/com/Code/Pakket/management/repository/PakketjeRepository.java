package com.Code.Pakket.management.repository;

import com.Code.Pakket.management.model.Pakketje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//https://www.javadevjournal.com/spring-boot/spring-boot-with-hibernate/ -- Punt5.
//https://www.simplilearn.com/tutorials/jpa-tutorial/spring-boot-jpa#:~:text=JPA%20Repository%20is%20mainly%20used,very%20minimal%20amount%20of%20effort.
@Repository
public interface PakketjeRepository extends JpaRepository<Pakketje, Integer> {
}
