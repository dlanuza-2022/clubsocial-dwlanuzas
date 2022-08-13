package dol;

import java.util.Date;

public class Employee extends Person implements IPerson {
	
	private String employeeNumber;
	private Date entryDate;
	private String job;
	
	
	public Employee(String firstName, String middleName, String surName, String secondSurname, String gender,
			Date birthDate) {
		super(firstName, middleName, surName, secondSurname, gender, birthDate);
		
	}


	public Employee(String firstName, String middleName, String surName, String secondSurName, String gender,
			Date birthDate, String employeeNumber, Date entryDate, String job) {
		super(firstName, middleName, surName, secondSurName, gender, birthDate);
		this.employeeNumber = employeeNumber;
		this.entryDate = entryDate;
		this.job = job;
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
		
		System.out.print("\nEmpleado número: " + getEmployeeNumber() + " Primer nombre: " + getFirstName() + " Segundo nombre: " + getMiddleName() + " Primer apellido: " + getSurName() + " Segundo apellido: " + getSecondSurname() + " Sexo: " + getGender() + " Fecha de nacimiento: " + getBirthDate() + " Fecha de entrada: " + getEntryDate() + " Posición laboral: " + getJob());
		
	}


	@Override
	public void showDataAsForm() {
		
		System.out.printf("\nEmpleado número: %s", getEmployeeNumber());
		System.out.printf("\nPrimer nombre: %s", getFirstName());
		System.out.printf("\nSegundo nombre: %s", getMiddleName());
		System.out.printf("\nPrimer apellido: %s", getSurName());
		System.out.printf("\nSegundo apellido: %s", getSecondSurname());
		System.out.printf("\nSexo: %s", getGender());
		System.out.printf("\nFecha de nacimiento: %D", getBirthDate());
		System.out.printf("\nFecha de entrada: %D", getEntryDate());
	    System.out.printf("\nFecha de inscripción: %s", getJob());
	   
		
	}
	
	
	
	
	
	

}
