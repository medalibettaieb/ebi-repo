package test.teamManagementServicesTests;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import services.interfaces.TeamManagementServicesRemote;
import entities.Employee;
import entities.TeamLead;
import entities.User;

public class TestLogin {

	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		TeamManagementServicesRemote proxy = (TeamManagementServicesRemote) context
				.lookup("/ebi/TeamManagementServices!services.interfaces.TeamManagementServicesRemote");

		User userLoggedIn = proxy.login("f", "f");

		if (userLoggedIn instanceof TeamLead) {
			System.out.println("hello Mr : " + userLoggedIn.getName());
		}
		if (userLoggedIn instanceof Employee) {
			System.out.println("ahla bik ya : " + userLoggedIn.getName());
		} else {
			System.out.println("bad credentials");
		}

	}
}
