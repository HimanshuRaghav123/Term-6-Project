package com.niit.ecommerce.driver;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.ecommerce.dao.ProductDAO;
import com.niit.ecommerce.dao.UserDAO;
import com.niit.ecommerce.model.Product;
import com.niit.ecommerce.model.User;

public class UserDriver {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		
		context.scan("com.niit.ecommerce");
		context.refresh();
		
		User user = new User("Himanshu", "himanshu", "himanshu@gmail.com", 1234567, "gaziabaad", "00/00/0000");
		
		UserDAO dao = (UserDAO) context.getBean("userDAO");
		 
		dao.addUser(user);
		
		//Update the user
		//User us = dao.getUserById(2);
		//us.set;
		
		//dao.update(us);
		
		//User usDelete = dao.getUserById(1);
		//dao.deleteUser(usDelete);
		
		java.util.List<User> user1 = dao.findAll();
		
		for(User u : user1) {
			System.out.println(u);
		}

}
}
