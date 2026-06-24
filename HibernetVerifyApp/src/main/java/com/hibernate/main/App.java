package com.hibernate.main;
import com.hibernate.entity.Student;
import com.hibernate.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class App {

	 public static void main(String[] args) {
		 Session session = null;
		 Transaction transaction = null;
		 
		 try {
			 
			 session = HibernateUtil.getSessionFactory()
					 .openSession();
			 
			 // Start Transaction
	            transaction = session.beginTransaction();
	            
	            // Create Object
	            Student student = new Student();
	            
	            student.setId(101);
	            student.setName("Amol");
	            student.setCourse("Java Full Stack");
	            
	            // Save Object
	            
	            session.merge(student);
	            
	            // Commit Transaction
	            transaction.commit();
	            
	            System.out.println("Student record inserted successfully");

	            // Verify Data
	            Student fetchedStudent = session.get(Student.class, 101);

	            System.out.println("Fetched Record:");
	            System.out.println(fetchedStudent);
	            
	            
		 }  catch (Exception e) {
			 
			 if (transaction != null) {
	                transaction.rollback();
	            }

	            e.printStackTrace();

	        } finally {

	            if (session != null) {
	                session.close();
	            }
	        }
	    }

		 
	 }

