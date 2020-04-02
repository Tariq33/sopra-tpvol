<<<<<<< HEAD:sopra-tpvol-model/src/main/java/sopra/tpvol/model/Passager.java
package sopra.tpvol.model;
=======
package sopra.formation.model;
>>>>>>> master:sopra-tpvol-model/src/main/java/sopra/formation/model/Passager.java

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name = "passenger")
public class Passager {
	@Id
	@GeneratedValue
	private Long id;
	@Version
	private int version;
	@Column(name = "last_name")
	private String nom;
	@Column(name = "first_name")
	private String prenom;
	@Column(name = "birth_date")
	private Date dateDeNaissance;
	@Column(name = "nationality")
	private String nationalite;
	@Column(name = "gender")
	private String sexe;
	@Column(name = "passport_number")
	private String numeroPasseport;
	@Column(name = "passport_validity_date")
	private Date dateValiditePasseport;
	@Column(name = "id_type")
	private String typePieceIdentite;
	@Column(name = "handicap")
	private Boolean handicap;

	@OneToMany(mappedBy = "passager")
	private List<Reservation> reservations = new ArrayList<Reservation>();
	
	@ManyToOne
	@JoinColumn(name = "client_id")
	private Client client;

	public Passager() {
		super();
	}

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

	public List<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(ArrayList<Reservation> reservations) {
		this.reservations = reservations;
	}

	public void addReservation(Reservation reservation) {
		this.reservations.add(reservation);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "Passager [nom=" + nom + ", prenom=" + prenom + ", dateDeNaissance=" + dateDeNaissance + ", nationalite="
				+ nationalite + ", sexe=" + sexe + ", numeroPasseport=" + numeroPasseport + ", dateValiditePasseport="
				+ dateValiditePasseport + ", typePieceIdentite=" + typePieceIdentite + ", handicap=" + handicap + "]";
	}

}
