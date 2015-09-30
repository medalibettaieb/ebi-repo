package training.impl;

import javax.ejb.Stateless;

import training.interfaces.GreetingsLocal;
import training.interfaces.GreetingsRemote;

@Stateless
public class Greetings implements GreetingsLocal, GreetingsRemote {

	@Override
	public String tiSallem(String name) {
		return "ahla ya : " + name;
	}

}
