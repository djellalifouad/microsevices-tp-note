package com.example.mspatient.Controller;

import com.example.mspatient.entity.Patient;
import com.example.mspatient.proxy.OrdonnaceProxy;
import com.example.mspatient.repo.PatientRepository;
import com.zaxxer.hikari.util.SuspendResumeLock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.util.List;

@RestController
@RequestMapping("/api")
public class PatientController {
    @Autowired
    PatientRepository patientRepository;
    @Autowired
    OrdonnaceProxy ordonnaceProxy;
    @GetMapping("patients")
    List<Patient> getPatients() {
        System.out.println("here1");
       List<Patient> patients = patientRepository.findAll();
       patients.forEach(patient -> {
           patient.getOrdonnaces().forEach((ordonnace -> {
          ordonnace.setOrdonnace2(ordonnaceProxy.getordo(ordonnace.getIdOrdonnace()));
           }));
       });
       return  patients;
    };
}
