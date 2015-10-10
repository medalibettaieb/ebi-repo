package training.entities.oneToManyUniMasterSide;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: J
 *
 */
@Entity
public class J implements Serializable {

	private Integer idJ;
	private static final long serialVersionUID = 1L;

	private I i;

	public J() {
		super();
	}

	@Id
	public Integer getIdJ() {
		return this.idJ;
	}

	public void setIdJ(Integer idJ) {
		this.idJ = idJ;
	}

	@ManyToOne
	public I getI() {
		return i;
	}

	public void setI(I i) {
		this.i = i;
	}

}
