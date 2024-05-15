package com.AmikalSolution.SDCgestion.entities;

import com.AmikalSolution.SDCgestion.enums.Etage;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name= "type" ,length = 4)
@Data @NoArgsConstructor @AllArgsConstructor
public class TitreFoncier {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String numeroTF;
    @ManyToOne
    private Copro copro;
    @ManyToOne
    private Immeuble immeuble;
    private Etage etage;
}
