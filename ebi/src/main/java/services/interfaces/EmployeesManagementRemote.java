package services.interfaces;

import javax.ejb.Remote;

import entities.Employee;

@Remote
public interface EmployeesManagementRemote {
	Boolean addEmployee(Employee employee);

	Boolean deleteEmployeeById(Integer id);

	Boolean updateEmployee(Employee employee);

	Employee findEmployeeById(Integer id);

}
