package com.management.employeeModel;

import jakarta.persistence.Entity;

@Entity
public class Employee {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	privatelongid;
	private String name;
	private String email;
	private String dob;
	
	
	
	publicintgetAge() {
			returnage;
		}
		publicvoidsetAge(intage) {
			this.age = age;
		}
		@Transient
	privateintage;
		
	privatedoublesalary;
	privatebooleanstatus;
	
	public String getDob() {
			returndob;
		}
		publicvoidsetDob(String dob) {
			this.dob = dob;
		}
		publicdoublegetSalary() {
			returnsalary;
		}
		publicvoidsetSalary(doublesalary) {
			this.salary = salary;
		}
		publicbooleanisStatus() {
			returnstatus;
		}
		publicvoidsetStatus(booleanstatus) {
			this.status = status;
		}
		publiclonggetId() {
	returnid;
	    }
	publicvoidsetId(longid) {
	this.id = id;
	    }
	public String getName() {
	returnname;
	    }
	publicvoidsetName(String name) {
	this.name = name;
	    }
	public String getEmail() {
	returnemail;
	    }
	publicvoidsetEmail(String email) {
	this.email = email;
	    }
	}



