package com.example.logging.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/home")
public class HomeController {

    private Logger logger = LoggerFactory.getLogger(HomeController.class);

    @GetMapping("/{id}")
    public String home(@PathVariable String id) {
        // Info log level
        logger.info("This is home API calling: info - id = {}", id);

        // Error log level
        logger.error("This is home API calling: error - id = {}", id);

        return "This is home API";
    }

}
