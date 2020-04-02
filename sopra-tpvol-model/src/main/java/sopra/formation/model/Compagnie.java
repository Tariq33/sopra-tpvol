package tp.model;

import java.util.ArrayList;

public class Compagnie {
	private String nom;
	private ArrayList<Vol> vols = new ArrayList<Vol>();

	public Compagnie() {
		super();
	}

	public Compagnie(String nom) {
		super();
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public ArrayList<Vol> getVols() {
		return vols;
	}

	public void setVols(ArrayList<Vol> vols) {
		this.vols = vols;
	}
	
	public void addVol(Vol vols) {
		this.vols.add(vols);
	}
	
	@Override
	public String toString() {
		return "Compagnie [nom=" + nom + "]";
	}

}
