package com.cfc.cloth_shop.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.transaction.Transaction;

import org.hibernate.annotations.UpdateTimestamp;

import com.cfc.cloth_shop.dto.Pant;
import com.cfc.cloth_shop.dto.Shirt;
import com.cfc.cloth_shop.dto.T_Shirt;
import com.cfc.cloth_shop.dto.User;

public class User_Dao {

	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
	private EntityManager manager = factory.createEntityManager();
	private EntityTransaction transaction = manager.getTransaction();

	
	public void save(User user) {
		transaction.begin();
		manager.persist(user);
		transaction.commit();

	}

	public void upadteShirt(Shirt shirt) {
		transaction.begin();
		manager.merge(shirt);
		transaction.commit();
	}
	public void upadteTShirt(T_Shirt t_Shirt) {
		transaction.begin();
		manager.merge(t_Shirt);
		transaction.commit();
	}
	public void upadtePant(Pant pant) {
		transaction.begin();
		manager.merge(pant);
		transaction.commit();
	}
	
	public void upadte(User user) {
		transaction.begin();
		manager.merge(user);
		transaction.commit();
	}
	
	public void findUser(int id) {
		User user = manager.find(User.class, id);
		if (user != null) {
			
			System.out.println(user);
		}
	}
	
	public void findShirt(int id) {
		Shirt shirt = manager.find(Shirt.class, id);
		if (shirt != null) {
			System.out.println(shirt);
		}
	}
	public void findTShirt(int id) {
		T_Shirt tshirt = manager.find(T_Shirt.class, id);
		if (tshirt != null) {
			System.out.println(tshirt);
		}
	}
	public void findPant(int id) {
		Pant pant = manager.find(Pant.class, id);
		if (pant != null) {
			System.out.println(pant);
		}
	}
	public void deleteShirt(int id) {
		Shirt  shirt = manager.find(Shirt.class, id);
		if(shirt != null) {
			transaction.begin();
			manager.remove(shirt);
			System.out.println("remove item");
			transaction.commit();
		}
	}
		public void deleteTShirt(int id) {
			T_Shirt  tshirt = manager.find(T_Shirt.class, id);
			if(tshirt != null) {
				transaction.begin();
				manager.remove(tshirt);
				System.out.println("remove item");
				transaction.commit();
			}
	}
		public void deletePant(int id) {
			Pant pant = manager.find(Pant.class, id);
			if(pant != null) {
				transaction.begin();
				manager.remove(pant);
				System.out.println("remove item");
				transaction.commit();
			}
		}
}
