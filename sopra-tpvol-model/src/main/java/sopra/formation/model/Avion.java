package sopra.formation.model;

import java.util.ArrayList;

public class Avion {
	private String modele;
	private ArrayList<Vol> vols = new ArrayList<Vol>();

	public Avion() {
		super();
	}

	public Avion(String modele) {
		super();
		this.modele = modele;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
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
		return "Avion [modele=" + modele + "]";
	}

}
