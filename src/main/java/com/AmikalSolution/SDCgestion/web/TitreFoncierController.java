package com.AmikalSolution.SDCgestion.web;

import com.AmikalSolution.SDCgestion.entities.TitreFoncier;
import com.AmikalSolution.SDCgestion.repositories.TitreFoncierRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@AllArgsConstructor
public class TitreFoncierController {

    private TitreFoncierRepository titreFoncierRepository;
    @GetMapping("/titre_foncier")
    public String titre_foncier(Model model){
       List<TitreFoncier> listdestitre =titreFoncierRepository.findAll();
       model.addAttribute("titresFonciers",listdestitre);


        return "tf.html";
    }


}
