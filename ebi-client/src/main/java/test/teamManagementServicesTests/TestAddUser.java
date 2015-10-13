package test.teamManagementServicesTests;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import services.interfaces.TeamManagementServicesRemote;
import entities.Employee;

public class TestAddUser {

	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		TeamManagementServicesRemote proxy = (TeamManagementServicesRemote) context
				.lookup("/ebi/TeamManagementServices!services.interfaces.TeamManagementServicesRemote");

		Employee employee = new Employee("foulen", "f", "f", 5D);

		proxy.addUser(employee);

	}
}
