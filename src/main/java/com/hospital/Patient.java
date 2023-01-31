package com.hospital;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Patient {
		@Id
		private int id;
		
		@ManyToMany
		List<Disease>diseases;
		@OneToMany
	  List<Record>Records;
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public List<Disease> getDiseases() {
			return diseases;
		}
		public void setDiseases(List<Disease> diseases) {
			this.diseases = diseases;
		}
		public List<Record> getRecords() {
			return Records;
		}
		public void setRecords(List<Record> records) {
			Records = records;
		}
	  
		
	}
