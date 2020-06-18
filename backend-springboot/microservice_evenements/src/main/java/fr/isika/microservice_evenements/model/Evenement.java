package fr.isika.microservice_evenements.model;

public class Evenement {
	
	private int id;
	
	private String titre;
	
	private String lieu;
	
	private String desc;
	
	private String debut;
	
	private String fin;
	
	public Evenement() {
		
	}

	public Evenement(int id, String titre, String lieu, String desc, String debut, String fin) {
		super();
		this.id = id;
		this.titre = titre;
		this.lieu = lieu;
		this.desc = desc;
		this.debut = debut;
		this.fin = fin;
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

	public String getLieu() {
		return lieu;
	}

	public void setLieu(String lieu) {
		this.lieu = lieu;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getDebut() {
		return debut;
	}

	public void setDebut(String debut) {
		this.debut = debut;
	}

	public String getFin() {
		return fin;
	}

	public void setFin(String fin) {
		this.fin = fin;
	}

	@Override
	public String toString() {
		return "Evenement [id=" + id + ", titre=" + titre + ", lieu=" + lieu + ", desc=" + desc + ", debut=" + debut
				+ ", fin=" + fin + "]";
	}	
}
