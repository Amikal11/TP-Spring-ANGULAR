package com.AmikalSolution.SDCgestion.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@DiscriminatorValue("APP")
@Data @AllArgsConstructor @NoArgsConstructor
public class Apartement extends TitreFoncier {

    private String numero;
    private boolean louable;

}
