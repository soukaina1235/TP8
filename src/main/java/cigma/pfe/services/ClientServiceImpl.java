package cigma.pfe.services;

import cigma.pfe.DAO.ClientDaoImpl;
import cigma.pfe.models.Client;
import lombok.Data;

@Data
public class ClientServiceImpl implements ClientService {

	ClientDaoImpl clientDaoImpl;

	@Override
	public boolean save(Client c) {
		return clientDaoImpl.save(c);
	}

	@Override
	public Client find(Long id) {
		return clientDaoImpl.find(id);
	}

	@Override
	public Client update(Client c) {
	
		return clientDaoImpl.update(c);
	}

	@Override
	public void delete(Client c) {
		clientDaoImpl.delete(c);
	}

	public ClientDaoImpl getClientDaoImpl() {
		return clientDaoImpl;
	}

	public void setClientDaoImpl(ClientDaoImpl clientDaoImpl) {
		this.clientDaoImpl = clientDaoImpl;
	}

	public ClientServiceImpl(ClientDaoImpl clientDaoImpl) {

		this.clientDaoImpl = clientDaoImpl;
	}

	public ClientServiceImpl() {
	}

}
