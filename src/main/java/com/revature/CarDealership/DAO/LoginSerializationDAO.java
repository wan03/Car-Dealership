package com.revature.CarDealership.DAO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


import com.revature.CarDealership.pojos.User;

public class LoginSerializationDAO {
	
	public void logIn(User u) {
		
	}
	
	public void logOut(User u) {
		
	}	
	
	public static void addUser (User u) {
		
		String filename;
		filename = u.getIndetifier() + ".dat";
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream(filename);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(u);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				fos.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public static User readUser (String identifier){
		
		String filename;
		filename = identifier + ".dat";
		User b = null;
		try (FileInputStream fis = new FileInputStream(filename); ObjectInputStream ois = new ObjectInputStream(fis);) { //try with resources 
			b = (User) ois.readObject();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return b;	
		
	}
	
	public void removeUser (User u) {
	}

}
