package com.example.Maat.service;

import com.example.Maat.dto.HistoryDto;

import java.util.List;

public interface HistoryService {
    HistoryDto saveHistory(HistoryDto historyDto);
    void deleteHistory(Integer hisId);
    HistoryDto findById(Integer secHisId);
    List<HistoryDto> findAllHis();
}
