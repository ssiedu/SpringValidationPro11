package com.ssi.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ssi.entities.Provider;

@Component
public class ProviderDAO {

	@Autowired
	SessionFactory sessionFactory;
	
	public void saveProvider(Provider provider){
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		session.save(provider);
		tr.commit();
		session.close();
	}
}
