package entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: Department
 *
 */
@Entity
public class Department implements Serializable {

	private Integer id;
	private String name;
	private static final long serialVersionUID = 1L;

	private List<Team> teams;

	public Department() {
		super();
	}

	public Department(String name) {
		super();
		this.name = name;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(mappedBy = "department", cascade = CascadeType.PERSIST)
	public List<Team> getTeams() {
		return teams;
	}

	public void setTeams(List<Team> teams) {
		this.teams = teams;
	}

	public void linkTeamsToThisDepartment(List<Team> teams) {
		this.teams = teams;
		for (Team t : teams) {
			t.setDepartment(this);
		}
	}

}
