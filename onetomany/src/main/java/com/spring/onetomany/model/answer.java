package com.spring.onetomany.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class answer {
@Id
private int ansno;
private String opt1;
private String opt2;
private String opt3;
private String opt4;
private String opt5;
public int getAnsno() {
	return ansno;
}
public void setAnsno(int ansno) {
	this.ansno = ansno;
}
public String getOpt1() {
	return opt1;
}
public void setOpt1(String opt1) {
	this.opt1 = opt1;
}
public String getOpt2() {
	return opt2;
}
public void setOpt2(String opt2) {
	this.opt2 = opt2;
}
public String getOpt3() {
	return opt3;
}
public void setOpt3(String opt3) {
	this.opt3 = opt3;
}
public String getOpt4() {
	return opt4;
}
public void setOpt4(String opt4) {
	this.opt4 = opt4;
}
public String getOpt5() {
	return opt5;
}
public void setOpt5(String opt5) {
	this.opt5 = opt5;
}

	
}


