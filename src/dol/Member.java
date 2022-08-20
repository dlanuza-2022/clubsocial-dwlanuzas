package dol;

import java.util.Date;

import misc.DateOperator;

public class Member extends Person implements IPerson {
	
	private String membershipNumber;
	private Date memberSince;
	private Date membershipIssuance;
	private Date membershipExpiration;
	
	
	public Member(String firstName, String middleName, String surName, String secondSurname, String gender,
			Date birthDate, int age) {
		super(firstName, middleName, surName, secondSurname, gender, birthDate, age);

	}


	public Member(String firstName, String middleName, String surName, String secondSurName, String gender,
			Date birthDate, int age, String membershipNumber, Date memberSince, Date membershipIssuance,
			Date membershipExpiration) {
		super(firstName, middleName, surName, secondSurName, gender, birthDate, age);
		this.membershipNumber = membershipNumber;
		this.memberSince = memberSince;
		this.membershipIssuance = membershipIssuance;
		this.membershipExpiration = membershipExpiration;
	}
	
	public Member() {
	
		
	}


	public String getMembershipNumber() {
		return membershipNumber;
	}


	public void setMembershipNumber(String membershipNumber) {
		this.membershipNumber = membershipNumber;
	}


	public Date getMemberSince() {
		return memberSince;
	}


	public void setMemberSince(Date memberSince) {
		this.memberSince = memberSince;
	}


	public Date getMembershipIssuance() {
		return membershipIssuance;
	}


	public void setMembershipIssuance(Date membershipIssuance) {
		this.membershipIssuance = membershipIssuance;
	}


	public Date getMembershipExpiration() {
		return membershipExpiration;
	}


	public void setMembershipExpiration(Date membershipExpiration) {
		this.membershipExpiration = membershipExpiration;
	}


	@Override
	public void showDataAsRow() {
		
		
        System.out.printf("%s %s %s %s %s %s %s %s %s %s",
				getFirstName(), 
				getMiddleName(), 
				getSurName(), 
				getSecondSurname(), 
				getGender(),
				DateOperator.dateToString(getBirthDate(), "dd/MM/yyyy"),
				getMembershipNumber(),
				DateOperator.dateToString(getMemberSince(), "dd/MM/yyyy"),
				DateOperator.dateToString(getMembershipIssuance(), "dd/MM/yyyy"),
				DateOperator.dateToString(getMembershipExpiration(), "dd/MM/yyyy"));
		System.out.println("_______________________________________________________________________________");
		
	}


	@Override
	public void showDataAsForm() {
		System.out.println();
		System.out.printf("\nNúmero de membresía: %s Primer nombre: %s \nPrimer nombre: %s \nSegundo nombre: %s \nPrimer apellido %s \nSegundo apellido: %s \nGenero: %s \nFecha de nacimiento: $s \nEdad: %d \nFecha de entrada: %s \nPuesto de trabajo: %s", 
				getMembershipNumber(),
				getFirstName(), 
				getMiddleName(), 
				getSurName(), 
				getSecondSurname(), 
				getGender(),
				DateOperator.dateToString(getBirthDate(), "dd/MM/yyyy"),
				getAge(),
				DateOperator.dateToString(getMemberSince(), "dd/MM/yyyy"),
				DateOperator.dateToString(getMembershipIssuance(), "dd/MM/yyyy"),
				DateOperator.dateToString(getMembershipExpiration(), "dd/MM/yyyy"));
				
				
	   
		System.out.println();
	
	
	}
	
	
	
	
	
	

}
