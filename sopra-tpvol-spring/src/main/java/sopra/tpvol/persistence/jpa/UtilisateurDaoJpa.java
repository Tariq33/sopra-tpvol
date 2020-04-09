package sopra.tpvol.persistence.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import sopra.tpvol.model.Utilisateur;
import sopra.tpvol.persistence.IUtilisateurDao;

@Repository
@Transactional
public class UtilisateurDaoJpa implements IUtilisateurDao {

	@PersistenceContext
	private EntityManager em; // entityManagerFactory.createEntityManager()

	@Override
	@Transactional(readOnly = true)
	public List<Utilisateur> findAll() {
		
		TypedQuery<Utilisateur> query = em.createQuery("from Utilisateur", Utilisateur.class);

		return query.getResultList();
	}

	@Override
	@Transactional(readOnly = true)
	public Utilisateur find(Long id) {
		
		return em.find(Utilisateur.class, id);
	}

	@Override
	public Utilisateur save(Utilisateur obj) {
		
		return em.merge(obj);
	}

	@Override
	public void delete(Utilisateur obj) {
		
			em.remove(em.merge(obj));

	}


}