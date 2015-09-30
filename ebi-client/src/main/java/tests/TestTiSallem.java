package tests;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import training.interfaces.GreetingsRemote;

public class TestTiSallem {

	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		String jndiName = "/ebi/Greetings!training.interfaces.GreetingsRemote";
		GreetingsRemote proxy = (GreetingsRemote) context.lookup(jndiName);

		System.out.println(proxy.tiSallem("foulen"));

	}

}
