package dcll.adial.ws_covoiturage;

public class Inscrit {

	private String nom;
	private String prenom;
	private String adresse; //Création d'un type adresse ?
	
	public Inscrit(String n, String p, String a) {
		nom = n;
		prenom = p;
		adresse = a;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

}
