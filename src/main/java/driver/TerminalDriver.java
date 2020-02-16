package driver;

import java.util.Scanner;

import com.revature.CarDealership.DAO.CarSerializationDAO;
import com.revature.CarDealership.DAO.LoginSerializationDAO;
import com.revature.CarDealership.pojos.Car;
import com.revature.CarDealership.pojos.Customer;
import com.revature.CarDealership.pojos.Employee;

public class TerminalDriver {
		
	public static void main(String args[]){                       
        String s = "Hello, thank you for visiting our dealer.";  
        Scanner scan = new Scanner(s);  
        scan.close();           
        Scanner start = new Scanner(System.in);  
        
        
        determineUserType(start);
        
//        System.out.print("Enter your name: ");
//        
//        System.out.println("Name: ");           
//        System.out.print("Enter your age: ");  
//        int i = start.nextInt();  
//        System.out.println("Age: " + i);  
//        System.out.print("Enter your salary: ");  
//        double d = start.nextDouble();  
//        System.out.println("Salary: " + d);         
        start.close();           
        } 
	
	public static void determineUserType (Scanner scan) {
		
		System.out.println("Are you a Customer or an Employee?");
        String instruction = "Please type c for Customer or e for Employee";
        System.out.println(instruction);  
        String userType = scan.next();
        
        System.out.println(userType);
	        if (userType.equalsIgnoreCase("c")) {       
	        
	        	determineAccountStatus(scan, userType);
	        	        	
	        } else if (userType.equalsIgnoreCase("e")) {
	        	
	        	determineAccountStatus(scan, userType);
	        	
	        } else {
	        	
	        	determineUserType(scan);
	        }
		
		
	}
	
	public static void determineAccountStatus (Scanner scan, String userType) {
		
		String accountQuestion = "Do you have an account with us? Type y or n";		
		System.out.println(accountQuestion);
        String response = scan.next().toString();
        
        if (response.equalsIgnoreCase("y")) {
        	
        	if(userType.equalsIgnoreCase("c")) {
        		
        		//TODO figure out login procedure
        		actionsCustomer(scan);
        		
        	} else if (userType.equalsIgnoreCase("e")) {
        		
        		actionsEmployee(scan);
        		
        	}
        	
        } else if (response.equalsIgnoreCase("n")) {
        	
        	createUser(scan, userType);
        	
        } else {
        	
        	determineAccountStatus(scan, userType);
        }
		
		
	}
	
	public static void createUser (Scanner scan, String userType) {
		
		System.out.println("Answer the questions to create a new user");
		System.out.println("What is your name?");
		String name = scan.next();
		System.out.println("What is your username?");
		String username = scan.next();
		System.out.println("What is your password?");
		String password = scan.next();
		
		if (userType.equalsIgnoreCase("c")) {
			
			Customer newCustomer = new Customer(name, username, password); 
			LoginSerializationDAO.addUser(newCustomer);
			
		} else if (userType.equalsIgnoreCase("e")) {
			
			Employee newEmployee = new Employee(name, username, password);					
			LoginSerializationDAO.addUser(newEmployee);
			
		}		
		
	}
	
	public static void actionsCustomer (Scanner scan) {
		
		System.out.println("What would you like to do?");
		System.out.println("Available options are View Lot Cars(vlc), Make an Offer (mf), View Cars that you own (vco),"
				+ " View remaining payments(vp) or exit(exit)");
		String action = scan.next();
		
		switch (action) {
		
		case "vlc":
			System.out.println("vlc");
			break;
		case "mf": 
			System.out.println("mf");
			break;
		case "vco": 
			System.out.println("vco");
			break;
		case "vp":
			System.out.println("vp");
			break;
		case "exit":
			scan.close();
		default:
			System.out.println("Try again");
		}
		
		
		
	}
	
	public static void actionsEmployee (Scanner scan) {
		
		System.out.println("What would you like to do?");
		System.out.println("Available options are Add a Car (ac), Review Offer (ro), Remove Car (rc), View Payments(vp) or exit(exit)");
		String action = scan.next();
		
switch (action) {
		
		case "ac":
			System.out.println("Answer the questions to create a new car");
			System.out.println("What is the make?");
			String make = scan.next();
			System.out.println("What is the model?");
			String model = scan.next();
			System.out.println("What is the year?");
			String year = scan.next();
			System.out.println("What is the price?");
			double price = scan.nextDouble();			
			Car newCar = new Car(make, model, year, price);			
			CarSerializationDAO.addCar(newCar);
			actionsEmployee(scan);
			break;
		case "ro": 
			System.out.println("ro");
			break;
		case "rc": 
			System.out.println("rc");
			break;
		case "vp":
			System.out.println("vp");
			break;
		case "exit":
			scan.close();
		default:
			System.out.println("Try again");
		}
		
	}
	
	
		
	
}
