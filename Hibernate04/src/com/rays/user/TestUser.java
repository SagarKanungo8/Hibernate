package com.rays.user;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TestUser {
	
	public static void main(String[] args) {
		
		//testAdd();
		//testUpdate();
		//testDelete();
		//testGet();
		//testAuthenticate();
		testSearch();
	}

	private static void testSearch() {
		
		UserDTO dto = new UserDTO();
		
		dto.setFirstName("rahul");
		
		UserModel model = new UserModel();
		
		List list = model.Search(dto);
		
		Iterator it = list.iterator();
		
		while(it.hasNext()) {
			
			dto = (UserDTO) it.next();
			
			System.out.println(dto.getId());
			System.out.println(dto.getFirstName());
			System.out.println(dto.getLastName());
			System.out.println(dto.getLogin());
			System.out.println(dto.getPassword());
			System.out.println(dto.getDob());
			System.out.println(dto.getAddress());
		}
		
	}

	private static void testAuthenticate() {
		
		UserModel model = new UserModel();
		
		UserDTO dto = model.Authenticate("sagar@gmail.com", "123");
		
		if(dto!=null) {
			System.out.println(dto.getId());
			System.out.println(dto.getFirstName());
			System.out.println(dto.getLastName());
			System.out.println(dto.getLogin());
			System.out.println(dto.getPassword());
			System.out.println(dto.getDob());
			System.out.println(dto.getAddress());
		}
		else {
			System.out.println("Authentication failed..!!");
		}
		
	}

	private static void testGet() {
		UserModel model = new UserModel();
		
		UserDTO dto = model.findByPk(1);
		
		System.out.println(dto.getId());
		System.out.println(dto.getFirstName());
		System.out.println(dto.getLastName());
		System.out.println(dto.getLogin());
		System.out.println(dto.getPassword());
		System.out.println(dto.getDob());
		System.out.println(dto.getAddress());
		
		
	}

	private static void testDelete() {
		
		UserDTO dto = new UserDTO();
		
		dto.setId(2);
		
		UserModel model = new UserModel();
		
		model.Delete(dto);
		
	}

	private static void testUpdate() {
		
		UserDTO dto = new UserDTO();
		
		dto.setId(1);
		dto.setFirstName("virat");
		dto.setLastName("kohli");
		dto.setLogin("virat@gmail.com");
		dto.setPassword("123");
		dto.setDob(new Date());
		dto.setAddress("mumbai");
		UserModel model = new UserModel();
		model.Update(dto);
		
		
	}

	private static void testAdd() {
	
		UserDTO dto = new UserDTO();
		
		dto.setId(1);
		dto.setFirstName("rohit");
		dto.setLastName("kohli");
		dto.setLogin("rohitk@gmail.com");
		dto.setPassword("123");
		dto.setDob(new Date());
		dto.setAddress("indore");
		
		UserModel model = new UserModel();
		model.Add(dto);
	}
      
	

	
	
	
	
}
