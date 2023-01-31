package com.hospital;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Hospital {
		@Id
		 private int id;
		private String Hname;
		
		@OneToMany
		List<Branch>Branch;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getHname() {
			return Hname;
		}

		public void setHname(String hname) {
			Hname = hname;
		}

		public List<Branch> getBranch() {
			return Branch;
		}

		public void setBranch(List<Branch> branch) {
			Branch = branch;
		}
		
		
	}


