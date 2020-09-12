package com.example.Maat.repository;

import com.example.Maat.entity.History;
import org.springframework.data.jpa.repository.JpaRepository;

//interface for accessing CRUD methods

public interface HistoryRepository extends JpaRepository<History, Integer> {
    History findByHisId(int hisId);
}
