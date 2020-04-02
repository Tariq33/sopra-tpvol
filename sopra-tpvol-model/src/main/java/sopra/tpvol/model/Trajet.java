<<<<<<< HEAD:sopra-tpvol-model/src/main/java/sopra/tpvol/model/Trajet.java
package sopra.tpvol.model;

=======
package sopra.formation.model;
>>>>>>> master:sopra-tpvol-model/src/main/java/sopra/formation/model/Trajet.java
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
//import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.Version;

@Entity
@Table(name = "path") 
public class Trajet {
	
	@Id 
	@GeneratedValue 
	private Long id;
	@Version
	private int version;
	@Transient
//	@OneToOne(mappedBy = trajet);
	private Reservation reservation;
	@ManyToMany(mappedBy="trajets")
	private List<Vol> vols = new ArrayList<Vol>();

	public Trajet() {
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

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

	public List<Vol> getVols() {
		return vols;
	}

	public void setVols(ArrayList<Vol> vols) {
		this.vols = vols;
	}

	public void addVol(Vol vols) {
		this.vols.add(vols);
	}

	@Override
	public String toString() {
		return "Trajet [vols=" + vols + "]";
	}

}
