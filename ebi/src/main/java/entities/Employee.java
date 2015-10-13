package entities;

import java.io.Serializable;

import javax.persistence.Entity;

/**
 * Entity implementation class for Entity: Employee
 *
 */
@Entity
public class Employee extends User implements Serializable {

	private Double experience;
	private static final long serialVersionUID = 1L;

	public Employee() {
		super();
	}

	public Employee(String nom, String login, String password, Double experience) {
		this.setNom(nom);
		this.setLogin(login);
		this.setPassword(password);
		this.experience = experience;
	}

	public Double getExperience() {
		return this.experience;
	}

	public void setExperience(Double experience) {
		this.experience = experience;
	}

}
