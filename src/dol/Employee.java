package dol;

import java.util.Date;

import misc.DateOperator;

public class Employee extends Person implements IPerson {
	
	private String employeeNumber;
	private Date entryDate;
	private String job;
	
	
	public Employee(String firstName, String middleName, String surName, String secondSurname, String gender,
			Date birthDate, int age) {
		super(firstName, middleName, surName, secondSurname, gender, birthDate, age);
		
	}


	public Employee(String firstName, String middleName, String surName, String secondSurName, String gender,
			Date birthDate, int age, String employeeNumber, Date entryDate, String job) {
		super(firstName, middleName, surName, secondSurName, gender, birthDate, age);
		this.employeeNumber = employeeNumber;
		this.entryDate = entryDate;
		this.job = job;
	}
	
	public Employee() {
		
	}


	public String getEmployeeNumber() {
		return employeeNumber;
	}


	public void setEmployeeNumber(String employeeNumber) {
		this.employeeNumber = employeeNumber;
	}


	public Date getEntryDate() {
		return entryDate;
	}


	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}


	public String getJob() {
		return job;
	}


	public void setJob(String job) {
		this.job = job;
	}


	@Override
	public void showDataAsRow() {
		
		System.out.printf("%s %s %s %s %s %d %s %d %s", 
				getFirstName(), 
				getMiddleName(), 
				getSurName(), 
				getSecondSurname(), 
				getGender(),
				DateOperator.dateToString(getBirthDate(), "dd/MM/yyyy"),
				getAge(),
				getEmployeeNumber(),
				DateOperator.dateToString(getEntryDate(), "dd/MM/yyyy"),
				getJob());
		System.out.println("___________________________________________________________________________________");
	}




	@Override
	public void showDataAsForm() {
		
		System.out.println();
		System.out.printf("\nNúmero de empleado: %s Primer nombre: %s \nPrimer nombre: %s \nSegundo nombre: %s \nPrimer apellido %s \nSegundo apellido: %s \nGenero: %s \nFecha de nacimiento: $s \nEdad: %d \nFecha de entrada: %s \nPuesto de trabajo: %s", 
				getEmployeeNumber(),
				getFirstName(), 
				getMiddleName(), 
				getSurName(), 
				getSecondSurname(), 
				getGender(),
				DateOperator.dateToString(getBirthDate(), "dd/MM/yyyy"),
				getAge(),
				DateOperator.dateToString(getEntryDate(), "dd/MM/yyyy"),
				getJob());
	   
		System.out.println();
	}


	@Override
	public String getFirstName() {
		// TODO Auto-generated method stub
		return super.getFirstName();
	}


	@Override
	public void setFirstName(String firstName) {
		// TODO Auto-generated method stub
		super.setFirstName(firstName);
	}


	@Override
	public String getMiddleName() {
		// TODO Auto-generated method stub
		return super.getMiddleName();
	}


	@Override
	public void setMiddleName(String middleName) {
		// TODO Auto-generated method stub
		super.setMiddleName(middleName);
	}


	@Override
	public String getSurName() {
		// TODO Auto-generated method stub
		return super.getSurName();
	}


	@Override
	public void setSurName(String surName) {
		// TODO Auto-generated method stub
		super.setSurName(surName);
	}


	@Override
	public String getSecondSurname() {
		// TODO Auto-generated method stub
		return super.getSecondSurname();
	}


	@Override
	public void setSecondSurname(String secondSurName) {
		// TODO Auto-generated method stub
		super.setSecondSurname(secondSurName);
	}


	@Override
	public String getGender() {
		// TODO Auto-generated method stub
		return super.getGender();
	}


	@Override
	public void setGender(String gender) {
		// TODO Auto-generated method stub
		super.setGender(gender);
	}


	@Override
	public Date getBirthDate() {
		// TODO Auto-generated method stub
		return super.getBirthDate();
	}


	@Override
	public void setBirthDate(Date birthDate) {
		// TODO Auto-generated method stub
		super.setBirthDate(birthDate);
	}
	
	
	
	
	
	

}
