package tests;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import training.interfaces.IdentificationServiceRemote;

public class TestLogin {

	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		IdentificationServiceRemote proxy = (IdentificationServiceRemote) context
				.lookup("/ebi/IdentificationService!training.interfaces.IdentificationServiceRemote");

		String login = "admin";
		String password = "admin";
		System.out.println(proxy.login(login, password));

	}

}
