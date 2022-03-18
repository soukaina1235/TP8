package cigma.pfe;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cigma.pfe.controllers.ClientController;
import cigma.pfe.models.Client;

public class MonApplication {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		ClientController ctrl = (ClientController) context.getBean("controller");
		Client client = new Client("OMAR");
		ctrl.save(client);
		ctrl.find(client.getId());
		ctrl.update(new Client(1, "hafsa"));
		ctrl.delete(client);
	}
}
