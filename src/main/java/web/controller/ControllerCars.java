package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.dao.CarDAO;

import javax.servlet.http.HttpServletRequest;


@Controller
@RequestMapping("/cars")
public class ControllerCars {

    @Autowired
    private CarDAO carDAO;

    // @RequestParam(value = "count", required = false) int i, - не отрабатывает, выдает ошибку сервера 500.
    // Подскажите пожалуйста, в чем причина?

    @GetMapping("")
    public String getCar (HttpServletRequest httpServletRequest, Model   model) {
        Object con = httpServletRequest.getParameter("count");
        if (con == null) {
            model.addAttribute("kay", carDAO.getCarList());
        } else {
            switch (Integer.parseInt((String) con)){
                case 1:
                    model.addAttribute("kay", carDAO.getCarCounter(1));
                    break;
                case 2:
                    model.addAttribute("kay", carDAO.getCarCounter(2));
                    break;
                case 3:
                    model.addAttribute("kay", carDAO.getCarCounter(3));
                    break;
                case 4:
                    model.addAttribute("kay", carDAO.getCarCounter(4));
                    break;
                default:
                    model.addAttribute("kay", carDAO.getCarList());
            }
        }

        return "cars";
    }



}
