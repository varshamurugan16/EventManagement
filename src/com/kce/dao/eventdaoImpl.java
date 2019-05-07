
package com.kce.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import com.kce.model.eventBean;
import com.kce.model.registerBean;


@Repository("evedao")
public class eventdaoImpl implements eventdao {
	
	@Autowired
	 SessionFactory sessionFactory;
	
	@Override
	public eventBean userSignup(eventBean signup)
	{
		sessionFactory.getCurrentSession().save(signup);
		return signup;		
		
	}
	

	@Override
	public int userLogin(String name, String passw) {
		Session session = sessionFactory.getCurrentSession();
		Query q = session.createQuery("from eventBean l where l.name = '" + name + "'");
		List<eventBean> ob = q.list();
		int flag = 0;
		for(eventBean t: ob) {
			if(passw.equals(t.getPass()))
				flag = 1;
			else
				flag = 0;
		}
		return flag;
	}
	
	@Override
	public registerBean eventReg(registerBean availevent)
	{
		sessionFactory.getCurrentSession().save(availevent);
		return eventReg;		
		
	}
	
	
	


	

}
