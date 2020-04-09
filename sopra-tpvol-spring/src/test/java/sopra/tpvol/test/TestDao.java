package sopra.tpvol.test;

import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import sopra.tpvol.model.Aeroport;
import sopra.tpvol.model.Arrivee;
import sopra.tpvol.model.Avion;
import sopra.tpvol.model.Compagnie;
import sopra.tpvol.model.Depart;
import sopra.tpvol.model.Paiement;
import sopra.tpvol.model.Particulier;
import sopra.tpvol.model.Passager;
import sopra.tpvol.model.Reservation;
import sopra.tpvol.model.Societe;
import sopra.tpvol.model.Trajet;
import sopra.tpvol.model.Utilisateur;
import sopra.tpvol.model.Ville;
import sopra.tpvol.model.Vol;
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

public class TestDao {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

		IClientDao clientDao =context.getBean(IClientDao.class);
		IPaiementDao paiementDao = context.getBean(IPaiementDao.class);
		IParticulierDao particulierDao = context.getBean(IParticulierDao.class);
		IPassagerDao passagerDao = context.getBean(IPassagerDao.class);
		IReservationDao reservationDao = context.getBean(IReservationDao.class);
		ISocieteDao societeDao = context.getBean(ISocieteDao.class);
		IUtilisateurDao utilisateurDao = context.getBean(IUtilisateurDao.class);
		ICompagnieDao compagnieDao = context.getBean(ICompagnieDao.class);
		IVolDao volDao = context.getBean(IVolDao.class);
		IDepartDao departDao = context.getBean(IDepartDao.class);
		IArriveeDao arriveeDao = context.getBean(IArriveeDao.class);
		IAvionDao avionDao = context.getBean(IAvionDao.class);
		ITrajetDao trajetDao = context.getBean(ITrajetDao.class);
		IAeroportDao aeroportDao = context.getBean(IAeroportDao.class);
		IVilleDao villeDao = context.getBean(IVilleDao.class);

		Utilisateur userKevin = new Utilisateur("userKevin", "mdpKevin");
		Utilisateur userSopra = new Utilisateur("userSopra", "mdpSopra");

		userKevin = utilisateurDao.save(userKevin);
		userSopra = utilisateurDao.save(userSopra);

		Societe sopraSteria = new Societe();
		sopraSteria.setNom("Sopra Steria");
		sopraSteria.setSiret("ABC123");

		Particulier kevinParticulier = new Particulier();
		kevinParticulier.setPrenom("Kevin");
		kevinParticulier.setNom("Bougis");
		kevinParticulier.setPays("France");

		kevinParticulier.setUtilisateur(userKevin);
		sopraSteria.setUtilisateur(userSopra);

		sopraSteria = societeDao.save(sopraSteria);
		kevinParticulier = particulierDao.save(kevinParticulier);

		// Deux clients sopraSteria et kevin

		Passager kevinPassager = new Passager("Bougis", "Kevin");

		kevinPassager.setClient(kevinParticulier);

		kevinPassager = passagerDao.save(kevinPassager);

		// Kevin prend un billet pour lui meme

		Paiement kevinPaiement = new Paiement();
		kevinPaiement.setMontant(123.45f);
		kevinPaiement.setType("Paypal");

		kevinPaiement = paiementDao.save(kevinPaiement);

		Reservation kevinResa = new Reservation();
		kevinResa.setAnnulee(false);
		kevinResa.setConfirmee(true);
		kevinResa.setClient(kevinParticulier);
		kevinResa.setPassager(kevinPassager);
		kevinResa.setPaiement(kevinPaiement);

		kevinResa = reservationDao.save(kevinResa);

		Compagnie optarel = new Compagnie("Optarel");
		optarel = compagnieDao.save(optarel);

		Ville jonzac = new Ville("Jonzac");
		jonzac = villeDao.save(jonzac);

		Ville bordeaux = new Ville("Bordeaux");
		bordeaux = villeDao.save(bordeaux);

		Aeroport gatineaux = new Aeroport("Gatineaux");
		gatineaux = aeroportDao.save(gatineaux);

		Aeroport villenave = new Aeroport("Villenave");
		villenave = aeroportDao.save(villenave);

		jonzac.addAeroports(gatineaux);
		jonzac = villeDao.save(jonzac);

		bordeaux.addAeroports(villenave);
		bordeaux = villeDao.save(bordeaux);

		Avion airfrance = new Avion("AirFrance");
		airfrance.setModele("bien francais");
		airfrance = avionDao.save(airfrance);

		Vol bunny = new Vol("Bunny");
		bunny.setOuvert(true);
		bunny = volDao.save(bunny);

		bunny.setAvion(airfrance);
		bunny.setCompagnie(optarel);
		bunny = volDao.save(bunny);

		Depart depart = new Depart();
		depart.setDateDepart(new Date());
		depart.setAeroport(gatineaux);
		depart = departDao.save(depart);

		Arrivee arrivee = new Arrivee();
		arrivee.setDateArrivee(new Date());
		arrivee.setAeroport(villenave);
		arrivee = arriveeDao.save(arrivee);

		bunny.setDepart(depart);
		bunny.setArrivee(arrivee);
		bunny = volDao.save(bunny);

		Trajet trajet = new Trajet();
		trajet = trajetDao.save(trajet);

		bunny.addTrajet(trajet);
		bunny = volDao.save(bunny);

		kevinResa.setTrajet(trajet);
		kevinResa = reservationDao.save(kevinResa);
		
		context.close();

	}
}
