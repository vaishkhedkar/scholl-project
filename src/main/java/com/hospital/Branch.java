package com.hospital;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Branch {
		@Id
		int Bid;
		String Bname;
		String Location;
		@OneToOne
		Address add;
		@OneToMany
		List<Record>Rec;
		@ManyToOne
		Hospital Hosip;
		public int getBid() {
			return Bid;
		}
		public void setBid(int bid) {
			Bid = bid;
		}
		public String getBname() {
			return Bname;
		}
		public void setBname(String bname) {
			Bname = bname;
		}
		public String getLocation() {
			return Location;
		}
		public void setLocation(String location) {
			Location = location;
		}
		public Address getAdd() {
			return add;
		}
		public void setAdd(Address add) {
			this.add = add;
		}
		public List<Record> getRec() {
			return Rec;
		}
		public void setRec(List<Record> rec) {
			Rec = rec;
		}
		public Hospital getHosip() {
			return Hosip;
		}
		public void setHosip(Hospital hosip) {
			Hosip = hosip;
		}
		
		
		
	}

