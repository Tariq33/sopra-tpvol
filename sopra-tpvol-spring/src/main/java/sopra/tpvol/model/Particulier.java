package sopra.tpvol.model;


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

}
