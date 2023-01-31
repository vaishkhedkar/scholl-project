package com.hospital;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Disease {
		@Id
		private int id;
		private String Dname;
		
		@ManyToMany
		List<Patient>patient;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getDname() {
			return Dname;
		}

		public void setDname(String dname) {
			Dname = dname;
		}

		public List<Patient> getPatient() {
			return patient;
		}

		public void setPatient(List<Patient> patient) {
			this.patient = patient;
		}
			

	}

