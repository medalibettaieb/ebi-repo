package entities;

import java.io.Serializable;

import javax.persistence.Entity;

/**
 * Entity implementation class for Entity: TeamLead
 *
 */
@Entity
public class TeamLead extends User implements Serializable {

	private String level;
	private static final long serialVersionUID = 1L;

	public TeamLead() {
	}

	public TeamLead(String nom, String login, String password, String level) {
		this.level = level;
		this.setName(nom);
		this.setLogin(login);
		this.setPassword(password);
	}

	public String getLevel() {
		return this.level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

}
