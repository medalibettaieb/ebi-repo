package training.interfaces;

import javax.ejb.Remote;

@Remote
public interface AccumulatorServiceRemote {
	int add(int dx);

}
