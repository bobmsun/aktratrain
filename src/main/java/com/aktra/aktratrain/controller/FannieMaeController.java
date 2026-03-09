package com.aktra.aktratrain.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
public class FannieMaeController {

    private static final Logger logger = LoggerFactory.getLogger(FannieMaeController.class);

    @GetMapping("/fannie-mae")
    public String showAMTMPage() {
        logger.info("In the FannieMaeController, handling GET request for /fannie-mae");
        logger.info("About to return the Fannie Mae page");
        return "fannie-mae";
    }
}
