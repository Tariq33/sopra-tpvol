package sopra.tpvol.model;

public class Paiement {
	private String type;
	private Float montant;
	private Reservation reservation;

	public Paiement() {
		super();
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Float getMontant() {
		return montant;
	}

	public void setMontant(Float montant) {
		this.montant = montant;
	}

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

	@Override
	public String toString() {
		return "Paiement [type=" + type + ", montant=" + montant + "]";
	}

}
