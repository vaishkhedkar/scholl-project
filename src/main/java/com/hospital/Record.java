package com.hospital;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Record {
	@Id
		private int Rid;
		private String Rname;
		private int time;
		private String Symptoms;
		
		@ManyToOne
		Patient patient;
		@ManyToOne
		Branch b;
		public int getRid() {
			return Rid;
		}
		public void setRid(int rid) {
			Rid = rid;
		}
		public String getRname() {
			return Rname;
		}
		public void setRname(String rname) {
			Rname = rname;
		}
		public int getTime() {
			return time;
		}
		public void setTime(int time) {
			this.time = time;
		}
		public String getSymptoms() {
			return Symptoms;
		}
		public void setSymptoms(String symptoms) {
			Symptoms = symptoms;
		}
		public Patient getPatient() {
			return patient;
		}
		public void setPatient(Patient patient) {
			this.patient = patient;
		}
		public Branch getB() {
			return b;
		}
		public void setB(Branch b) {
			this.b = b;
		}
		
		
	}
