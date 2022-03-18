package cigma.pfe.models;

import javax.persistence.*;

import lombok.Data;

@Entity(name = "hafsa")
@Data
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String name;

	@Override
	public String toString() {
		return "Client{" + "id=" + id + ", name='" + name + '\'' + '}';
	}

	public Client(String name) {
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Client(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Client() {
	}

}
