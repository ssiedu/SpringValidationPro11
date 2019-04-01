package com.ssi.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Provider {
	@Id
	private String email;
	private String password;
	private String name;
	private String address;
	private String mobile;
	@OneToOne
	private Service Service;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public Service getService() {
		return Service;
	}
	public void setService(Service service) {
		Service = service;
	}
	@Override
	public String toString() {
		return "Provider [email=" + email + ", password=" + password
				+ ", name=" + name + ", address=" + address + ", mobile="
				+ mobile + ", Service=" + Service + "]";
	}
	
	
}
