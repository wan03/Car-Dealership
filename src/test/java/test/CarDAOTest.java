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
		
		
		Car ford = new Car("Ford", "Edge", "2017", 12000.00, "JH4CC2540NC006770");
		
		
		DAO.addCar(ford);
		
		Automobiles allCars = DAO.readAllCars();
		
		
		
		assertTrue(allCars.contains(ford));
		
		
	}
	

	@Test
	public void changeCarOwnershipTest () {
		
		Automobiles allCars = DAO.readAllCars();
		
		Car currentCar = allCars.get(0);
		
		allCars.changeOwnership(currentCar, "Test1");
		
		currentCar = allCars.get(0);
		
		assertEquals("Check if make is correct", "Test1", currentCar.getBelongsTo());
		
	}
	
	@Test
	public void removeCarTest() {
		
		
		String vin = "JH4CC2540NC006770";
			
		Automobiles allCars = DAO.readAllCars();
		
		Car carRemove = new Car();
		
		for (Car car : allCars) {
			
			if (car.getVin().equalsIgnoreCase(vin)) {
				DAO.removeCar(car);
				carRemove = car;
			}
		}
		
		Automobiles newAllCars = DAO.readAllCars();
		
		assertFalse(newAllCars.contains(carRemove));
		
		
	}
 
}
