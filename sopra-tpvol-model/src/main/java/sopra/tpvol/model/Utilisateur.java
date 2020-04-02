<<<<<<< HEAD:sopra-tpvol-model/src/main/java/sopra/tpvol/model/Utilisateur.java
package sopra.tpvol.model;
=======
package sopra.formation.model;
>>>>>>> master:sopra-tpvol-model/src/main/java/sopra/formation/model/Utilisateur.java

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name = "user_account")
public class Utilisateur {
	@Id
	@GeneratedValue
	private Long id;
	@Version
	private int version;
	@Column(name = "username")
	private String identifiant;
	@Column(name = "password")
	private String motDePasse;
	
	@OneToOne(mappedBy="utilisateur")
	private Client client;

	public Utilisateur() {
		super();
	}

	public Utilisateur(String identifiant, String motDePasse) {
		super();
		this.identifiant = identifiant;
		this.motDePasse = motDePasse;
	}

	public String getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
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
		return "Utilisateur [identifiant=" + identifiant + ", motDePasse=" + motDePasse + "]";
	}

}
