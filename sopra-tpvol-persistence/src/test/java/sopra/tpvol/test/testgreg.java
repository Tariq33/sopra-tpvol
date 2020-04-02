package sopra.tpvol.test;

import java.util.Date;

import sopra.tpvol.Application;
import sopra.tpvol.model.Aeroport;
import sopra.tpvol.model.Arrivee;
import sopra.tpvol.model.Avion;
import sopra.tpvol.model.Compagnie;
import sopra.tpvol.model.Depart;
import sopra.tpvol.model.Trajet;
import sopra.tpvol.model.Ville;
import sopra.tpvol.model.Vol;

public class testgreg {

	public static void main(String[] args) {
		
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
	}

}
