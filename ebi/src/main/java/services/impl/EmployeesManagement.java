package services.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import services.interfaces.EmployeesManagementRemote;
import entities.Employee;

/**
 * Session Bean implementation class EmployeesManagement
 */
@Stateless
public class EmployeesManagement implements EmployeesManagementRemote {
	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public EmployeesManagement() {
	}

	@Override
	public Boolean addEmployee(Employee employee) {
		Boolean b = false;
		try {
			entityManager.persist(employee);
			b = true;
		} catch (Exception e) {
			System.err.println("ouups ...");
		}
		return b;
	}

	@Override
	public Boolean deleteEmployeeById(Integer id) {
		Boolean b = false;
		try {
			entityManager.remove(findEmployeeById(id));
			b = true;
		} catch (Exception e) {
			System.err.println("ouups ...");
		}
		return b;
	}

	@Override
	public Boolean updateEmployee(Employee employee) {
		Boolean b = false;
		try {
			entityManager.merge(employee);
			b = true;
		} catch (Exception e) {
			System.err.println("ouups ...");
		}
		return b;
	}

	@Override
	public Employee findEmployeeById(Integer id) {
		return entityManager.find(Employee.class, id);
	}

}
