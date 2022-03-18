package cigma.pfe.controllers;

import cigma.pfe.models.Client;
import cigma.pfe.services.ClientService;
import lombok.Data;

@Data
public class ClientController {

	ClientService clientService;

	public boolean save(Client c) {
		return clientService.save(c);
	}

	public Client find(Long id) {
		return clientService.find(id);
	}

	public Client update(Client c) {
		return clientService.update(c);
	}
	
	public void delete(Client c) {
		clientService.delete(c);
	}

	public ClientController() {
	}

	public ClientController(ClientService clientService) {
		this.clientService = clientService;
	}

	public void setClientService(ClientService clientService) {
		this.clientService = clientService;
	}

}
