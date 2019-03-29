package com.ssi.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ssi.entities.Service;

@Component
public class ServiceDAO {
	
	@Autowired
	SessionFactory sessionFactory;
	
	public void removeService(String code){
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		Service service=new Service(); 
		service.setScode(code);
		session.delete(service);
		tr.commit();
		session.close();
	}
	public List<Service> getAllServices(){
		Session session=sessionFactory.openSession();
		Criteria cr=session.createCriteria(Service.class);
		List<Service> serviceList=cr.list();
		session.close();
		return serviceList;
	}
	public void addSerive(Service service){
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		session.save(service);
		tr.commit();
		session.close();
	}
}
