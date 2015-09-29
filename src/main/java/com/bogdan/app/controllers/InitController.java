package com.bogdan.app.controllers;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



/**
 * Created by bbaloi on 02.09.2015.
 */

@Controller
public class InitController {

    private static final Logger logger = Logger.getLogger(InitController.class);

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String getHomePage() {
        logger.info("Entered home page");
        return "home";
    }

}
