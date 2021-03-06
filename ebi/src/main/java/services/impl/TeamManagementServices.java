package services.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import services.interfaces.TeamManagementServicesLocal;
import services.interfaces.TeamManagementServicesRemote;
import entities.Department;
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
	}

	@Override
	public Boolean addUser(User user) {
		Boolean b = false;
		try {
			entityManager.persist(user);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public Boolean deleteUserById(Integer userId) {
		Boolean b = false;
		try {
			entityManager.remove(findUserById(userId));
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public Boolean updateUser(User user) {
		Boolean b = false;
		try {
			entityManager.merge(user);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public User findUserById(Integer userId) {
		return entityManager.find(User.class, userId);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> findAllUsers() {
		String jpql = "select u from User u";
		Query query = entityManager.createQuery(jpql);
		return query.getResultList();
	}

	@Override
	public Boolean createTeam(Team team) {
		Boolean b = false;
		try {
			entityManager.persist(team);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public Team findTeamById(Integer teamId) {
		return entityManager.find(Team.class, teamId);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Team> findAllTeams() {
		String jpql = "select t from Team t";
		Query query = entityManager.createQuery(jpql);
		return query.getResultList();
	}

	@Override
	public Boolean assignTeamLeadToTeam(Integer teamLeadId, Integer teamId) {
		Boolean b = false;
		try {
			// TODO Auto-generated method stub
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public Boolean assignEmployeesToTeam(List<Employee> employees,
			Integer teamId) {
		Boolean b = false;
		try {
			// TODO Auto-generated method stub
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public Boolean assignEmployeeToTeam(Integer employeeId, Integer teamId) {
		Boolean b = false;
		try {
			// TODO Auto-generated method stub
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> findAllUsersByName(String name) {
		String jpql = "select u from User u where u.name=:param";
		Query query = entityManager.createQuery(jpql);
		query.setParameter("param", name);
		return query.getResultList();
	}

	@Override
	public User login(String login, String password) {
		String jpql = "select u from User u where u.login=:param1 and u.password=:param2";
		Query query = entityManager.createQuery(jpql);
		query.setParameter("param1", login);
		query.setParameter("param2", password);
		User user = null;
		try {
			user = (User) query.getSingleResult();
		} catch (Exception e) {
			System.err.println("bad credentials");
		}
		return user;
	}

	@Override
	public Boolean createTeamWhithNewDepartment(Team team, Department department) {
		Boolean b = false;
		try {
			team.setDepartment(department);
			entityManager.persist(team);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public Boolean createDepartmentWithNewTeam(Team team, Department department) {
		Boolean b = false;
		try {
			List<Team> teams = findAllTeamsByDepartmentId(department.getId());
			teams.add(team);
			department.linkTeamsToThisDepartment(teams);
			entityManager.persist(department);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public List<Team> findAllTeamsByDepartmentId(Integer departmentId) {
		Department department = entityManager.find(Department.class,
				departmentId);
		String jpql = "select t from Team t where t.department=:param";
		Query query = entityManager.createQuery(jpql);
		query.setParameter("param", department);
		return query.getResultList();
	}

}
