package sopra.tpvol;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import sopra.tpvol.persistence.IAeroportDao;
import sopra.tpvol.persistence.IArriveeDao;
import sopra.tpvol.persistence.IAvionDao;
import sopra.tpvol.persistence.IClientDao;
import sopra.tpvol.persistence.ICompagnieDao;
import sopra.tpvol.persistence.IDepartDao;
import sopra.tpvol.persistence.IPaiementDao;
import sopra.tpvol.persistence.IParticulierDao;
import sopra.tpvol.persistence.IPassagerDao;
import sopra.tpvol.persistence.IReservationDao;
import sopra.tpvol.persistence.ISocieteDao;
import sopra.tpvol.persistence.ITrajetDao;
import sopra.tpvol.persistence.IUtilisateurDao;
import sopra.tpvol.persistence.IVilleDao;
import sopra.tpvol.persistence.IVolDao;
import sopra.tpvol.persistence.jpa.AeroportDaoJpa;
import sopra.tpvol.persistence.jpa.ArriveeDaoJpa;
import sopra.tpvol.persistence.jpa.AvionDaoJpa;
import sopra.tpvol.persistence.jpa.ClientDaoJpa;
import sopra.tpvol.persistence.jpa.CompagnieDaoJpa;
import sopra.tpvol.persistence.jpa.DepartDaoJpa;
import sopra.tpvol.persistence.jpa.PaiementDaoJpa;
import sopra.tpvol.persistence.jpa.ParticulierDaoJpa;
import sopra.tpvol.persistence.jpa.PassagerDaoJpa;
import sopra.tpvol.persistence.jpa.ReservationDaoJpa;
import sopra.tpvol.persistence.jpa.SocieteDaoJpa;
import sopra.tpvol.persistence.jpa.TrajetDaoJpa;
import sopra.tpvol.persistence.jpa.UtilisateurDaoJpa;
import sopra.tpvol.persistence.jpa.VilleDaoJpa;
import sopra.tpvol.persistence.jpa.VolDaoJpa;

public class Application {
	private static Application instance = null;

	private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("sopra-tpvol");

	private final IAeroportDao aeroportDao = new AeroportDaoJpa();
	private final IArriveeDao arriveeDao = new ArriveeDaoJpa();
	private final IAvionDao avionDao = new AvionDaoJpa();
	private final ICompagnieDao compagnieDao = new CompagnieDaoJpa();
	private final IDepartDao departDao = new DepartDaoJpa();
	private final ITrajetDao trajetDao = new TrajetDaoJpa();
	private final IVilleDao villeDao = new VilleDaoJpa();
	private final IVolDao volDao = new VolDaoJpa();
	private final IClientDao clientDao = new ClientDaoJpa();
	private final IPaiementDao paiementDao = new PaiementDaoJpa();
	private final IParticulierDao particulierDao = new ParticulierDaoJpa();
	private final IPassagerDao passagerDao = new PassagerDaoJpa();
	private final IReservationDao reservationDao = new ReservationDaoJpa();
	private final ISocieteDao societeDao = new SocieteDaoJpa();
	private final IUtilisateurDao utilisateurDao = new UtilisateurDaoJpa();
	
	

	private Application() {
	}

	public static Application getInstance() {
		if (instance == null) {
			instance = new Application();
		}

		return instance;
	}

	public EntityManagerFactory getEmf() {
		return emf;
	}

	public IAeroportDao getAeroportDao() {
		return aeroportDao;
	}

	public IArriveeDao getArriveeDao() {
		return arriveeDao;
	}

	public IAvionDao getAvionDao() {
		return avionDao;
	}

	public ICompagnieDao getCompagnieDao() {
		return compagnieDao;
	}

	public IDepartDao getDepartDao() {
		return departDao;
	}

	public ITrajetDao getTrajetDao() {
		return trajetDao;
	}

	public IVilleDao getVilleDao() {
		return villeDao;
	}

	public IVolDao getVolDao() {
		return volDao;
	}

	public IClientDao getClientDao() {
		return clientDao;
	}

	public IPaiementDao getPaiementDao() {
		return paiementDao;
	}

	public IParticulierDao getParticulierDao() {
		return particulierDao;
	}

	public IPassagerDao getPassagerDao() {
		return passagerDao;
	}

	public IReservationDao getReservationDao() {
		return reservationDao;
	}

	public ISocieteDao getSocieteDao() {
		return societeDao;
	}

	public IUtilisateurDao getUtilisateurDao() {
		return utilisateurDao;
	}

}