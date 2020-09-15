package com.example.Maat.controller;


import com.example.Maat.dto.HistoryDto;
import com.example.Maat.service.HistoryService;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/history")
@AllArgsConstructor
@Log
public class HistoryController {

    private final HistoryService historyService;

    @PostMapping("/save")
    public HistoryDto saveHistory(@RequestBody HistoryDto historyDto) {
        log.info("Handling save history: " + historyDto);
        return historyService.saveHistory(historyDto);
    }

    @GetMapping("/findAll")
    public List<HistoryDto> findAll() {
        log.info("Handling all securities request");
        return historyService.findAllHis();
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteHistory(@PathVariable Integer id) {
        log.info("Handling delete history request: " + id);
        historyService.deleteHistory(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/findBySecHisId")
    public HistoryDto findBySecHisId(@RequestParam Integer secHisId) {
        log.info("Handling find by history request: " + secHisId);
        return historyService.findBySecHisId(secHisId);
    }
}
