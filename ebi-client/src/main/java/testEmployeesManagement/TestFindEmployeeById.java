package testEmployeesManagement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import services.interfaces.EmployeesManagementRemote;
import entities.Employee;

public class TestFindEmployeeById {

	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		EmployeesManagementRemote proxy = (EmployeesManagementRemote) context
				.lookup("/ebi/EmployeesManagement!services.interfaces.EmployeesManagementRemote");

		Employee employeeFound=proxy.findEmployeeById(1);
		
		System.out.println(employeeFound.getName());

	}

}
