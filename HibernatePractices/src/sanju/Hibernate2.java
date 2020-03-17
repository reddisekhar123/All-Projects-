package sanju;

	import org.hibernate.*;
	import org.hibernate.cfg.*;
	
	public class Hibernate2 {
		public static void main(String[] args) {
			Session session1=null;
			SessionFactory sf=null;
			Transaction tx=null;
			try {
			sf=new Configuration().configure().buildSessionFactory();
			session1=sf.openSession();
			
			 tx=session1.beginTransaction();
			System.out.println("Inserting Record....<br>");
			Address address1=new Address("OMR Road","Chennai","TN","600097");
			Address address2=new Address("Ring Road","Banglore","KA","560000");

			Student student1=new Student("SanjuReddy",address1);
			Student student2=new Student("Reddysekhar",address2);

			session1.save(student1);
			session1.save(student2);
			
			 tx.commit();
			
		
			 System.out.println("Done writing....<br>");
			}
			catch(Exception e) {
				System.out.println("Caught exception"+e);
			}
			finally {
			 session1.close();
			 sf.close();
			}
		
	
	}
	}


