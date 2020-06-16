package fr.isika.clientUI.proxies;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import fr.isika.clientUI.beans.EvenementBean;

@FeignClient(name = "microservice-evenements", url = "localhost:9002")
public interface MicroserviceEvenementProxy {

	@GetMapping(value = "/Evenements")
	List<EvenementBean> listeDesEvenement();
	
	@GetMapping(value = "/Evenements/{id}")
	EvenementBean recupererUnEvenement(@PathVariable("id") int id);
}
