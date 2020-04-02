package sopra.tpvol;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import sopra.tpvol.persistence.IAeroportDao;
import sopra.tpvol.persistence.IArriveeDao;
import sopra.tpvol.persistence.IAvionDao;
import sopra.tpvol.persistence.ICompagnieDao;
import sopra.tpvol.persistence.IDepartDao;
import sopra.tpvol.persistence.ITrajetDao;
import sopra.tpvol.persistence.IVilleDao;
import sopra.tpvol.persistence.IVolDao;
import sopra.tpvol.persistence.jpa.AeroportDaoJpa;
import sopra.tpvol.persistence.jpa.ArriveeDaoJpa;
import sopra.tpvol.persistence.jpa.AvionDaoJpa;
import sopra.tpvol.persistence.jpa.CompagnieDaoJpa;
import sopra.tpvol.persistence.jpa.DepartDaoJpa;
import sopra.tpvol.persistence.jpa.TrajetDaoJpa;
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



}