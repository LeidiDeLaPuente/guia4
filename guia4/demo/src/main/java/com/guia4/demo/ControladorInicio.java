package com.guia4.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class ControladorInicio {
    @GetMapping("/")
    public String inicio (){
        return "index";
    }
}
