package fr.isika.microservice_evenements.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.isika.microservice_evenements.dao.EvenementDao;
import fr.isika.microservice_evenements.model.Evenement;

@RestController
public class EvenementController {

	@Autowired
	EvenementDao evenementDao;
	
	// Affiche la liste des evenements
	@GetMapping(value = "/Evenements")
	public List<Evenement> listeDesEvenements(){
		List<Evenement> evenements = evenementDao.findAll();
		return evenements;
	}
	
	// Récupérer un évenement par son id
	@GetMapping(value = "/Evenements/{id}")
	public Optional<Evenement> recupererUnEvenement(@PathVariable int id){
		Optional<Evenement> evenement = evenementDao.findById(id);
		return evenement;
	}
}
