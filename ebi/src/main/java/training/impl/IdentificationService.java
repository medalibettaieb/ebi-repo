package training.impl;

import javax.ejb.Stateless;

import training.interfaces.IdentificationServiceLocal;
import training.interfaces.IdentificationServiceRemote;

/**
 * Session Bean implementation class IdentificationService
 */
@Stateless
public class IdentificationService implements IdentificationServiceRemote,
		IdentificationServiceLocal {

	/**
	 * Default constructor.
	 */
	public IdentificationService() {
	}

	@Override
	public Boolean login(String login, String password) {
		Boolean b = false;
		if (login.equalsIgnoreCase("admin")
				& password.equalsIgnoreCase("admin")) {
			System.out.println("you are logged in as an ADMIN ");
			b = true;
		} else {
			System.err.println("access denied ");
		}
		return b;

	}

}
