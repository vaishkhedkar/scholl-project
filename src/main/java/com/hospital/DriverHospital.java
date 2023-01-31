package com.hospital;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DriverHospital {


	 public static void main(String[] args) {
		
		 EntityManagerFactory emf=Persistence.createEntityManagerFactory("v");
		 EntityManager em=emf.createEntityManager();
		 EntityTransaction et=em.getTransaction();
		 
//		 Hospital h=new Hospital();
//		 h.setId(1);     	 h.setName("Ruby ");  //h.setBranch(null);
//		 
//		 Branch b=new Branch();
//		 b.setBid(1);   	 b.setBname("pune");  	 b.setLocation("Karvenagar");
//		 
//		 List<Branch>Br=new ArrayList<Branch>();
//		 Br.add(b); 
//		 h.setBranch(Br);  // We have set the branches in Hospital variable h .
//		 
//		 Address a=new Address();
//		 a.setAid(1);  	 a.setPincode(411030);  	 a.setCity("Pune");  
//		 
//		 List<Address>Adds=new ArrayList<Address>();
//		 Adds.add(a);
//		 b.setAdd(a);
//		 
//		 Record r=new Record();     // Create a Object for Record.
//		 r.setRid(1);  	 r.setRname("KGF");  	 r.setSymptoms("mental"); 	 r.setTime(4);
//		 
//		 List<Record>Re=new ArrayList<Record>();
//		 Re.add(r);
//		 b.setRec(Re);
//		 
//		 
//		 Patient p=new Patient();   // Create a Object of Patient .
//		 p.setId(1);
//		 r.setPatient(p);
//		 
//		 List<Patient>p1=new ArrayList<Patient>();
//		 p1.add(p);
//		// r.setPatient(p1);
	//
//		 Disease d=new Disease();
//		 d.setId(1);     d.setDname("Cancer");
//		 
//		 Disease d1=new Disease();
//		 d1.setId(2);    d1.setDname("Backpain");
//		 
//		 List<Disease> di=new ArrayList<Disease>();
//		 di.add(d);    	 di.add(d1);
//		 
//		 p.setDiseases(di); // We have set all the Disease in patient variable p .
//		 d.setPatient(p1);
//		 
//		 et.begin();
//		 
//		 em.persist(h);
//		 em.persist(b);       em.persist(Br);
//		 em.persist(a);       //em.persist(Adds);
//		 em.persist(r);       //em.persist(Re);
//		 em.persist(p);       //em.persist(p1);
//		 em.persist(d);       //em.persist(di);   em.persist(d1);
//		 et.commit();
	//
		 
		 Hospital h=new Hospital();
		 h.setId(1); h.setHname("Ruby hall");

		 Branch b=new Branch();
		 b.setBid(1);  b.setBname("Pune");  b.setLocation("Station");
	     //b.setRec(null);

		b.setHosip(h);
		 
		 Address a=new Address();
		 a.setAid(1);   a.setCity("Satara");  a.setPincode(451566);
		 
		 
		 Record r=new Record();
		 r.setRid(1);   r.setRname("ABC");  
		 //r.setPatient(null);
		 r.setB(b);
		
		 
		 Patient p=new Patient();
		 p.setId(1);
		 //p.setRecords(null);
		 
		 List<Patient>p1=new ArrayList<Patient>();
	     p1.add(p);
		 
		 Disease d=new Disease();
	     d.setId(1);     d.setDname("Cancer");
	     
	     List<Disease> di=new ArrayList<Disease>();
		 di.add(d);   
		 
		 p.setDiseases(di);
		 
		 
		 List<Branch>Branches=new ArrayList<Branch>();
		 h.setBranch(Branches);
		 
		 et.begin();
		 em.persist(b);
		 em.persist(h);
		 em.persist(a);
		 em.persist(p);
		 em.persist(d);
		 et.commit();
	 }
	}
		 