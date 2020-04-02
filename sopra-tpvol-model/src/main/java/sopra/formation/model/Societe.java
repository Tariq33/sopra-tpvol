package tp.model;

public class Societe extends Client {
	private String siret;
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
