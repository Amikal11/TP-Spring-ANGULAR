package com.AmikalSolution.SDCgestion.web;

import com.AmikalSolution.SDCgestion.entities.Copro;
import com.AmikalSolution.SDCgestion.repositories.CoproRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@AllArgsConstructor
public class CoproController {
    private CoproRepository coproRepository;
    @GetMapping("/index")
    public String index(Model model){
        List<Copro> coproList=coproRepository.findAll();
        model.addAttribute("copros",coproList);

        return "copros";
    }

}
