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
@Table(name = "airport") 
public class Aeroport {
	
	@Id 
	@GeneratedValue 
	private Long id;
	@Version
	private int version;
	@ManyToMany(mappedBy="aeroports")
	private List<Ville> villes = new ArrayList<Ville>();
	@Column(name="name")
	private String nom;

	public Aeroport() {
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

	public List<Ville> getVilles() {
		return villes;
	}

	public void setVilles(ArrayList<Ville> villes) {
		this.villes = villes;
	}

	public void addVille(Ville ville) {
		this.villes.add(ville);
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Aeroport(String nom) {
		super();
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Aeroport [villes=" + villes + ", nom=" + nom + "]";
	}

}
