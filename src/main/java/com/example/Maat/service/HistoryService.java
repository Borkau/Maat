package com.example.Maat.service;

import com.example.Maat.dto.HistoryDto;

public interface HistoryService {
    HistoryDto saveHistory(HistoryDto historyDto);
    void deleteHistory(Integer historyId);
    HistoryDto findById(String secHisId);
}
