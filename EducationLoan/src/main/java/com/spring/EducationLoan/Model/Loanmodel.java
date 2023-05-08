package com.spring.EducationLoan.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Loanmodel {
	@Id
	private int loanid;
	private String loantype;
	private String applicantname;
	private String applicantaddress;
	private String applicantemail;
	private String applicantadhar;
	private String applicantpan;
	private String applicantsalary;
	private String loanamoutrequired;
	private String loanrepaymentmethods;
	private String applicantmobile;
	public int getLoanid() {
		return loanid;
	}
	public void setLoanid(int loanid) {
		this.loanid = loanid;
	}
	public String getLoantype() {
		return loantype;
	}
	public void setLoantype(String loantype) {
		this.loantype = loantype;
	}
	public String getApplicantname() {
		return applicantname;
	}
	public void setApplicantname(String applicantname) {
		this.applicantname = applicantname;
	}
	public String getApplicantaddress() {
		return applicantaddress;
	}
	public void setApplicantaddress(String applicantaddress) {
		this.applicantaddress = applicantaddress;
	}
	public String getApplicantemail() {
		return applicantemail;
	}
	public void setApplicantemail(String applicantemail) {
		this.applicantemail = applicantemail;
	}
	public String getApplicantadhar() {
		return applicantadhar;
	}
	public void setApplicantadhar(String applicantadhar) {
		this.applicantadhar = applicantadhar;
	}
	public String getApplicantpan() {
		return applicantpan;
	}
	public void setApplicantpan(String applicantpan) {
		this.applicantpan = applicantpan;
	}
	public String getApplicantsalary() {
		return applicantsalary;
	}
	public void setApplicantsalary(String applicantsalary) {
		this.applicantsalary = applicantsalary;
	}
	public String getLoanamoutrequired() {
		return loanamoutrequired;
	}
	public void setLoanamoutrequired(String loanamoutrequired) {
		this.loanamoutrequired = loanamoutrequired;
	}
	public String getLoanrepaymentmethods() {
		return loanrepaymentmethods;
	}
	public void setLoanrepaymentmethods(String loanrepaymentmethods) {
		this.loanrepaymentmethods = loanrepaymentmethods;
	}
	public String getApplicantmobile() {
		return applicantmobile;
	}
	public void setApplicantmobile(String applicantmobile) {
		this.applicantmobile = applicantmobile;
	}
	

}
