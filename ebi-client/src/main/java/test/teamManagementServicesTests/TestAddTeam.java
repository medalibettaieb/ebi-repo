package test.teamManagementServicesTests;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import services.interfaces.TeamManagementServicesRemote;
import entities.Team;

public class TestAddTeam {

	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		TeamManagementServicesRemote proxy = (TeamManagementServicesRemote) context
				.lookup("/ebi/TeamManagementServices!services.interfaces.TeamManagementServicesRemote");

		Team team = new Team("team 1");

		System.out.println(proxy.createTeam(team));

	}
}
