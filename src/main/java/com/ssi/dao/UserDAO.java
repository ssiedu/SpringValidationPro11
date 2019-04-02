package com.ssi.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ssi.entities.User;

@Component
public class UserDAO {

	@Autowired
	SessionFactory sessionFactory;
	
	public void saveOrUpdateUser(User user){
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		session.saveOrUpdate(user);
		tr.commit();
		session.close();

	}
	public boolean verifyUser(User user){
		Session session=sessionFactory.openSession();
		String hql="from User where email=:email and password=:password";
		Query query=session.createQuery(hql);
		query.setParameter("email", user.getEmail());
		query.setParameter("password", user.getPassword());
		List<User> userList=query.list();
		int no=userList.size();
		session.close();
		if(no==0){
			return false;
		}else{
			return true;
		}
	}
}
