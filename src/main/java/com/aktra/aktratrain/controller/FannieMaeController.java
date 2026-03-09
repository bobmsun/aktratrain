package com.aktra.aktratrain.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FannieMaeController {

    @GetMapping("/fannie-mae")
    public String showAMTMPage() {
        return "fannie-mae";
    }
}
