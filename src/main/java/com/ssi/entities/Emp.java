package com.ssi.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

@Entity
public class Emp {
	
	@Id
	@Min(1001)
	private int eno;
	
	@Size(min=3, max=10, message="Your Name Must Between 3-10 Chars")
	@Pattern(regexp="[a-zA-Z]*", message="Only Alphabates Allowed")
	private String ename;
	
	@Min(value=10000,message="Salary Cant Be Less Than 10000")
	@Max(value=100000, message="Salary Cant Exceed 100000")
	
	private int sal;
	
	@Email(message="Wrong Format For Email")
	private String email;
	
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
