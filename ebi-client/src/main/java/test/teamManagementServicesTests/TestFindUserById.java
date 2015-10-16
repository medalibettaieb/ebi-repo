package test.teamManagementServicesTests;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import services.interfaces.TeamManagementServicesRemote;
import entities.Employee;
import entities.User;

public class TestFindUserById {

	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		TeamManagementServicesRemote proxy = (TeamManagementServicesRemote) context
				.lookup("/ebi/TeamManagementServices!services.interfaces.TeamManagementServicesRemote");
		User user = proxy.findUserById(1);

		if (user instanceof Employee) {
			System.out.println(" (Employee) welcome Mr : " + user.getName());
		} else {
			System.out.println(" (TeamLead) welcome Sir :" + user.getName());
		}

	}
}
