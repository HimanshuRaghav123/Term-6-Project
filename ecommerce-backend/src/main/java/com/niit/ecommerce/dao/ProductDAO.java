package com.niit.ecommerce.dao;

import com.niit.ecommerce.model.Product;

import antlr.collections.List;

public interface ProductDAO {
	
	public boolean addProduct(Product product);
	public boolean deleteProduct(Product product);
	public boolean updateProduct(Product product);
	public Product getProductById(int id);
	public java.util.List<Product> findAll();

}
