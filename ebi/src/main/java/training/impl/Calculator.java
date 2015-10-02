package training.impl;

import javax.ejb.Stateless;

import training.interfaces.CalculatorLocal;
import training.interfaces.CalculatorRemote;

/**
 * Session Bean implementation class Calculator
 */
@Stateless
public class Calculator implements CalculatorRemote, CalculatorLocal {

	/**
	 * Default constructor.
	 */
	public Calculator() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Integer sum(Integer a, Integer b) {
		return a + b;
	}

}
