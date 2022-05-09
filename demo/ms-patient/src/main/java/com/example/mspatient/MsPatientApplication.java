package com.example.mspatient;

import com.example.mspatient.entity.Ordonnace;
import com.example.mspatient.entity.Patient;
import com.example.mspatient.repo.OrdonnaceRepository;
import com.example.mspatient.repo.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MsPatientApplication implements CommandLineRunner {
    @Autowired
    PatientRepository patientRepository;
    @Autowired
    OrdonnaceRepository ordonnaceRepository;
    public static void main(String[] args) {
        SpringApplication.run(MsPatientApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
      Patient patient =   patientRepository.save(new Patient(null,"fouad",null));
        Ordonnace ordonnace = ordonnaceRepository.save(new Ordonnace(1L,patient,null));
    }
}
