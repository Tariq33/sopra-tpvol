package sopra.tpvol.persistence.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import sopra.tpvol.model.Paiement;
import sopra.tpvol.persistence.IPaiementDao;
@Repository
@Transactional
public class PaiementDaoJpa implements IPaiementDao {

	@PersistenceContext
	private EntityManager em; // entityManagerFactory.createEntityManager()

	@Override
	@Transactional(readOnly = true)
	public List<Paiement> findAll() {
		TypedQuery<Paiement> query = em.createQuery("from Paiement", Paiement.class);

		return query.getResultList();
	}

	@Override
	@Transactional(readOnly = true)
	public Paiement find(Long id) {
		return em.find(Paiement.class, id);
	}

	@Override
	public Paiement save(Paiement obj) {
		return em.merge(obj);
	}

	@Override
	public void delete(Paiement obj) {
		em.remove(em.merge(obj));
	}


}