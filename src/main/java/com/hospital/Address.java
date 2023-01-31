package com.hospital;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Address {
		@Id
		int Aid;
		int Pincode;
		String City;
		@OneToOne
		Branch b;
		public int getAid() {
			return Aid;
		}
		public void setAid(int aid) {
			Aid = aid;
		}
		public int getPincode() {
			return Pincode;
		}
		public void setPincode(int pincode) {
			Pincode = pincode;
		}
		public String getCity() {
			return City;
		}
		public void setCity(String city) {
			City = city;
		}
		public Branch getB() {
			return b;
		}
		public void setB(Branch b) {
			this.b = b;
		}
		
	}
