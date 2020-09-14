package com.example.Maat.controller;


import com.example.Maat.dto.SecurityDto;
import com.example.Maat.service.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RequestMapping(value = "/security",method = RequestMethod.POST,produces = "application/json; charset=utf-8")
@CrossOrigin
@Controller
public class SecurityController {

    @Autowired
    private SecurityService securityService;

    // display list of employees
    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("listEmployees", securityService.findAll());
        return "index";
    }

    @GetMapping("/showNewSecurityForm")
    public String showNewSecurityForm(Model model) {
        // create model attribute to bind form data
        SecurityDto securityDto = new SecurityDto();
        model.addAttribute("employee", securityDto);
        return "new_employee";
    }

    @PostMapping("/saveSecurity")
    public String saveEmployee(@ModelAttribute("security") SecurityDto securityDto) {
        // save security to database
        securityService.saveSecurity(securityDto);
        return "redirect:/";
    }

    @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable(value = "id") String name, Model model) {

        // get security from the service
        SecurityDto securityDto = securityService.findByName(name);

        // set security as a model attribute to pre-populate the form
        model.addAttribute("security", securityDto);
        return "update_security";
    }

    @GetMapping("/deleteSecurity/{id}")
    public String deleteEmployee(@PathVariable(value = "id") int id) {

        // call delete employee method
        this.securityService.deleteSecurity(id);
        return "redirect:/";
    }
}
