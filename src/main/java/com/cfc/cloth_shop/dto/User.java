package com.cfc.cloth_shop.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User {
	@Id
	private int id;
	private String name;
	private long contact;

	@OneToMany(cascade = CascadeType.ALL)
	private List<Shirt> shirt;
	
	@OneToMany(cascade =CascadeType.ALL )
	private List<T_Shirt> t_Shirt;
	
	@OneToMany(cascade =CascadeType.ALL )
	private List<Pant> pant;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}
	

	public List<Shirt> getShirt() {
		return shirt;
	}

	public void setShirt(List<Shirt> shirt) {
		this.shirt = shirt;
	}

	public List<T_Shirt> getT_Shirt() {
		return t_Shirt;
	}

	public void setT_Shirt(List<T_Shirt> t_Shirt) {
		this.t_Shirt = t_Shirt;
	}

	public List<Pant> getPant() {
		return pant;
	}

	public void setPant(List<Pant> pant) {
		this.pant = pant;
	}

	@Override
	public String toString() {
		return "user [id=" + id + ", name=" + name + ", contact=" + contact + ", shirt=" + shirt + ", t_Shirt="
				+ t_Shirt + ", pant=" + pant + "]";
	}
	
	

}
