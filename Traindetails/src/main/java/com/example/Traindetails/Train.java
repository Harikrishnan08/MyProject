package com.example.Traindetails;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Train Details")
public class Train {
	@Id
	private int trainNo;
	private String trainName;
	@Column(name="train timing")
	private int trainTime;
	public int getTrainNo() {
		return trainNo;
	}
	public void setTrainNo(int trainNo) {
		this.trainNo = trainNo;
	}
	public String getTrainName() {
		return trainName;
	}
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	public int getTrainTime() {
		return trainTime;
	}
	public void setTrainTime(int trainTime) {
		this.trainTime = trainTime;
	}
	
	

}
