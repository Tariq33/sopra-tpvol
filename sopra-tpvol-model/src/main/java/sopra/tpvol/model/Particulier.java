<<<<<<< HEAD:sopra-tpvol-model/src/main/java/sopra/tpvol/model/Particulier.java
package sopra.tpvol.model;
=======
package sopra.formation.model;
>>>>>>> master:sopra-tpvol-model/src/main/java/sopra/formation/model/Particulier.java

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("Particulier")
@Table(name = "private_individual")
public class Particulier extends Client {
	@Column(name = "first_name")
	private String prenom;

	public Particulier() {
		super();
	}

	public Particulier(String mail) {
		super(mail);
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Override
	public String toString() {
		return "Particulier [prenom=" + prenom + super.toString() + "]";
	}

}
