package fr.isika.microservice_evenements.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import fr.isika.microservice_evenements.model.Evenement;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/events")
public class EvenementController {

	private WebClient client = WebClient.create("http://localhost:8282");

	@GetMapping(path = "/events-api/public/events")
	public Flux<Evenement> getEvenement() {
		return client.get().uri("/events-api/public/events").accept(MediaType.APPLICATION_JSON).retrieve()
				.bodyToFlux(Evenement.class).log("retrieve emps :: ");
	}
	
	@GetMapping(path = "/events-api/public/events/{id}")
	public Mono<Evenement> getEvenementById(@PathVariable("id") String id) {
		return client.get().uri("/events-api/public/events/{id}", id).accept(MediaType.APPLICATION_JSON)
				.retrieve().bodyToMono(Evenement.class).log("retrieve emps :: ");
	}
}
