package services.interfaces;

import java.util.List;

import javax.ejb.Remote;

import entities.Department;
import entities.Employee;
import entities.Team;
import entities.User;

@Remote
public interface TeamManagementServicesRemote {
	Boolean addUser(User user);// OK

	Boolean deleteUserById(Integer userId);// OK

	Boolean updateUser(User user);// OK

	User findUserById(Integer userId);// OK

	List<User> findAllUsers();// OK

	List<User> findAllUsersByName(String name);// OK

	User login(String login, String password);// OK

	Boolean createTeam(Team team);// OK

	Team findTeamById(Integer teamId);// OK

	List<Team> findAllTeams();// OK

	Boolean createTeamWhithNewDepartment(Team team, Department department);// OK

	List<Team> findAllTeamsByDepartmentId(Integer departmentId);

	Boolean createDepartmentWithNewTeam(Team team, Department department);

	Boolean assignTeamLeadToTeam(Integer teamLeadId, Integer teamId);

	Boolean assignEmployeesToTeam(List<Employee> employees, Integer teamId);

	Boolean assignEmployeeToTeam(Integer employeeId, Integer teamId);

}
