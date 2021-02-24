package com.niit.ecommerce.dao;


import com.niit.ecommerce.model.User;

public interface UserDAO {
	
	public boolean addUser(User user);
	public boolean deleteUser(User user);
	public boolean updateUser(User user);
	public User getUsertById(int id);
	public java.util.List<User> findAll();

}
