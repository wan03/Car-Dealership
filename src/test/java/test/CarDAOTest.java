package test;
import static org.junit.Assert.*;

import org.junit.Test;

import com.revature.CarDealership.pojos.Automobiles;
import com.revature.CarDealership.pojos.Car;
import com.revature.CarDealership.DAO.CarSerializationDAO;;

public class CarDAOTest {

	CarSerializationDAO DAO = new CarSerializationDAO();
	
	@Test
	public void addCarTest() {
		
		
		Car ford = new Car("Ford", "Fusion", "2018", 15000.00, "JH4KA7570NC035422");
		
		
		DAO.addCar(ford);
		
		Automobiles allCars = DAO.readAllCars();
		
		
		
		assertTrue(allCars.contains(ford));
		
		
	}
	
	@Test
	public void readCarTest () {
		
		
		
		//Don't need this test right now.
		
	
		
	}
	
	@Test
	public void changeCarOwnershipTest () {
		
		Automobiles allCars = DAO.readAllCars();
		
		Car currentCar = allCars.get(0);
		
		allCars.changeOwnership(currentCar, "Test1");
		
		currentCar = allCars.get(0);
		
		assertEquals("Check if make is correct", "Test1", currentCar.getBelongsTo());
		
	}
 
}
