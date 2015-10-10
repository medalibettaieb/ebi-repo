package training.entities.oneToManyUniSlaveSide;

import java.io.Serializable;
import java.lang.Integer;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: L
 *
 */
@Entity

public class L implements Serializable {

	
	private Integer idL;
	private static final long serialVersionUID = 1L;

	public L() {
		super();
	}   
	@Id    
	public Integer getIdL() {
		return this.idL;
	}

	public void setIdL(Integer idL) {
		this.idL = idL;
	}
   
}
