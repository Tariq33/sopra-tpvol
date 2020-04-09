package sopra.tpvol.persistence.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import sopra.tpvol.model.Reservation;
import sopra.tpvol.persistence.IReservationDao;

@Repository
@Transactional
public class ReservationDaoJpa implements IReservationDao {

	@PersistenceContext
	private EntityManager em; // entityManagerFactory.createEntityManager()

	@Override
	@Transactional(readOnly = true)
	public List<Reservation> findAll() {
		
		TypedQuery<Reservation> query = em.createQuery("from Reservation", Reservation.class);

		return query.getResultList();
	}

	@Override
	@Transactional(readOnly = true)
	public Reservation find(Long id) {
		
		return em.find(Reservation.class, id);
	}

	@Override
	public Reservation save(Reservation obj) {
		
		return em.merge(obj);
	}

	@Override
	public void delete(Reservation obj) {
		
			em.remove(em.merge(obj));

	}


}