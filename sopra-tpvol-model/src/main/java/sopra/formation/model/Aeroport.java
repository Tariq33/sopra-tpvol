package sopra.formation.model;

import java.util.ArrayList;

public class Aeroport {
	private ArrayList<Ville> villes = new ArrayList<Ville>();
	private String nom;

	public Aeroport() {
		super();
	}

	public ArrayList<Ville> getVilles() {
		return villes;
	}

	public void setVilles(ArrayList<Ville> villes) {
		this.villes = villes;
	}

	public void addVille(Ville ville) {
		this.villes.add(ville);
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Aeroport(String nom) {
		super();
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Aeroport [villes=" + villes + ", nom=" + nom + "]";
	}

}
