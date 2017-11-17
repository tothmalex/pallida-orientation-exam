package com.greenfox.exam.controller;

import antlr.StringUtils;
import com.greenfox.exam.repository.CarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping
public class MainController {

    @Autowired
    CarRepo carRepo;

    @RequestMapping({"/", "/list"})
    public String list( Model model, @RequestParam(required = false) String search) {
        if (search != null || search.matches("^.*[^a-zA-Z0-9 ].*$") || search.length() < 7) {
            model.addAttribute("cars", carRepo.findAllByLicencePlateIsLike("%" + search + "%"));
        }
        else {
            model.addAttribute("errorMessage", "Sorry, the submitted licence plate is not valid");
        }
        return "searchform";
    }

    @GetMapping("/list/police")
    public String policeCars( Model model) {
        model.addAttribute("cars", carRepo.findAllByLicencePlateIsLike("%" + "RB" + "%"));
        return "searchform";
    }

    @GetMapping("/list/diplomat")
    public String diplomatCars( Model model) {
        model.addAttribute("cars", carRepo.findAllByLicencePlateIsLike("%" + "DT" + "%"));
        return "searchform";
    }

    @GetMapping("/{brand}")
    public String branding( Model model, @PathVariable String brand) {
        model.addAttribute("cars", carRepo.findAllByBrandIsLike(brand));
        return "searchform";
    }
}
