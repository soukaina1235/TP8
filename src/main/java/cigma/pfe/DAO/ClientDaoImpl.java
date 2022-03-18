package cigma.pfe.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import cigma.pfe.models.Client;

public class ClientDaoImpl implements IclientDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("client_operation");
	EntityManager entityManager = entityManagerFactory.createEntityManager();

	public ClientDaoImpl() {
	}

	@Override
	public boolean save(Client c) {
		entityManager.getTransaction().begin();
		entityManager.persist(c);
		entityManager.getTransaction().commit();
		return true;
	}

	@Override
	public Client find(Long id) {
		entityManager.getTransaction().begin();
		Client clientexist = entityManager.find(Client.class, id);
		System.out.println("Client trouver : " + clientexist.getId() + " \n -->name : " + clientexist.getName());
		entityManager.getTransaction().commit();
		return clientexist;
	}

	@Override
	public Client update(Client c) {
		entityManager.getTransaction().begin();
		Client clientexist = entityManager.find(Client.class, c.getId());
		clientexist.setName(c.getName());
		entityManager.getTransaction().commit();

		return clientexist;
	}

	@Override
	public void delete(Client c) {
		entityManager.getTransaction().begin();
		Client clientexist = entityManager.find(Client.class, c.getId());
		entityManager.remove(clientexist);
		entityManager.getTransaction().commit();
		System.out.println("client numéro : " + clientexist.getId() + "  a été bien supprimer");

	}

}
