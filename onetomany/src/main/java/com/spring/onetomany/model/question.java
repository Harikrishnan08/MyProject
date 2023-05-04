package com.spring.onetomany.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class question {
	
	@Id
	private int qno;
	private String qname; 
	
	
	@OneToMany(cascade = CascadeType.ALL) 
	@JoinColumn
	private List<answer> ans;
	public int getQno() {
		return qno;
	}
	public void setQno(int qno) {
		this.qno = qno;
	}
	public String getQname() {
		return qname;
	}
	public void setQname(String qname) {
		this.qname = qname;
	}
	public List<answer> getAns() {
		return ans;
	}
	public void setAns(List<answer> ans) {
		this.ans = ans;
	} 

}
