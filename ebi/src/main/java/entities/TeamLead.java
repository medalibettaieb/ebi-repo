package entities;

import entities.User;
import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: TeamLead
 *
 */
@Entity

public class TeamLead extends User implements Serializable {

	
	private String level;
	private static final long serialVersionUID = 1L;

	public TeamLead() {
		super();
	}   
	public String getLevel() {
		return this.level;
	}

	public void setLevel(String level) {
		this.level = level;
	}
   
}
