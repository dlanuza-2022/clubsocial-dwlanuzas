package ui;

import java.util.Scanner;

import dol.Club;
import dol.Member;
import misc.DateOperator;

public class MemberMenu implements IMenu {
	Scanner sc = new Scanner(System.in);
	Menu menu = new Menu();
	Club club = new Club(" ");
	private String ddMMyyyy;
	Member m = new Member(" ", " ", " ", " ", " ", DateOperator.stringToDate("24121999", ddMMyyyy));

	@Override
	public void displayOptions() {
		System.out.println("Gestión de miembros.");
		System.out.println("1. Agregar nuevo miembro.");
		System.out.println("2. Mostrar lista de miembros.");
		System.out.println("3. Volver al menu principal.");
		
	}
	

	@Override
	public void show() {
		displayOptions();
		
		short option = 0;
		do {
			displayOptions();
			option = sc.nextShort();
			switch (option) {
				case 1:
					addMember();
					break;
				case 2:
					showMembers();
					break;
				case 3:
					menu.show();
					break;
				default:
					System.out.println("Opción no válida.");
					break;
			}
			
		}while(option!=3);
		
	}
	
public void addMember() {
		
		System.out.println("===Agregar nuevo empleado.===");
		
		System.out.print("\n-Nombre de empleado: ");
		System.out.print("\n-Primer nombre: ");
		m.setFirstName(sc.nextLine());
		
		System.out.print("\n-Segundo nombre: ");
		m.setMiddleName(sc.nextLine());
		
		System.out.print("\n-Primer apellido: ");
		m.setSurName(sc.nextLine());
		
		System.out.print("\n-Segundo Apellido: ");
		m.setSecondSurname(sc.nextLine());
		
		System.out.print("\n-Sexo del empleado: ");
		m.setGender(sc.nextLine());
		
		System.out.print("\n===Fecha de nacimiento===");
		System.out.print("\n-Formato de fecha: ");
		String tempFormat = sc.nextLine();
		System.out.print("\n-Fecha: ");
		String tempDate = sc.nextLine();
		
		
		if(DateOperator.isDate(tempDate, tempFormat) == true) {
			
			
			m.setBirthDate(DateOperator.stringToDate(tempDate, tempFormat));
			
			
		}else {
			System.out.println("Error.");
		}
		
		System.out.print("\n-Número de membresía: ");
		m.setMembershipNumber(sc.nextLine());
		
		
		System.out.print("\n===Fecha de creación de la membresía===");
		System.out.print("\nFormato de la fecha: ");
		tempFormat = sc.nextLine();
		System.out.print("\nFecha: ");
		tempDate = sc.nextLine();
		
        if(DateOperator.isDate(tempDate, tempFormat) == true) {
			
			
			m.setMembershipIssuance(DateOperator.stringToDate(tempDate, tempFormat));
			
		}else {
			
		
			System.out.println("Error.");
		}
		
		
		
		System.out.print("\n===Fecha de expiración de la membresía:");
		System.out.print("\nFormato de la fecha: ");
		tempFormat = sc.nextLine();
		System.out.print("\nFecha: ");
		tempDate = sc.nextLine();
		
        if(DateOperator.isDate(tempDate, tempFormat) == true) {
			
			
			m.setMembershipExpiration(DateOperator.stringToDate(tempDate, tempFormat));
			
		}else {
			
		
			System.out.println("Error.");
		}
		
		
		club.addMember(m);
		
	}
	
	public void showMembers() {
		System.out.print("\n¿Cómo desea ver la imformación?");
		System.out.print("\n1. Como una tabla.");
		System.out.print("\n2. Como una forma.");
		short option = 0;
		
		switch(option) {
		
		case 1:
			club.showMembersAsTable();
			
		case 2:
			club.showMembersAsForm();
			
		default: 
			System.out.println("Opción invalida");
		
		
		}
	
	
}
}
