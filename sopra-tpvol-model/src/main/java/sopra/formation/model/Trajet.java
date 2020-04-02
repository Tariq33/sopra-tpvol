package tp.model;

import java.util.ArrayList;

public class Trajet {
	private Reservation reservation;
	private ArrayList<Vol> vols = new ArrayList<Vol>();

	public Trajet() {
		super();
	}

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
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
		return "Trajet [vols=" + vols + "]";
	}

}
