package sopra.tpvol.persistence.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import sopra.tpvol.model.Aeroport;
import sopra.tpvol.persistence.IAeroportDao;

@Repository
@Transactional
public class AeroportDaoJpa implements IAeroportDao {

	@PersistenceContext
	private EntityManager em; // entityManagerFactory.createEntityManager()

	@Override
	@Transactional(readOnly = true)
	public List<Aeroport> findAll() {
		TypedQuery<Aeroport> query = em.createQuery("from Aeroport", Aeroport.class);

		return query.getResultList();
	}

	@Override
	@Transactional(readOnly = true)
	public Aeroport find(Long id) {
		return em.find(Aeroport.class, id);
	}

	@Override
	public Aeroport save(Aeroport obj) {
		return em.merge(obj);
	}

	@Override
	public void delete(Aeroport obj) {
		em.remove(em.merge(obj));
	}

}
