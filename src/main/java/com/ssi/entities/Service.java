package com.ssi.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Service {
	@Id
	private String scode;
	private String sname;
	private int charge;
	public String getScode() {
		return scode;
	}
	public void setScode(String scode) {
		this.scode = scode;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getCharge() {
		return charge;
	}
	public void setCharge(int charge) {
		this.charge = charge;
	}
	
}
