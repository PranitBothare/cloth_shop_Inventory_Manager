package com.cfc.cloth_shop.controller;

import java.util.ArrayList;
import java.util.List;

import com.cfc.cloth_shop.dao.User_Dao;
import com.cfc.cloth_shop.dto.Pant;
import com.cfc.cloth_shop.dto.Shirt;
import com.cfc.cloth_shop.dto.T_Shirt;
import com.cfc.cloth_shop.dto.User;

public class User_Controller {
public static void main(String[] args) {
	Pant pant1 = new Pant();
	pant1.setId(1);
	pant1.setType("cotton Jeans");
	pant1.setSize(28);
	pant1.setPrice(950);
	pant1.setQty(2);
	
	Pant pant2 = new Pant();
	pant2.setId(2);
	pant2.setType("cotton Jeans");
	pant2.setSize(30);
	pant2.setPrice(950);
	pant2.setQty(25);
	
	Pant pant3= new Pant();
	pant3.setType("cotton Jeans");
	pant3.setSize(30);
	pant3.setPrice(950);
	pant3.setQty(25);
	
	List<Pant>pants = new ArrayList<Pant>();
	pants.add(pant1);
	pants.add(pant2);
	pants.add(pant3);
	
	/////////////////////////////////////////////////
	
	Shirt shirt1 = new Shirt();
	shirt1.setId(1);
	shirt1.setType("single Pocket");
	shirt1.setSleeves("Full");
	shirt1.setSize("s");
	shirt1.setPrice(450);
	shirt1.setQty(20);
	
	Shirt shirt2 = new Shirt();
	shirt2.setId(2);
	shirt2.setType("single Pocket");
	shirt2.setSleeves("Full");
	shirt2.setSize("m");
	shirt2.setPrice(450);
	shirt2.setQty(30);
	
	Shirt shirt3 = new Shirt();
	shirt3.setId(3);
	shirt3.setType("single Pocket");
	shirt3.setSleeves("Full");
	shirt3.setSize("l");
	shirt3.setPrice(450);
	shirt3.setQty(30);
	
	Shirt shirt4 = new Shirt();
	shirt4.setId(4);
	shirt4.setType("single Pocket");
	shirt4.setSleeves("Full");
	shirt4.setSize("xl");
	shirt4.setPrice(450);
	shirt4.setQty(30);
	
	List<Shirt>shirts = new ArrayList<Shirt>();
	shirts.add(shirt1);
	shirts.add(shirt2);
	shirts.add(shirt3);
	shirts.add(shirt4);
	
	///////////////////////////////////////////////////////////
	
	T_Shirt t_Shirt1 = new T_Shirt();
	t_Shirt1.setType("polo collar");
	t_Shirt1.setSleeves("full");
	t_Shirt1.setSize("s");
	t_Shirt1.setPrice(350);
	t_Shirt1.setQty(20);
	
	T_Shirt t_Shirt2 = new T_Shirt();
	t_Shirt2.setType("polo collar");
	t_Shirt2.setSleeves("full");
	t_Shirt2.setSize("m");
	t_Shirt2.setPrice(350);
	t_Shirt2.setQty(20);
	
	T_Shirt t_Shirt3 = new T_Shirt();
	t_Shirt3.setType("polo collar");
	t_Shirt3.setSleeves("full");
	t_Shirt3.setSize("l");
	t_Shirt3.setPrice(350);
	t_Shirt3.setQty(20);
	
	T_Shirt t_Shirt4 = new T_Shirt();
	t_Shirt4.setType("polo collar");
	t_Shirt4.setSleeves("full");
	t_Shirt4.setSize("xl");
	t_Shirt4.setPrice(350);
	t_Shirt4.setQty(20);
	
	List<T_Shirt>t_Shirts = new ArrayList<T_Shirt>();
	t_Shirts.add(t_Shirt1);
	t_Shirts.add(t_Shirt2);
	t_Shirts.add(t_Shirt3);
	t_Shirts.add(t_Shirt4);
/////////////////////////////////////////////////////////////////////	
	User user = new User();
	user.setId(0);
	user.setName("pranit");
	user.setContact(8983953676l);
	user.setPant(pants);
	user.setShirt(shirts);
	user.setT_Shirt(t_Shirts);
	
	User_Dao dao = new User_Dao();
	//dao.save(user);
	//dao.upadteShirt(shirt1);
	//dao.upadte(user);
//	dao.findShirt(1);
//	dao.findUser(0);
//	dao.deleteShirt(8);
	
	dao.findPant(1);
	
	
	
}

}
