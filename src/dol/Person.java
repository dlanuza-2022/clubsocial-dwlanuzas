package dol;

import java.util.Date;


public abstract class Person {
	
	private String firstName;
	private String middleName;
	private String surName;
	private String secondSurname;
	private String gender;
	private Date birthDate;
	private int age;
	
	public Person(String firstName, String middleName, String surName, String secondSurName, String gender,
			Date birthDate, int age) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.surName = surName;
		this.secondSurname = secondSurName;
		this.gender = gender;
		this.birthDate = birthDate;
		this.age = age;
	}
	
	
	public Person() {
		
		
	}
	


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getMiddleName() {
		return middleName;
	}


	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}


	public String getSurName() {
		return surName;
	}


	public void setSurName(String surName) {
		this.surName = surName;
	}


	public String getSecondSurname() {
		return secondSurname;
	}


	public void setSecondSurname(String secondSurName) {
		this.secondSurname = secondSurName;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public Date getBirthDate() {
		return birthDate;
	}


	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	
	
	
	

}
