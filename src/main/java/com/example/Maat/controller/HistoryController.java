package com.example.Maat.controller;


import com.example.Maat.dto.HistoryDto;
import com.example.Maat.service.HistoryService;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping (value = "/controller/history", method = RequestMethod.POST,produces = "application/json; charset=utf-8")
@AllArgsConstructor
@Log
@CrossOrigin
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
    public List<HistoryDto> findBySecHisId(@RequestParam String secHisId) {
        log.info("Handling find by history request: " + secHisId);
        return historyService.findBySecHisId(secHisId);
    }

    @RequestMapping("/parseHistory")
    public void saveAll() throws IOException, SAXException, ParserConfigurationException {
        historyService.deleteAllHis();
        historyService.saveAll();
    }

}
