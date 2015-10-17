package delegate;

import locator.ServiceLocator;
import services.interfaces.TeamManagementServicesRemote;
import entities.User;

public class TeamManagementServicesDelegate {
	public static final String jndiName = "";

	public static TeamManagementServicesRemote getProxy() {
		return (TeamManagementServicesRemote) ServiceLocator.getInstance()
				.getProxy(jndiName);
	}

	public static Boolean doAddUser(User user) {
		return getProxy().addUser(user);
	}
}