package testEmployeesManagement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import services.interfaces.EmployeesManagementRemote;

public class TestDeleteEmployeeById {

	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		EmployeesManagementRemote proxy = (EmployeesManagementRemote) context
				.lookup("/ebi/EmployeesManagement!services.interfaces.EmployeesManagementRemote");

		System.out.println(proxy.deleteEmployeeById(1));
	}

}
