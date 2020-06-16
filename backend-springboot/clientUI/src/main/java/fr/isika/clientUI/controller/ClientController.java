package fr.isika.clientUI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.isika.clientUI.beans.EvenementBean;
import fr.isika.clientUI.proxies.MicroserviceEvenementProxy;

@Controller
public class ClientController {
	
	@Autowired
	MicroserviceEvenementProxy mEvenementProxy;
	
	@RequestMapping("/")
	public String acceuil(Model model) {
		List<EvenementBean> evenements = mEvenementProxy.listeDesEvenement();
		
		model.addAttribute("evenements", evenements);
		return "Accueil";
	}
	
	@RequestMapping(value = "/details-evenement/{id}")
	public String ficheEvenement(@PathVariable int id, Model model) {

		EvenementBean evenement = mEvenementProxy.recupererUnEvenement(id);

		model.addAttribute("evenement", evenement);

		return "FicheEvenement";
	}

}
