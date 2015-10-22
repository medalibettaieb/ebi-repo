package test.teamManagementServicesTests;

import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import services.interfaces.TeamManagementServicesRemote;
import entities.Team;

public class TestFindAllTeamsByDepartmentId {

	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		TeamManagementServicesRemote proxy = (TeamManagementServicesRemote) context
				.lookup("/ebi/TeamManagementServices!services.interfaces.TeamManagementServicesRemote");

		List<Team> teams = proxy.findAllTeamsByDepartmentId(1);
		for (Team t : teams) {
			System.out.println(t.getName());
		}

	}
}
