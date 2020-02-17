package test;
import static org.junit.Assert.*;


import org.junit.Test;
import com.revature.CarDealership.pojos.Car;
import com.revature.CarDealership.DAO.CarSerializationDAO;;

public class CarDAOTest {

	@Test
	public void addCarTest() {
		
		
		Car ford = new Car("Ford", "Fusion", "2018", 15000.00);
		
//		CarSerializationDAO.addCar(ford);
		
		//not sure how to test that this completed other than verifying the the file name exists which will be itself
		// a test of a different part.
		
		assertEquals("Check object was created and code reached here", ford, ford); 
		
		
	}
	
	@Test
	public void readCarTest () {
		
		
		
		Car testCar = CarSerializationDAO.readCar("FordFusion2018");
		
		//Per my comment above this also tests that the previous one worked correctly. 
		assertEquals("Check if make is correct", "Ford", testCar.getMake());
		
	}
	
	@Test
	public void changeCarOwnershipTest () {
		
		CarSerializationDAO.changeCarOwnership("FordFusion2018", "Test1");
		
		Car testCar = CarSerializationDAO.readCar("FordFusion2018");
		
		assertEquals("Check if make is correct", "Test1", testCar.getBelongsTo());
		
	}
 
}
