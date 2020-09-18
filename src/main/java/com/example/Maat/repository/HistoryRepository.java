package com.example.Maat.repository;

import com.example.Maat.entity.History;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//interface for accessing CRUD methods

public interface HistoryRepository extends JpaRepository<History, Integer> {
    List<History> findBySecHisId(String secHisId);
}
