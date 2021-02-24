package com.niit.ecommerce.service;

import java.util.List;
import com.niit.ecommerce.model.Product;

public interface ProductService
{
	public void add(Product Product);
	public void update(Product Product);
	public void delete(int id);
	public Product getProductById(int id);
	public List findAll();
}