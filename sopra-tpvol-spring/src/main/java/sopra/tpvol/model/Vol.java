package sopra.tpvol.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name = "flight") 
public class Vol {

	@Id 
	@GeneratedValue 
	private Long id;
	@Version
	private int version;
	@Column(name="flight_number")
	private String numeroDeVol;
	@Column(name="open")
	private Boolean ouvert;
	@OneToOne
	@JoinColumn(name="departure_id")
	private Depart depart;
	@OneToOne
	@JoinColumn(name="arrival_id")
	private Arrivee arrivee;
	@ManyToOne
	@JoinColumn(name="plane_id")
	private Avion avion;
	@ManyToOne
	@JoinColumn(name="company_id")
	private Compagnie compagnie;
	@ManyToMany
	@JoinColumn(name ="path_id")
	private List<Trajet> trajets = new ArrayList<Trajet>();

	public Vol() {
		super();
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

	public List<Trajet> getTrajets() {
		return trajets;
	}

	public void setTrajets(ArrayList<Trajet> trajets) {
		this.trajets = trajets;
	}
	
	public void addTrajet(Trajet trajet) {
		this.trajets.add(trajet);
	}

}
