package test.teamManagementServicesTests;

import javax.naming.NamingException;

import delegate.TeamManagementServicesDelegate;
import entities.Employee;
import entities.TeamLead;

public class TestAddUserPaternStyle {

	public static void main(String[] args) throws NamingException {

		Employee employee = new Employee("foulen", "f", "f", 5D);

		TeamLead teamLead = new TeamLead("med ali", "med", "med", "senior");

		System.out.println(TeamManagementServicesDelegate.doAddUser(employee));
		System.out.println(TeamManagementServicesDelegate.doAddUser(teamLead));

	}
}
