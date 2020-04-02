package sopra.tpvol.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Version;


@Entity
@Table(name = "city") 
public class Ville {
	
	@Id 
	@GeneratedValue 
	private Long id;
	@Version
	private int version;
	@Column(name="name")
	private String nom;
	@Column(name="country")
	private String pays;
	@ManyToMany
	private List<Aeroport> aeroports = new ArrayList<Aeroport>();

	public Ville() {
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

	public Ville(String nom) {
		super();
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public List<Aeroport> getAeroports() {
		return aeroports;
	}

	public void setAeroports(List<Aeroport> aeroports) {
		this.aeroports = aeroports;
	}
	
	public void addAeroports(Aeroport aeroports) {
		this.aeroports.add(aeroports);
	}

	@Override
	public String toString() {
		return "Ville [nom=" + nom + ", pays=" + pays + "]";
	}

}
