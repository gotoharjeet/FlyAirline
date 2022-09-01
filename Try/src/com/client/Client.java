package com.client;

import java.util.HashSet;
import java.util.Set;

import com.dto.Branch;
import com.dto.Subject;

public class Client {

	public static void main(String[] args) {
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
		
		
		
		Set<Subject> cs_subjects=new HashSet<Subject>();//Set of computer science subjects
		cs_subjects.add(sw);
		cs_subjects.add(ds);
		
		Set<Subject> it_subjects=new HashSet<Subject>();//set of IT subjects
		it_subjects.add(ba);
		/*for (Subject subject:cs_subjects)
		{
			System.out.println(subject.getSubjectId());
			System.out.println(subject.getSubjectDescription());
			System.out.println(subject.getSubjectName());
		}*/
		
		Branch cs=new Branch();
		cs.setBranchId(1);
		cs.setBranchName("Computer Science");
		cs.setDescription("Computer Science and Computer Engineering");
		cs.setShortName("CSE");
		cs.setSubjects(cs_subjects);
		
		System.out.println(cs.getBranchId());
		System.out.println(cs.getBranchName());
		System.out.println(cs.getDescription());
		System.out.println(cs.getShortName());
		for(Subject subject:cs.getSubjects())
		{
			System.out.println(subject.getSubjectId());
			System.out.println(subject.getSubjectDescription());
			System.out.println(subject.getSubjectName());
		}
		Branch it=new Branch();
		it.setBranchId(2);
		it.setBranchName("Information Technology");
		it.setShortName("IT");
		it.setDescription("IT is the business side of the Computers");
		it.setSubjects(it_subjects);
		
		System.out.println(it.getBranchId());
		System.out.println(it.getBranchName());
		System.out.println(it.getDescription());
		System.out.println(it.getShortName());
		
		for(Subject subject:it.getSubjects())
		{
			System.out.println(subject.getSubjectId());
			System.out.println(subject.getSubjectName());
			System.out.println(subject.getSubjectDescription());
		}
	}

}
