package services.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import services.interfaces.TeamManagementServicesLocal;
import services.interfaces.TeamManagementServicesRemote;
import entities.Employee;
import entities.Team;
import entities.User;

/**
 * Session Bean implementation class TeamManagementServices
 */
@Stateless
public class TeamManagementServices implements TeamManagementServicesRemote,
		TeamManagementServicesLocal {
	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public TeamManagementServices() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Boolean addUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteUserById(Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean updateUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findUserById(Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean createTeam(Team team) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Team findTeamById(Integer teamId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Team> findAllTeams() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean assignTeamLeadToTeam(Integer teamLeadId, Integer teamId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean assignEmployeesToTeam(List<Employee> employees,
			Integer teamId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean assignEmployeeToTeam(Integer employeeId, Integer teamId) {
		// TODO Auto-generated method stub
		return null;
	}

}
