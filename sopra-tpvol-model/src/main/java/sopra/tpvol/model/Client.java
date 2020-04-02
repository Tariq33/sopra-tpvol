package sopra.tpvol.model;

import java.util.ArrayList;

public class Client {
	private String type;
	private String nom;
	private String mail;
	private String telephone;
	private int numeroAdresse;
	private String rue;
	private String complementAdresse;
	private int codePostal;
	private String ville;
	private String pays;
	private Utilisateur utilisateur;
	private ArrayList<Passager> passagers = new ArrayList<Passager>();
	private ArrayList<Reservation> reservations = new ArrayList<Reservation>();

	public Client() {
		super();
	}

	public ArrayList<Passager> getPassagers() {
		return passagers;
	}

	public void setPassagers(ArrayList<Passager> passagers) {
		this.passagers = passagers;
	}
	
	public void addPassager(Passager passager) {
		this.passagers.add(passager);
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

	public Client(String mail) {
		super();
		this.mail = mail;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public int getNumeroAdresse() {
		return numeroAdresse;
	}

	public void setNumeroAdresse(int numeroAdresse) {
		this.numeroAdresse = numeroAdresse;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getComplementAdresse() {
		return complementAdresse;
	}

	public void setComplementAdresse(String complementAdresse) {
		this.complementAdresse = complementAdresse;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	@Override
	public String toString() {
		return "Client [type=" + type + ", nom=" + nom + ", mail=" + mail + ", telephone=" + telephone
				+ ", numeroAdresse=" + numeroAdresse + ", rue=" + rue + ", complementAdresse=" + complementAdresse
				+ ", codePostal=" + codePostal + ", ville=" + ville + ", pays=" + pays + ", passagers=" + passagers
				+ ", reservations=" + reservations + "]";
	}

}
