package com.example.mspatient.repo;

import com.example.mspatient.entity.Ordonnace;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface OrdonnaceRepository extends JpaRepository<Ordonnace,Long> {
}
