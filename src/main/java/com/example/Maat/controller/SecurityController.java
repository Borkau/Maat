package com.example.Maat.controller;


import com.example.Maat.dto.SecurityDto;
import com.example.Maat.entity.Security;
import com.example.Maat.service.SecurityService;
import com.example.Maat.serviceImpl.SecurityServiceImpl;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/security",method = RequestMethod.POST,produces = "application/json; charset=utf-8")
@AllArgsConstructor
@Log
@CrossOrigin
public class SecurityController {



}
