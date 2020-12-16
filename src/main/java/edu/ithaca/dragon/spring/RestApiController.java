package edu.ithaca.dragon.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApiController {

    @GetMapping("/api")
    public String apiDefault() {
        return "Default API response";
    }

}