package one.digitalinnovation.parking.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

@RestController
@RequestMapping("/")
@ApiIgnore
public class Hellocontroller {

	@GetMapping
    public String hello() {
        return "Hello Pedro Zeferino na Dio, Java Devs";
    }
    
}
