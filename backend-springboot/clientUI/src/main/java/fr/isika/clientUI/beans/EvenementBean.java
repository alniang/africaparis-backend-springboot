package fr.isika.clientUI.beans;

public class EvenementBean {

	private int id;
	
	private String titre;
	
	private String description;
	
	private String image;
	
	public EvenementBean() {

	}

	public EvenementBean(int id, String titre, String description, String image) {
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
		return "EvenementBean [id=" + id + ", titre=" + titre + ", description=" + description + ", image=" + image
				+ "]";
	}
}
