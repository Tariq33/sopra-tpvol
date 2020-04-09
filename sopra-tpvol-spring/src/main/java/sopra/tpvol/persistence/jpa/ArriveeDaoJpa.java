package sopra.tpvol.persistence.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import sopra.tpvol.model.Arrivee;
import sopra.tpvol.persistence.IArriveeDao;
@Repository
@Transactional
public class ArriveeDaoJpa implements IArriveeDao {

	@PersistenceContext
	private EntityManager em; // entityManagerFactory.createEntityManager()

	@Override
	@Transactional(readOnly = true)
	public List<Arrivee> findAll() {
		TypedQuery<Arrivee> query = em.createQuery("from Arrivee", Arrivee.class);

		return query.getResultList();
	}

	@Override
	@Transactional(readOnly = true)
	public Arrivee find(Long id) {
		return em.find(Arrivee.class, id);
	}

	@Override
	public Arrivee save(Arrivee obj) {
		return em.merge(obj);
	}

	@Override
	public void delete(Arrivee obj) {
		em.remove(em.merge(obj));
	}

}
