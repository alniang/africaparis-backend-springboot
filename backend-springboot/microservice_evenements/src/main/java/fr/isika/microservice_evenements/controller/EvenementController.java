package fr.isika.microservice_evenements.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import fr.isika.microservice_evenements.model.Evenement;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/event")
public class EvenementController {
	
	private WebClient client = WebClient.create("http://localhost:8282");
	
	@GetMapping
	public Flux<Evenement> getEvenement(){
		return client.get().uri("/events-api/public/events")
				.accept(MediaType.APPLICATION_JSON)
				.retrieve()
				.bodyToFlux(Evenement.class)
				.log("retrieve emps :: ");
	}
	
}
