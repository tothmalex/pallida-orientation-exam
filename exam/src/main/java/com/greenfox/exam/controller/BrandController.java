package com.greenfox.exam.controller;

import com.greenfox.exam.model.GroupOfCar;
import com.greenfox.exam.model.ReturnMessage;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class BrandController {

    @PostMapping("/api/search/{brand}")
    @ResponseBody
    public ReturnMessage sendingMessage (@PathVariable String brand) {

        if (brand == "Audi") {
            return new ReturnMessage(HttpStatus.OK, GroupOfCar.cars);
        }
        else {
            return new ReturnMessage(HttpStatus.BAD_REQUEST);
        }
    }
}
