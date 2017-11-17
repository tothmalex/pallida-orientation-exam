package com.greenfox.exam.controller;

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

    @RequestMapping({"","/search"})
    public String list( Model model, @RequestParam(required = false) String search) {
        if (search.matches("^.*[^a-zA-Z0-9 ].*$") || search.length() < 7) {
            model.addAttribute("cars", carRepo.findAllByPlateIsLike("%" + search + "%"));
        }
        else if (search == null) {
            model.addAttribute("cars", carRepo.findAll());
        }
        else {
            model.addAttribute("errorMessage", "Sorry, the submitted licence plate is not valid");
            return "searchform";
    }

    @GetMapping("/police")
    public String policeCars( Model model) {
        model.addAttribute("cars", carRepo.findAllByPlateIsLike("%" + "RB" + "%"));
        return "searchform";
    }

    @GetMapping("/diplomat")
    public String diplomatCars( Model model) {
        model.addAttribute("cars", carRepo.findAllByPlateIsLike("%" + "DT" + "%"));
        return "searchform";
    }

    @GetMapping("search/{brand}")
    public String branding( Model model, @PathVariable String brand) {
        model.addAttribute("cars", carRepo.findAllByCarBrandIsLike(brand));
        return "searchform";
    }
}
