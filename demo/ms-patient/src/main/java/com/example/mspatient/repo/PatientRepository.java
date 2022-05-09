package com.example.mspatient.repo;

import com.example.mspatient.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PatientRepository extends JpaRepository<Patient,Long> {

}
