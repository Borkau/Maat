package com.example.Maat.repository;

import com.example.Maat.entity.Security;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//interface for accessing CRUD methods

public interface SecurityRepository extends JpaRepository<Security, Integer> {
    List<Security> findByName(String secName);
}
