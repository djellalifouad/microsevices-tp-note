package com.example.msordonnace;

import com.example.msordonnace.entity.Ordonnace;
import com.example.msordonnace.entity.Patient;
import com.example.msordonnace.repo.OrdonnaceRepository;
import com.example.msordonnace.repo.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import java.sql.Date;

@SpringBootApplication
@EnableFeignClients
public class MsOrdonnaceApplication  implements CommandLineRunner {

   public static void main(String[] args) {
        SpringApplication.run(MsOrdonnaceApplication.class, args);
    }
   @Autowired
    PatientRepository patientRepository;
    @Autowired
    OrdonnaceRepository ordonnaceRepository;
    @Override
    public void run(String... args) throws Exception {
        Patient patient1 = patientRepository.save(new Patient(null,null));
        Patient patient2 = patientRepository.save(new Patient(null,null));
        Ordonnace ordonnace = ordonnaceRepository.save(new Ordonnace(1L, Date.valueOf("2022-12-12"),"paracetamol",patient1));
        Ordonnace ordonnace2 = ordonnaceRepository.save(new Ordonnace(2L, Date.valueOf("2022-12-12"),"paracetamol",patient2));
    }
}
