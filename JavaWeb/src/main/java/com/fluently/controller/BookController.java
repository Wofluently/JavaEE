package com.fluently.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/book")
public class BookController {
 
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    private String list(Model model) {
        return "list";
    }
 
}
