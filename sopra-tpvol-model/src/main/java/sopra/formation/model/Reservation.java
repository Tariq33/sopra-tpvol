package sopra.formation.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.Version;

@Entity
@Table(name = "booking")
public class Reservation {
	@Id
	@GeneratedValue
	private Long id;
	@Version
	private int version;
	@Column(name = "cancelled", nullable = false)
	private Boolean annulee;
	@Column(name = "confirmed")
	private Boolean confirmee;
	@Column(name = "open")
	private Boolean ouverte;
	@Column(name = "booking_number")
	private String numeroDeReservation;

	@OneToOne
	@JoinColumn(name = "payment_id")
	private Paiement paiement;
	
	@ManyToOne
	@JoinColumn(name = "client_id")
	private Client client;
	
	@ManyToOne
	@JoinColumn(name = "passenger_id")
	private Passager passager;
	
//	@OneToOne
//	@JoinColumn(name = "flight_id")
	@Transient
	private Trajet trajet;

	public Reservation() {
		super();
	}

	public Boolean getAnnulee() {
		return annulee;
	}

	public void setAnnulee(Boolean annulee) {
		this.annulee = annulee;
	}

	public Boolean getConfirmee() {
		return confirmee;
	}

	public void setConfirmee(Boolean confirmee) {
		this.confirmee = confirmee;
	}

	public Boolean getOuverte() {
		return ouverte;
	}

	public void setOuverte(Boolean ouverte) {
		this.ouverte = ouverte;
	}

	public String getNumeroDeReservation() {
		return numeroDeReservation;
	}

	public void setNumeroDeReservation(String numeroDeReservation) {
		this.numeroDeReservation = numeroDeReservation;
	}

	public Paiement getPaiement() {
		return paiement;
	}

	public void setPaiement(Paiement paiement) {
		this.paiement = paiement;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Passager getPassager() {
		return passager;
	}

	public void setPassager(Passager passager) {
		this.passager = passager;
	}

	public Trajet getTrajet() {
		return trajet;
	}

	public void setTrajet(Trajet trajet) {
		this.trajet = trajet;
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
		return "Reservation [annulee=" + annulee + ", confirmee=" + confirmee + ", ouverte=" + ouverte
				+ ", numeroDeReservation=" + numeroDeReservation + ", paiement=" + paiement + ", passager=" + passager
				+ ", trajet=" + trajet + "]";
	}

}
