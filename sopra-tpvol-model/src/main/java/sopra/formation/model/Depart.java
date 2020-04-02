package tp.model;

import java.util.Date;

public class Depart {
	private Vol vol;
	private Aeroport aeroport;
	private Date dateDepart;

	public Depart() {
		super();
	}

	public Depart(Vol vol) {
		super();
		this.vol = vol;
	}

	public Vol getVol() {
		return vol;
	}

	public void setVol(Vol vol) {
		this.vol = vol;
	}

	public Aeroport getAeroport() {
		return aeroport;
	}

	public void setAeroport(Aeroport aeroport) {
		this.aeroport = aeroport;
	}

	public Date getDateDepart() {
		return dateDepart;
	}

	public void setDateDepart(Date dateDepart) {
		this.dateDepart = dateDepart;
	}

	@Override
	public String toString() {
		return "Depart [aeroport=" + aeroport + ", dateDepart=" + dateDepart + "]";
	}

}
