package com.AmikalSolution.SDCgestion;

import com.AmikalSolution.SDCgestion.entities.*;
import com.AmikalSolution.SDCgestion.enums.Etage;
import com.AmikalSolution.SDCgestion.enums.Ilot;
import com.AmikalSolution.SDCgestion.repositories.CoproRepository;
import com.AmikalSolution.SDCgestion.repositories.ImmeubleRepository;
import com.AmikalSolution.SDCgestion.repositories.TitreFoncierRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class SdCgestionApplication {

	public static void main(String[] args) {
		SpringApplication.run(SdCgestionApplication.class, args);
	}
	@Bean
	CommandLineRunner start(CoproRepository coproRepository,
							TitreFoncierRepository titreFoncierRepository,
							ImmeubleRepository immeubleRepository){
		return args -> {
			Stream.of("OUAKRIM Ali","EL JABRI Fadoi","TALIBI El Hassan").forEach(nom->{
				Copro copro=new Copro();
				copro.setNom(nom);
				copro.setCode("102822");
				copro.setCin("JE3456");
				copro.setAdresse("AKWA Group immou tafraoute");
				copro.setPays("MAROC");
				copro.setEmail(nom+"@gmail.com");
				copro.setTelephone("06-61-62-55-55");
				coproRepository.save(copro);
			});
			for (int i = 12; i <47 ; i++) {
				Immeuble immeuble=new Immeuble();
				immeuble.setNumero(String.valueOf(i));
				immeuble.setIlot(Ilot.A);
				immeuble.setNbr_etage((byte) 4);
				immeubleRepository.save(immeuble);
			}
			for (Immeuble immeuble : immeubleRepository.findAll()) {
				for (int i = 1; i < 6; i++) {
					Apartement apartement = new Apartement();
					apartement.setNumero(String.valueOf(i));
					apartement.setEtage(Etage.RDC);
					apartement.setImmeuble(immeuble);
					apartement.setNumeroTF("09/123434");
					apartement.setLouable(true);
					apartement.setCopro(coproRepository.getOne(1L));
					titreFoncierRepository.save(apartement);
				}
				for (int i = 6; i < 11; i++) {
					Apartement apartement = new Apartement();
					apartement.setNumero(String.valueOf(i));
					apartement.setEtage(Etage.PREMEIER);
					apartement.setImmeuble(immeuble);
					apartement.setNumeroTF("09/123434");
					apartement.setLouable(true);
					apartement.setCopro(coproRepository.getOne(2L));
					titreFoncierRepository.save(apartement);
				}
				for (int i = 11; i < 16; i++) {
					Apartement apartement = new Apartement();
					apartement.setNumero(String.valueOf(i));
					apartement.setEtage(Etage.DEUXIEME);
					apartement.setImmeuble(immeuble);
					apartement.setNumeroTF("09/123434");
					apartement.setLouable(true);
					apartement.setCopro(coproRepository.getOne(1L));
					titreFoncierRepository.save(apartement);
				}
				for (int i = 16; i < 21; i++) {
					Apartement apartement = new Apartement();
					apartement.setNumero(String.valueOf(i));
					apartement.setEtage(Etage.TROISIEME);
					apartement.setImmeuble(immeuble);
					apartement.setNumeroTF("09/123434");
					apartement.setLouable(true);
					apartement.setCopro(coproRepository.getOne(2L));
					titreFoncierRepository.save(apartement);
				}
				for (int i = 21; i < 26; i++) {
					Apartement apartement = new Apartement();
					apartement.setNumero(String.valueOf(i));
					apartement.setEtage(Etage.QUATRIEME);
					apartement.setImmeuble(immeuble);
					apartement.setNumeroTF("09/123434");
					apartement.setLouable(true);
					apartement.setCopro(coproRepository.getOne(2L));
					titreFoncierRepository.save(apartement);
				}
				for (int i = 27; i < 38; i++) {
					Magasin magasin = new Magasin();
					magasin.setNumero("m"+String.valueOf(i));
					magasin.setEtage(Etage.QUATRIEME);
					magasin.setImmeuble(immeuble);
					magasin.setNumeroTF("09/123434");
					magasin.setFondCommerce("Brothers Café");
					magasin.setCopro(coproRepository.getOne(2L));
					titreFoncierRepository.save(magasin);
				}

			}
		};
	}
}
