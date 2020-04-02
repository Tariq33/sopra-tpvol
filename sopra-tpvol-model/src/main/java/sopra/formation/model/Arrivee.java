package sopra.formation.model;

import java.util.Date;

public class Arrivee {
	private Date dateArrivee;
	private Aeroport aeroport;
	private Vol vol;

	public Arrivee() {
		super();
	}

	public Arrivee(Vol vol) {
		super();
		this.vol = vol;
	}

	public Date getDateArrivee() {
		return dateArrivee;
	}

	public void setDateArrivee(Date dateArrivee) {
		this.dateArrivee = dateArrivee;
	}

	public Aeroport getAeroport() {
		return aeroport;
	}

	public void setAeroport(Aeroport aeroport) {
		this.aeroport = aeroport;
	}

	public Vol getVol() {
		return vol;
	}

	public void setVol(Vol vol) {
		this.vol = vol;
	}

	@Override
	public String toString() {
		return "Arrivee [dateArrivee=" + dateArrivee + ", aeroport=" + aeroport + "]";
	}

}
