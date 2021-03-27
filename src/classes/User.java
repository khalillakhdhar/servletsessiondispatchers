package classes;

public class User {
	private String nom,prenom,adresse;
	private int age;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public User(String nom, String prenom, String adresse, int age) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.age = age;
	}
	public User() {
		super();
	}
	
	
	

}
