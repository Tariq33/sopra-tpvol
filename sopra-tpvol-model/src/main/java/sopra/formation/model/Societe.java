package sopra.formation.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("Societe")
@Table(name = "company")
public class Societe extends Client {
	@Column(name = "company_identification_number")
	private String siret;
	@Column(name = "vat_number")
	private String numeroDeTva;

	public Societe() {
		super();
	}

	public String getSiret() {
		return siret;
	}

	public void setSiret(String siret) {
		this.siret = siret;
	}

	public String getNumeroDeTva() {
		return numeroDeTva;
	}

	public void setNumeroDeTva(String numeroDeTva) {
		this.numeroDeTva = numeroDeTva;
	}

	@Override
	public String toString() {
		return "Societe [siret=" + siret + ", numeroDeTva=" + numeroDeTva + super.toString() + "]";
	}

}
