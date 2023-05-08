package com.spring.EducationLoan.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Loginmodel {
	@Id
	private int loginid;
	private String email;
	private String password;
	public int getLoginid() {
		return loginid;
	}
	public void setLoginid(int loginid) {
		this.loginid = loginid;
	}
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

}
