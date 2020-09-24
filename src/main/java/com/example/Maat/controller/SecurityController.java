package com.example.Maat.controller;


import com.example.Maat.dto.SecurityDto;
import com.example.Maat.parser.SecurityParser;
import com.example.Maat.service.SecurityService;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping(value = "/controller/security",method = RequestMethod.POST,produces = "application/json; charset=utf-8")
@AllArgsConstructor
@Log
@CrossOrigin
public class SecurityController {

    private final SecurityService securityService;
    private final SecurityParser securityParser;


    @PostMapping("/save")
    public SecurityDto saveSecurity(@RequestBody SecurityDto securityDto) {
        log.info("Handling save security: " + securityDto);
        return securityService.saveSecurity(securityDto);
    }

    @GetMapping("/findAll")
    public List<SecurityDto> findAll() {
        log.info("Handling all securities request");
        return securityService.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteSecurity(@PathVariable Integer id) {
        log.info("Handling delete security request: " + id);
        securityService.deleteSecurity(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/findByName")
    public List<SecurityDto> findByName(@RequestParam String name) {
        log.info("Handling find by security request: " + name);
        return securityService.findByName(name);
    }

    @RequestMapping("/parseSecurity")
    public void parseSecurities() throws IOException, SAXException, ParserConfigurationException {
        securityParser.parseSecurity();
    }
}
