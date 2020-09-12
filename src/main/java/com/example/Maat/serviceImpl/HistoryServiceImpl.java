package com.example.Maat.serviceImpl;


import com.example.Maat.dto.HistoryDto;
import com.example.Maat.entity.History;
import com.example.Maat.repository.HistoryRepository;
import com.example.Maat.service.HistoryConverter;
import com.example.Maat.service.HistoryService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;


@Service
@AllArgsConstructor
public class HistoryServiceImpl implements HistoryService {

    private final HistoryRepository historyRepository;
    private final HistoryConverter historyConverter;

    @Transactional
    @Override
    public HistoryDto saveHistory(HistoryDto historyDto) {
        History savedHistory = historyRepository.save(historyConverter.fromHistoryDtoToHistory(historyDto));
        return historyConverter.fromHistoryToHistoryDto(savedHistory);
    }

    @Transactional
    @Override
    public void deleteHistory(Integer historyId) {
        historyRepository.deleteById(historyId);
    }

    @Transactional
    @Override
    public HistoryDto findById(Integer secHisId) {
        History history = historyRepository.findByHisId(secHisId);
        if(history != null) {
            return historyConverter.fromHistoryToHistoryDto(history);
        }
        return null;
    }

    @Transactional
    @Override
    public List<HistoryDto> findAllHis() {
        return historyRepository.findAll()
                .stream()
                .map(historyConverter::fromHistoryToHistoryDto)
                .collect(Collectors.toList());
    }
}
