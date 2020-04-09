package sopra.tpvol.persistence.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import sopra.tpvol.model.Depart;
import sopra.tpvol.persistence.IDepartDao;
@Repository
@Transactional
public class DepartDaoJpa implements IDepartDao {


	@PersistenceContext
	private EntityManager em; // entityManagerFactory.createEntityManager()

	@Override
	@Transactional(readOnly = true)
	public List<Depart> findAll() {
		TypedQuery<Depart> query = em.createQuery("from Depart", Depart.class);

		return query.getResultList();
	}

	@Override
	@Transactional(readOnly = true)
	public Depart find(Long id) {
		return em.find(Depart.class, id);
	}

	@Override
	public Depart save(Depart obj) {
		return em.merge(obj);
	}

	@Override
	public void delete(Depart obj) {
		em.remove(em.merge(obj));
	}

}
