package com.jspider.KycAPP.Repositary;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.jspider.KycAPP.Entity.KycEntity;
import com.jspider.KycAPP.util.SingleTonUtil;

public class KycRepositary  {
	
	
	
	public void saveDoc(KycEntity k)
	{
//		Configuration configuration = new Configuration();
//		configuration.configure();
//		SessionFactory sessionFactory = configuration.buildSessionFactory();
//		Session session = sessionFactory.openSession();
//		Transaction transaction = session.beginTransaction();
		
		Session session = SingleTonUtil.getSession().openSession();
		session.save(k);
		Transaction transaction = session.beginTransaction();
		transaction.commit();
		
		System.out.println("Record added  Successfully");
	}
	
	public KycEntity findById(Long id)
	{
	
		Session session = SingleTonUtil.getSession().openSession();
		return	session.get(KycEntity.class, id);
	
	}
	
	
	public void deleteById(Long id) {
		
		if(findById(id)!=null) {
			
			Session session=SingleTonUtil.getSession().openSession();
			Transaction transaction = session.beginTransaction();
			
			session.delete(id);
			transaction.commit();
			System.out.println("Data deleted Successfully");
		}
		else System.out.println("no record found");
	}
	
	public void updateContactNumById(Long id, Long contactNum)
	{
		KycEntity k = findById(id);
		
		if(k!=null) {
			
			k.setContactNum(contactNum);
		
			Session session=SingleTonUtil.getSession().openSession();
			Transaction transaction = session.beginTransaction();
			
			session.update(k);
			transaction.commit();
			System.out.println("contact updated Successfully");
		}
		else System.out.println("no record found");
		
	}
	
	public KycEntity verifyDocById(Long id) {
		
		KycEntity k = findById(id);
		
		if(k!=null || k.getFirstName()!=null || k.getLastName()!=null || k.getCity()!=null || k.getContactNum()!=null || k.getState()!=null || k.getPincode()!=null || k.getCountry()!=null|| k.getDocType()!=null)
		{
			k.setIsDocVerified(true);
		
			Session session=SingleTonUtil.getSession().openSession();
			Transaction transaction = session.beginTransaction();
			session.update(k);
			transaction.commit();
			
			}
		else System.out.println("no record Found !!!");
		
		return k;
	}
	
	public List<KycEntity> findAll()
	{
		Session session=SingleTonUtil.getSession().openSession();
		
		String hql = "from KycEntity ";
		
		Query query = session.createQuery(hql);
		return query.list();
		
	}
	
	public List<KycEntity> findAllByDocType(String DocType)
	{
		Session session=SingleTonUtil.getSession().openSession();
		
		String hql = "from KycEntity where DocType=:doc";
		Query query = session.createQuery(hql);
		query.setParameter("doc", DocType);
		return query.list();
			
	}
	
	public void updateCityAndPincodeByContactNum(String city, String pincode, Long contactNum )
	{
		Session session=SingleTonUtil.getSession().openSession();
		Transaction transaction = session.beginTransaction();
		
		String hql ="update KycEntity set city=:c, pincode=:p where contactNum=:n";
		Query query = session.createQuery(hql);
		query.setParameter("c",city);
		query.setParameter("p", pincode);
		query.setParameter("n", contactNum);
		
		
		query.executeUpdate();
		transaction.commit();
	}
	
	public void deleteRecByFirstAndLastName(String firstName, String lastName)
	{
		Session session=SingleTonUtil.getSession().openSession();
		Transaction transaction = session.beginTransaction();
		
		String hql = "delete KycEntity where  firstName=:fname and lastName=:lname";
		Query query = session.createQuery(hql);
		query.setParameter("fname", firstName);
		query.setParameter("lname", lastName);
		
		query.executeUpdate();
		transaction.commit();
		
	}

}













