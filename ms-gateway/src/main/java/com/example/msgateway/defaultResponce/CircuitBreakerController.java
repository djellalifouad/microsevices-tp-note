package com.example.msgateway.defaultResponce;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CircuitBreakerController {
    @GetMapping("/defaultOrdonnaces")
    public List<Ordonnace> OrdonnaceFallback() {
        List<Ordonnace> ordonnaces = new ArrayList<>();
        ordonnaces.add(new Ordonnace("php"));
        ordonnaces.add(new Ordonnace("SpringBoot"));
        return ordonnaces;
    }
}

