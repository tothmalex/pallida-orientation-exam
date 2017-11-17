package com.greenfox.exam.controller;

import com.greenfox.exam.model.Car;
import com.greenfox.exam.repository.CarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping
public class MainController {

    @Autowired
    CarRepo carRepo;

    @RequestMapping({"/", "/list"})
    public String list( Model model, @RequestParam(required = false) String search) {
        if (search == null) {
            model.addAttribute("cars", null);
        }
        else {
            model.addAttribute("cars", carRepo.findAllByLicencePlateIsLike("%" + search + "%"));
        }
        return "searchform";
    }

    @GetMapping("/police")
    public String policeCars( Model model, @RequestParam(required = false) String search) {
        model.addAttribute("addtitle", new Car());

        return "searchform";
    }

    @GetMapping("/diplomat")
    public String diplomatCars( Model model, @RequestParam(required = false) String search) {
        model.addAttribute("addtitle", new Car());

        return "searchform";
    }
/*

    @PostMapping("/add")
    public String postTitle(@ModelAttribute Moviez moviez, Model model, @RequestParam("duedate") String duedate) {
        moviezRepo.save(moviez);
        model.addAttribute("moviez", moviezRepo.findAll());
        return "moviez";
    }
*/


}
