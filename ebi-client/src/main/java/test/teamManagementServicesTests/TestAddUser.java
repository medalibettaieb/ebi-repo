package test.teamManagementServicesTests;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import services.interfaces.TeamManagementServicesRemote;
import entities.Employee;
import entities.TeamLead;

public class TestAddUser {

	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		TeamManagementServicesRemote proxy = (TeamManagementServicesRemote) context
				.lookup("/ebi/TeamManagementServices!services.interfaces.TeamManagementServicesRemote");

		Employee employee = new Employee("foulen", "f", "f", 5D);
		
		TeamLead teamLead = new TeamLead("med ali", "med", "med", "senior");

		System.out.println(proxy.addUser(employee));
		System.out.println(proxy.addUser(teamLead));

	}
}
