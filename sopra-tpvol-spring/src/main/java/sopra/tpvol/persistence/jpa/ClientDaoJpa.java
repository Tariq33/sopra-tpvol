package sopra.tpvol.persistence.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import sopra.tpvol.model.Client;
import sopra.tpvol.persistence.IClientDao;
@Repository
@Transactional
public class ClientDaoJpa implements IClientDao {


	@PersistenceContext
	private EntityManager em; // entityManagerFactory.createEntityManager()

	@Override
	@Transactional(readOnly = true)
	public List<Client> findAll() {
		TypedQuery<Client> query = em.createQuery("from Client", Client.class);

		return query.getResultList();
	}

	@Override
	@Transactional(readOnly = true)
	public Client find(Long id) {
		return em.find(Client.class, id);
	}

	@Override
	public Client save(Client obj) {
		return em.merge(obj);
	}

	@Override
	public void delete(Client obj) {
		em.remove(em.merge(obj));
	}


}