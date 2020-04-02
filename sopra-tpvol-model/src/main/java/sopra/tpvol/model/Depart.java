package sopra.tpvol.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

@Entity
@Table(name = "departure") 
public class Depart {
	
	@Id 
	@GeneratedValue 
	private Long id;
	@Version
	private int version;
	@OneToOne
	@JoinColumn(name="flight")
	private Vol vol;
	@ManyToOne
	@JoinColumn(name ="airport_id")
	private Aeroport aeroport;
	@Temporal(TemporalType.DATE)
	private Date dateDepart;

	public Depart() {
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

	public Depart(Vol vol) {
		super();
		this.vol = vol;
	}

	public Vol getVol() {
		return vol;
	}

	public void setVol(Vol vol) {
		this.vol = vol;
	}

	public Aeroport getAeroport() {
		return aeroport;
	}

	public void setAeroport(Aeroport aeroport) {
		this.aeroport = aeroport;
	}

	public Date getDateDepart() {
		return dateDepart;
	}

	public void setDateDepart(Date dateDepart) {
		this.dateDepart = dateDepart;
	}

	@Override
	public String toString() {
		return "Depart [aeroport=" + aeroport + ", dateDepart=" + dateDepart + "]";
	}

}
