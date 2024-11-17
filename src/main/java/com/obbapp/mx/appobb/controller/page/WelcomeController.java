package com.obbapp.mx.appobb.controller.page;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class WelcomeController {

    @GetMapping("/hi")
    public String welcome() {
        return "Bienvenido a OBBApp";
    }
}
