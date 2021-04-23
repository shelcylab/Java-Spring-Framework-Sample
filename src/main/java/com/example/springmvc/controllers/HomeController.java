/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.springmvc.controllers;

import java.util.Optional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author shelc
 */
@Controller
public class HomeController {
    
//        @GetMapping("/")
//    public String methodOne() {
//        return "methodOne";
//    }

    @GetMapping("/")
    public ModelAndView index(@RequestParam Optional<String> name) {
        ModelAndView mav = new ModelAndView();
        if (name.isPresent()) {
            mav.addObject("name", name.get());
        }

        mav.setViewName("index");
        return mav;
    }

}
