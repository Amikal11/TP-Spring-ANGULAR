package com.AmikalSolution.SDCgestion.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Copro {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String code;
    private String nom;
    private String cin;
    private String adresse;
    private String ville;
    private String pays;
    private String telephone;
    private String email;
    @OneToMany (mappedBy = "copro")
    private List<TitreFoncier> titreFonciers;
}
