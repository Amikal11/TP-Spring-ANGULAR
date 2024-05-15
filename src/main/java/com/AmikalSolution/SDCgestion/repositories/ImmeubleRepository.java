package com.AmikalSolution.SDCgestion.repositories;

import com.AmikalSolution.SDCgestion.entities.Immeuble;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImmeubleRepository extends JpaRepository<Immeuble,Long> {
}
