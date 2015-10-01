package training.interfaces;

import javax.ejb.Remote;

@Remote
public interface IdentificationServiceRemote {
	Boolean login(String login, String password);
}
