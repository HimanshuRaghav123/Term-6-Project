package com.niit.ecommerce.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

@Entity
public class Product {
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private double price;
	private int quantity;
	private String mfg;
	private String expireDate;
	private String description;
	
	@Transient	
	private MultipartFile image;
	
	
	public Product () {}



	public Product(String name, double price, int quantity, String mfg, String expireDate, String description) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.mfg = mfg;
		this.expireDate = expireDate;
		this.description = description;
	}



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



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public int getQuantity() {
		return quantity;
	}



	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	public String getMfg() {
		return mfg;
	}



	public void setMfg(String mfg) {
		this.mfg = mfg;
	}



	public String getExpireDate() {
		return expireDate;
	}



	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public MultipartFile getImage() {
		return image;
	}



	public void setImage(MultipartFile image) {
		this.image = image;
	}



	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + ", mfg=" + mfg
				+ ", expireDate=" + expireDate + ", description=" + description + "]";
	}
	
	
	

	
}
