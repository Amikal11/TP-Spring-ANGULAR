package com.AmikalSolution.SDCgestion.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@DiscriminatorValue("MAG")
@Data @NoArgsConstructor @AllArgsConstructor
public class Magasin extends TitreFoncier {

    private String fondCommerce;
    private String numero;
}
