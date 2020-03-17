package sanju;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class Save {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		//Object o=session.load(Product.class,new Integer(101));
		//Product s=(Product)o;
	
		//System.out.println("Loaded object product name is____"+s.getProName());
		
		
		
		
		Product p=new Product();
		p.setProductId(104);
		
		p.setProName("MI");
		p.setPrice(45000);
		
		 Transaction tx=session.beginTransaction();
		 session.save(p);
		// session.delete(s);
		 System.out.println("Object saved successfully.....!!");
		 tx.commit();
		 session.close();
		 factory.close();
	}
}
