package one.digitalinnovation.parking.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Hellocontroller {

	@GetMapping
    public String hello() {
        return "Hello Pedro Dio, Java Devs";
    }
    
}
