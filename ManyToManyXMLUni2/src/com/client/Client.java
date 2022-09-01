package com.client;

import java.util.HashSet;



import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.beans.Author;
import com.beans.Book;
import com.beans.Branch;
import com.beans.Cart;
import com.beans.Item;
import com.beans.Subject;



public class Client {
	public static void main(String[] args) {
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		
		
		/*
		 * Set<Branch> cs_swengg_ds=new HashSet<Branch>(); Set<Branch> it_ba=new
		 * HashSet<Branch>();
		 * 
		 * Set<Subject> swengg_ds_cs=new HashSet<Subject>(); Set<Subject> ba_it=new
		 * HashSet<Subject>();
		 * 
		 * Subject swengg=new Subject();
		 * swengg.setSubjectDescription("Apply key object of s/w engg.");
		 * swengg.setSubjectName("Software Engineering"); swengg_ds_cs.add(swengg);
		 * 
		 * Subject sbds=new Subject();
		 * sbds.setSubjectDescription("Explore recent advances");
		 * sbds.setSubjectName("Distributed System"); swengg_ds_cs.add(sbds);
		 * 
		 * Subject sbBA=new Subject();
		 * sbBA.setSubjectDescription("UnderStand the I/E factors");
		 * sbBA.setSubjectName("Buisness Anylasis and Operation"); ba_it.add(sbBA);
		 * 
		 * 
		 * Branch cs=new Branch(); cs.setBranchName("Computer Science Engineering");
		 * cs.setShortName("CSE");
		 * cs.setDescription("Computer Science and Computer Engineering");
		 * cs_swengg_ds.add(cs);
		 
		
		Branch branch2=new Branch();
		branch2.setBranchName("Information Technology");
		branch2.setShortName("IT");
		branch2.setDescription("IT is the business side of the Computers");
		it_ba.add(branch2);
		
		//swengg_ds_cs.add(swengg);
		//swengg_ds_cs.add(sbds);
		//ba_it.add(sbBA);
		
		//it_ba.add(branch2);
		//cs_swengg_ds.add(cs);*/
		
		
		
		
		
		Subject sw=new Subject();
		sw.setSubjectId(101);
		sw.setSubjectDescription("Apply key object of s/w engg");
		sw.setSubjectName("Software Engineering");
		
		
		Subject ds=new Subject();
		ds.setSubjectId(102);
		ds.setSubjectDescription("Explore recent advances");
		ds.setSubjectName("Distributed System");
		
		
		Subject ba=new Subject();
		ba.setSubjectId(103);
		ba.setSubjectDescription("UnderStand the I/E factors");
		ba.setSubjectName("Buisness Anylasis and Operation");
		
		
		Branch cs=new Branch();
		cs.setBranchId(1);
		cs.setBranchName("Computer Science");
		cs.setDescription("Computer Science and Computer Engineering");
		cs.setShortName("CSE");
		
		
		
		Branch it=new Branch();
		it.setBranchId(2);
		it.setBranchName("Information Technology");
		it.setShortName("IT");
		it.setDescription("IT is the business side of the Computers");
		
		
		Set<Branch> it_branch =new HashSet<Branch>();
		it_branch.add(it);
		ba.setBranches(it_branch);
		
		Set<Branch> cs_branch =new HashSet<Branch>();
		cs_branch.add(cs);
		sw.setBranches(cs_branch);
		ds.setBranches(cs_branch);
		
		
		Set<Subject> cs_subjects=new HashSet<Subject>();//Set of computer science subjects
		cs_subjects.add(sw);
		cs_subjects.add(ds);
		cs.setSubjects(cs_subjects);
		
		Set<Subject> it_subjects=new HashSet<Subject>();//set of IT subjects
		it_subjects.add(ba);
		it.setSubjects(it_subjects);
		
		
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();
		
		session.save(ba);
		session.save(ds);
		session.save(sw);
		//session.save(cs);
		//session.save(it);
		
		txn.commit();
		factory.close();
	}
}
