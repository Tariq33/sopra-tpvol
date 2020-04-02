package tp.model;

import java.util.ArrayList;
import java.util.Date;

public class Passager {
	private String nom;
	private String prenom;
	private Date dateDeNaissance;
	private String nationalite;
	private String sexe;
	private String numeroPasseport;
	private Date dateValiditePasseport;
	private String typePieceIdentite;
	private Boolean handicap;
	private ArrayList<Reservation> reservations = new ArrayList<Reservation>();
	private Client client;

	public Passager(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
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

	public Date getDateDeNaissance() {
		return dateDeNaissance;
	}

	public void setDateDeNaissance(Date dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public String getNationalite() {
		return nationalite;
	}

	public void setNationalite(String nationalite) {
		this.nationalite = nationalite;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public String getNumeroPasseport() {
		return numeroPasseport;
	}

	public void setNumeroPasseport(String numeroPasseport) {
		this.numeroPasseport = numeroPasseport;
	}

	public Date getDateValiditePasseport() {
		return dateValiditePasseport;
	}

	public void setDateValiditePasseport(Date dateValiditePasseport) {
		this.dateValiditePasseport = dateValiditePasseport;
	}

	public String getTypePieceIdentite() {
		return typePieceIdentite;
	}

	public void setTypePieceIdentite(String typePieceIdentite) {
		this.typePieceIdentite = typePieceIdentite;
	}

	public Boolean getHandicap() {
		return handicap;
	}

	public void setHandicap(Boolean handicap) {
		this.handicap = handicap;
	}

	public ArrayList<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(ArrayList<Reservation> reservations) {
		this.reservations = reservations;
	}

	public void addReservation(Reservation reservation) {
		this.reservations.add(reservation);
	}

	@Override
	public String toString() {
		return "Passager [nom=" + nom + ", prenom=" + prenom + ", dateDeNaissance=" + dateDeNaissance + ", nationalite="
				+ nationalite + ", sexe=" + sexe + ", numeroPasseport=" + numeroPasseport + ", dateValiditePasseport="
				+ dateValiditePasseport + ", typePieceIdentite=" + typePieceIdentite + ", handicap=" + handicap + "]";
	}

}
