package com.rays.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.rays.user.UserDTO;

public class TestFirstLevel {
	
	public static void main(String[] args) {
		
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		
		
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		UserDTO dto1 = (UserDTO) session.get(UserDTO.class,1);
		
		System.out.print(dto1.getId());
		
		System.out.print("\t" + dto1.getFirstName());
		
		System.out.print("\t" + dto1.getLastName());
		
		System.out.print("\t" + dto1.getLogin());
		
		System.out.print("\t" + dto1.getPassword());
		
		System.out.print("\t" + dto1.getDob());
		
		System.out.print("\t" + dto1.getAddress());
		
		
	}

}