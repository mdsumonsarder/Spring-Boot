package com.example.Spring_Data_JPA_Config.repository;

import com.example.Spring_Data_JPA_Config.model.Programmer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgrammerRepo extends JpaRepository<Programmer, Integer> {
}
