package fr.isika.microservice_evenements.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Evenement {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String titre;
	
	private String description;
	
	private String image;
	
	public Evenement() {
		
	}
	
	public Evenement(int id, String titre, String description, String image) {
		super();
		this.id = id;
		this.titre = titre;
		this.description = description;
		this.image = image;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "Evenement [id=" + id + ", titre=" + titre + ", description=" + description + ", image=" + image + "]";
	}
	
}
