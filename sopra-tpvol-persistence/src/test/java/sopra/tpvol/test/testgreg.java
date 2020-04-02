package sopra.tpvol.test;

import java.util.Date;

import sopra.tpvol.Application;
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
import sopra.tpvol.persistence.IClientDao;
import sopra.tpvol.persistence.IPaiementDao;
import sopra.tpvol.persistence.IParticulierDao;
import sopra.tpvol.persistence.IPassagerDao;
import sopra.tpvol.persistence.IReservationDao;
import sopra.tpvol.persistence.ISocieteDao;
import sopra.tpvol.persistence.IUtilisateurDao;

public class testgreg {

	public static void main(String[] args) {
		

		IClientDao clientDao = Application.getInstance().getClientDao();
		IPaiementDao paiementDao = Application.getInstance().getPaiementDao();
		IParticulierDao particulierDao = Application.getInstance().getParticulierDao();
		IPassagerDao passagerDao = Application.getInstance().getPassagerDao();
		IReservationDao reservationDao = Application.getInstance().getReservationDao();
		ISocieteDao societeDao = Application.getInstance().getSocieteDao();
		IUtilisateurDao utilisateurDao = Application.getInstance().getUtilisateurDao();

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
		optarel = Application.getInstance().getCompagnieDao().save(optarel);
		
		
		Ville jonzac = new Ville("Jonzac");
		jonzac = Application.getInstance().getVilleDao().save(jonzac);
		
		Ville bordeaux = new Ville("Bordeaux");
		bordeaux = Application.getInstance().getVilleDao().save(bordeaux);
		
		
		Aeroport gatineaux = new Aeroport("Gatineaux");
		gatineaux = Application.getInstance().getAeroportDao().save(gatineaux);
		
		Aeroport villenave = new Aeroport("Villenave");
		villenave = Application.getInstance().getAeroportDao().save(villenave);
			
		
		jonzac.addAeroports(gatineaux);
		jonzac = Application.getInstance().getVilleDao().save(jonzac);
		
		bordeaux.addAeroports(villenave);
		bordeaux = Application.getInstance().getVilleDao().save(bordeaux);
		
		Avion airfrance = new Avion("AirFrance");		
		airfrance.setModele("bien francais");
		airfrance = Application.getInstance().getAvionDao().save(airfrance);
		
		Vol bunny = new Vol("Bunny");
		bunny.setOuvert(true);
		bunny = Application.getInstance().getVolDao().save(bunny);
		
		bunny.setAvion(airfrance);
		bunny.setCompagnie(optarel);
		bunny = Application.getInstance().getVolDao().save(bunny);
		
		Depart depart = new Depart();
		depart.setDateDepart(new Date());
		depart.setAeroport(gatineaux);
		depart = Application.getInstance().getDepartDao().save(depart);
		
		Arrivee arrivee = new Arrivee();
		arrivee.setDateArrivee(new Date());
		arrivee.setAeroport(villenave);
		arrivee = Application.getInstance().getArriveeDao().save(arrivee);
		
		bunny.setDepart(depart);
		bunny.setArrivee(arrivee);
		bunny = Application.getInstance().getVolDao().save(bunny);	
		
		Trajet trajet = new Trajet();
		trajet = Application.getInstance().getTrajetDao().save(trajet);	
		
		bunny.addTrajet(trajet);
		bunny = Application.getInstance().getVolDao().save(bunny);	
		
		
		kevinResa.setTrajet(trajet);
		kevinResa = reservationDao.save(kevinResa);
		
		
		
		
		
	}

}
