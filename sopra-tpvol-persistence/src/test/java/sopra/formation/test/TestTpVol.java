package sopra.formation.test;

import sopra.formation.Application;
import sopra.formation.model.Paiement;
import sopra.formation.model.Particulier;
import sopra.formation.model.Passager;
import sopra.formation.model.Reservation;
import sopra.formation.model.Societe;
import sopra.formation.model.Utilisateur;
import sopra.formation.persistence.IClientDao;
import sopra.formation.persistence.IPaiementDao;
import sopra.formation.persistence.IParticulierDao;
import sopra.formation.persistence.IPassagerDao;
import sopra.formation.persistence.IReservationDao;
import sopra.formation.persistence.ISocieteDao;
import sopra.formation.persistence.IUtilisateurDao;
import sopra.formation.persistence.jpa.ClientDaoJpa;
import sopra.formation.persistence.jpa.PaiementDaoJpa;
import sopra.formation.persistence.jpa.ParticulierDaoJpa;
import sopra.formation.persistence.jpa.PassagerDaoJpa;
import sopra.formation.persistence.jpa.ReservationDaoJpa;
import sopra.formation.persistence.jpa.SocieteDaoJpa;
import sopra.formation.persistence.jpa.UtilisateurDaoJpa;

public class TestTpVol {
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

	}
}