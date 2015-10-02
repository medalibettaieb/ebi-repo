package training.interfaces;

import javax.ejb.Remote;

@Remote
public interface IGreetingsRemote {
	String tiSallem(String name);
}
