package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "traindetails")
public class Traindetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String trname;
	private String location;
	private float rating;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRname() {
		return trname;
	}
	public void setRname(String trname) {
		this.trname = trname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Restaurant [id=" + id + ", rname=" + trname + ", location=" + location + ", rating=" + rating + "]";
	}
	public String getTrname() {
		return trname;
	}
	public void setTrname(String trname) {
		this.trname = trname;
	}
	
}
