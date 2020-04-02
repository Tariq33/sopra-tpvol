package sopra.formation;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import sopra.formation.persistence.IPaiementDao;
import sopra.formation.persistence.IParticulierDao;
import sopra.formation.persistence.IPassagerDao;
import sopra.formation.persistence.IReservationDao;
import sopra.formation.persistence.IClientDao;
import sopra.formation.persistence.ISocieteDao;
import sopra.formation.persistence.IUtilisateurDao;
import sopra.formation.persistence.jpa.ClientDaoJpa;
import sopra.formation.persistence.jpa.PaiementDaoJpa;
import sopra.formation.persistence.jpa.ParticulierDaoJpa;
import sopra.formation.persistence.jpa.PassagerDaoJpa;
import sopra.formation.persistence.jpa.ReservationDaoJpa;
import sopra.formation.persistence.jpa.SocieteDaoJpa;
import sopra.formation.persistence.jpa.UtilisateurDaoJpa;

public class Application {
	private static Application instance = null;

	private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("sopra-tpvol");

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

	public EntityManagerFactory getEmf() {
		return emf;
	}

}