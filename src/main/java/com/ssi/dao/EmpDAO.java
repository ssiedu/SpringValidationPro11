package com.ssi.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ssi.entities.Emp;

@Component
public class EmpDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	public void saveEmp(Emp emp){
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		session.save(emp);
		tr.commit();
		session.close();
	}
}
