package tp.model;

import java.util.ArrayList;

public class Vol {

	private String numeroDeVol;
	private Boolean ouvert;
	private Depart depart;
	private Arrivee arrivee;
	private Avion avion;
	private Compagnie compagnie;
	private ArrayList<Trajet> trajets = new ArrayList<Trajet>();

	public Vol() {
		super();
	}

	public Vol(String numeroDeVol) {
		super();
		this.numeroDeVol = numeroDeVol;
	}

	public String getNumeroDeVol() {
		return numeroDeVol;
	}

	public void setNumeroDeVol(String numeroDeVol) {
		this.numeroDeVol = numeroDeVol;
	}

	public Boolean getOuvert() {
		return ouvert;
	}

	public void setOuvert(Boolean ouvert) {
		this.ouvert = ouvert;
	}

	public Depart getDepart() {
		return depart;
	}

	public void setDepart(Depart depart) {
		this.depart = depart;
	}

	public Arrivee getArrivee() {
		return arrivee;
	}

	public void setArrivee(Arrivee arrivee) {
		this.arrivee = arrivee;
	}

	public Avion getAvion() {
		return avion;
	}

	public void setAvion(Avion avion) {
		this.avion = avion;
	}

	public Compagnie getCompagnie() {
		return compagnie;
	}

	public void setCompagnie(Compagnie compagnie) {
		this.compagnie = compagnie;
	}

	public ArrayList<Trajet> getTrajets() {
		return trajets;
	}

	public void setTrajets(ArrayList<Trajet> trajets) {
		this.trajets = trajets;
	}
	
	public void addTrajet(Trajet trajet) {
		this.trajets.add(trajet);
	}

	@Override
	public String toString() {
		return "Vol [numeroDeVol=" + numeroDeVol + ", ouvert=" + ouvert + ", depart=" + depart + ", arrivee=" + arrivee
				+ ", avion=" + avion + ", compagnie=" + compagnie + "]";
	}

}
