package com.AmikalSolution.SDCgestion.entities;

import com.AmikalSolution.SDCgestion.enums.Ilot;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Immeuble {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String numero;
    private byte nbr_etage;
    private Ilot ilot;
    @OneToMany(mappedBy = "immeuble")
    private List<TitreFoncier> titreFonciers;
}
