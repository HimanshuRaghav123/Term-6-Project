package com.niit.ecommerce.driver;

import org.hibernate.mapping.List;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.ecommerce.dao.ProductDAO;
import com.niit.ecommerce.model.Product;

public class ProductDriver {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		
		context.scan("com.niit.ecommerce");
		context.refresh();
		
		Product product = new Product("Smart Watch", 25000, 10, "15/01/2021", "15/08/2024", "OnePlus  Smart watch");
		
		ProductDAO dao = (ProductDAO) context.getBean("productDAO");
		
		dao.addProduct(product);
		
		//Update the product
		//Product prod = dao.getProductById(2);
		//prod.setExpireDate("18/01/2025");
		
		//dao.updateProduct(prod);
		
		//Product prodDelete = dao.getProductById(1);
		//dao.deleteProduct(prodDelete);
		
		//java.util.List<Product> products = dao.findAll();
		
		//for(Product p : products) {
			//System.out.println(p);
		//}
	}
	

}
