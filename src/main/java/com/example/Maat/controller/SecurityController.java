package com.example.Maat.controller;


import com.example.Maat.dto.SecurityDto;
import com.example.Maat.service.SecurityService;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/security")
@AllArgsConstructor
@Log
public class SecurityController {
    private final SecurityService securityService;

    @PostMapping("/save")
    public SecurityDto saveSecurity(@RequestBody SecurityDto securityDto) {
        log.info("Handling save users: " + securityDto);
        return securityService.saveSecurity(securityDto);
    }

    @GetMapping("/findAll")
    public List<SecurityDto> findAllUsers() {
        log.info("Handling all users request");
        return securityService.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteSecurity(@PathVariable Integer id) {
        log.info("Handling delete user request: " + id);
        securityService.deleteSecurity(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/findByName")
    public SecurityDto findByName(@RequestParam String name) {
        log.info("Handling find by name request: " + name);
        return securityService.findByName(name);
    }
}
