package training.entities.manyToManyBi;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 * Entity implementation class for Entity: N
 *
 */
@Entity
public class N implements Serializable {

	private Integer idN;
	private static final long serialVersionUID = 1L;

	private List<M> ms;

	public N() {
		super();
	}

	@Id
	public Integer getIdN() {
		return this.idN;
	}

	public void setIdN(Integer idN) {
		this.idN = idN;
	}

	@ManyToMany(mappedBy = "ns")
	public List<M> getMs() {
		return ms;
	}

	public void setMs(List<M> ms) {
		this.ms = ms;
	}

}
