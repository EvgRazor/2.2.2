package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.service.CarService;
import web.service.CarServiceImpl;

import javax.servlet.http.HttpServletRequest;


@Controller
@RequestMapping("/cars")
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping("")
    public String getCar (@RequestParam(value = "count", required = false) Integer count, Model   model) {
        if (count == null) {
            model.addAttribute("key", carService.getCarList());
        } else {
            model.addAttribute("key", carService.getCarCounter(count));
        }
      return "cars";
    }



}
