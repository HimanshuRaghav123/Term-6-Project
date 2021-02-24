package com.niit.ecommerce.daoimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.ecommerce.dao.UserDAO;

import com.niit.ecommerce.model.User;

@Repository(value = "userDAO")
@Transactional
public class UserDAOimpl implements UserDAO{
	
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public boolean addUser(User user) {
		sessionFactory.getCurrentSession().save(user);
		
		return true;
	}

	@Override
	public boolean deleteUser(User user) {
		sessionFactory.getCurrentSession().delete(user);
		
		return true;
	}

	@Override
	public boolean updateUser(User user) {
		sessionFactory.getCurrentSession().update(user);
		
		return true;
	}

	@Override
	public User getUsertById(int id) {
	
		return 	 sessionFactory.getCurrentSession().get(User.class, id);
	}

	@Override
	public List<User> findAll() {
		Query query = sessionFactory.getCurrentSession().createQuery("from User");
		List<User> list = query.list();
	return list;
	}

	
}
