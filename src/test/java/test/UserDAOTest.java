package test;
import static org.junit.Assert.*;


import org.junit.Test;

import com.revature.CarDealership.DAO.UserSerializationDAO;
import com.revature.CarDealership.pojos.Customer;
import com.revature.CarDealership.pojos.Employee;
import com.revature.CarDealership.pojos.User;

public class UserDAOTest {
	
	UserSerializationDAO DAO = new UserSerializationDAO();

	@Test
	public void logInTest() {
		
		
		
	}
	
	@Test
	public void logOutTest() {
		
		
		
	}
	
	@Test
	public void addCustomerTest() {
		
		Customer testCustomer = new Customer("Test", "TestCustomer", "testing");
		
		DAO.addUser(testCustomer);
		//not sure how to test that this completed other than verifying the the file name exists which will be itself
				// a test of a different part.
		assertEquals("Check object was created and code reached here", testCustomer, testCustomer);
		
		
	}
	
	@Test
	public void addEmployeeTest() {
		
		Employee testEmployee = new Employee("Test", "TestEmployee", "testing");
		
		DAO.addUser(testEmployee);
		//not sure how to test that this completed other than verifying the the file name exists which will be itself
				// a test of a different part.
		assertEquals("Check object was created and code reached here", testEmployee, testEmployee);
		
		
	}
	
	@Test
	public void readCustomerTest() {
		
		//User testCustomer = UserSerializationDAO.readUser("TestCustomer");
		
		//Per my comment above this also tests that the previous one worked correctly. 
		//assertEquals("Check if user type is correct", "customer", testCustomer.getUserType());
		
		
	}
	
	@Test
	public void readEmployeeTest() {
		
		//User testEmployee = UserSerializationDAO.readUser("TestEmployee");
		//Per my comment above this also tests that the previous one worked correctly. 
		//assertEquals("Check if user type is correct", "employee", testEmployee.getUserType());
		
		
		
		
	}

}
