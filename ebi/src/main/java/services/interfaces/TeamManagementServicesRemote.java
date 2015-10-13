package services.interfaces;

import java.util.List;

import javax.ejb.Remote;

import entities.Employee;
import entities.Team;
import entities.User;

@Remote
public interface TeamManagementServicesRemote {
	Boolean addUser(User user);

	Boolean deleteUserById(Integer userId);

	Boolean updateUser(User user);

	User findUserById(Integer userId);

	List<User> findAllUsers();

	Boolean createTeam(Team team);

	Team findTeamById(Integer teamId);

	List<Team> findAllTeams();

	Boolean assignTeamLeadToTeam(Integer teamLeadId, Integer teamId);

	Boolean assignEmployeesToTeam(List<Employee> employees, Integer teamId);

	Boolean assignEmployeeToTeam(Integer employeeId, Integer teamId);

}
