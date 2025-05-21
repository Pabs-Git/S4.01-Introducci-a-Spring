package cat.itacademy.s04.t01.n01.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    // http://localhost:9000/HelloWorld?nom=Eric
    // http://localhost:9000/HelloWorld
    @GetMapping("/HelloWorld")
    public String saluda(@RequestParam(defaultValue = "UNKNOWN") String nom) {
        return "Hola, " + nom + ". Estàs executant un projecte Maven";
    }

    // http://localhost:9000/HelloWorld2/Eric
    // http://localhost:9000/HelloWorld2
    @GetMapping({"/HelloWorld2", "/HelloWorld2/{nom}"})
    public String saluda2(@PathVariable(required = false) String nom) {
        if (nom == null) nom = "UNKNOWN";
        return "Hola, " + nom + ". Estàs executant un projecte Maven";
    }
}
