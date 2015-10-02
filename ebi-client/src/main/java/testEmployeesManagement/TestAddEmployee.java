package testEmployeesManagement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import services.interfaces.EmployeesManagementRemote;
import entities.Employee;

public class TestAddEmployee {

	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		EmployeesManagementRemote proxy = (EmployeesManagementRemote) context
				.lookup("/ebi/EmployeesManagement!services.interfaces.EmployeesManagementRemote");

		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("foulen");

		System.out.println(proxy.addEmployee(employee));

	}

}
