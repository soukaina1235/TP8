package cigma.pfe.DAO;

import cigma.pfe.models.Client;

public interface IclientDao {

	boolean save(Client c);
	Client find(Long id);
	Client update(Client c);
	void delete(Client c);


}
