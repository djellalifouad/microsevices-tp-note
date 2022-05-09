package com.example.mspatient.proxy;

import com.example.mspatient.models.Ordonnace2;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.sql.Date;

@FeignClient(name="ms-ordonnance")
public interface OrdonnaceProxy {
    @GetMapping("/ordonnaces/{id}")
    @CircuitBreaker(name="fall1", fallbackMethod = "fallbackFormation")
    Ordonnace2 getordo(@PathVariable("id") Long id);
    default   Ordonnace2 fallbackFormation(Throwable throwable) {

        return new   Ordonnace2(Date.valueOf("2022-02-02"),"prdo");
    }
}
