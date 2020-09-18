package com.example.Maat.service;

import com.example.Maat.dto.HistoryDto;

import java.util.List;

public interface HistoryService {
    HistoryDto saveHistory(HistoryDto historyDto);
    void deleteHistory(Integer hisId);
    List<HistoryDto> findBySecHisId(String secHisId);
    List<HistoryDto> findAllHis();
}
