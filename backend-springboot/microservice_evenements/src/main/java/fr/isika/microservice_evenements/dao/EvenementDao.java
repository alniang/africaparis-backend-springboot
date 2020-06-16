package fr.isika.microservice_evenements.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.isika.microservice_evenements.model.Evenement;

@Repository
public interface EvenementDao extends CrudRepository<Evenement, Integer>{

	List<Evenement> findAll();

	Optional<Evenement> findById(int id);

}
