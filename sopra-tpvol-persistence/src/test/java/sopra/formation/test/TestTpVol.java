package sopra.formation.test;

import sopra.tpvol.Application;
import sopra.tpvol.model.Paiement;
import sopra.tpvol.model.Particulier;
import sopra.tpvol.model.Passager;
import sopra.tpvol.model.Reservation;
import sopra.tpvol.model.Societe;
import sopra.tpvol.model.Utilisateur;
import sopra.tpvol.persistence.IClientDao;
import sopra.tpvol.persistence.IPaiementDao;
import sopra.tpvol.persistence.IParticulierDao;
import sopra.tpvol.persistence.IPassagerDao;
import sopra.tpvol.persistence.IReservationDao;
import sopra.tpvol.persistence.ISocieteDao;
import sopra.tpvol.persistence.IUtilisateurDao;

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