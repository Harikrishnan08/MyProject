package com.spring.EducationLoan.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Adminmodel {
	@Id

		private String email;
		private String password;
		private String mobileno;
		private String userrole;
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getMobileno() {
			return mobileno;
		}
		public void setMobileno(String mobileno) {
			this.mobileno = mobileno;
		}
		public String getUserrole() {
			return userrole;
		}
		public void setUserrole(String userrole) {
			this.userrole = userrole;
		}

}
