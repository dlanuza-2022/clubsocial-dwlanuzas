package ui;

import java.util.Scanner;

import dol.Employee;
import dol.Club;
import misc.DateOperator;

public class EmployeeMenu implements IMenu {
	Scanner sc = new Scanner(System.in);
	Menu menu = new Menu();
	private String ddMMyyyy;
	Employee e = new Employee(" ", " ", " ", " ", " ", DateOperator.stringToDate("24121999", ddMMyyyy), " ", DateOperator.stringToDate("24121999", ddMMyyyy), " ");
	Club club = new Club(" ");
	
	
	
	@Override
	public void displayOptions() {
		System.out.println("Gestión de empleados:");
		System.out.println("1. Agregar nuevo empleado.");
		System.out.println("2. Mostrar lista de empleados.");
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
					
					addEmployee();
					
					break;
				case 2:
					
					showEmployees();
					
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
	
	public void addEmployee() {
		
		System.out.println("===Agregar nuevo empleado.===");
		System.out.print("\n-Número de empleado: ");
		e.setEmployeeNumber(sc.nextLine());
		
		System.out.print("\n-Nombre de empleado: ");
		System.out.print("\n-Primer nombre: ");
		e.setFirstName(sc.nextLine());
		
		System.out.print("\n-Segundo nombre: ");
		e.setMiddleName(sc.nextLine());
		
		System.out.print("\n-Primer apellido: ");
		e.setSurName(sc.nextLine());
		
		System.out.print("\n-Segundo Apellido: ");
		e.setSecondSurname(sc.nextLine());
		
		System.out.print("\n-Sexo del empleado: ");
		e.setGender(sc.nextLine());
		
		System.out.print("\n===Fecha de nacimiento===");
		System.out.print("\n-Formato de fecha: ");
		String tempFormat = sc.nextLine();
		System.out.print("\n-Fecha: ");
		String tempFecha = sc.nextLine();
		
		
		if(DateOperator.isDate(tempFecha, tempFormat) == true) {
			
			
			e.setBirthDate(DateOperator.stringToDate(tempFecha, tempFormat));
			
			
		}else {
			System.out.println("Error.");
		}
		
		
		System.out.print("\n-Trabajo: ");
		e.setJob(sc.nextLine());
		
		System.out.print("\n===Fecha de entrada===");
		System.out.print("\n-Formato de fecha: ");
		tempFormat = sc.nextLine();
		System.out.print("\n-Fecha: ");
		tempFecha = sc.nextLine();
		
		
        if(DateOperator.isDate(tempFecha, tempFormat) == true) {
			
			
			e.setEntryDate(DateOperator.stringToDate(tempFecha, tempFormat));
			
			
		}else {
			System.out.println("Error.");
		}
		
		
		
		
		club.addEmployee(e);
		
	}
	
	public void showEmployees() {
		System.out.print("\n¿Cómo desea ver la imformación?");
		System.out.print("\n1. Como una tabla.");
		System.out.print("\n2. Como una forma.");
		short option = 0;
		
		switch(option) {
		
		case 1:
			club.showEmployeesAsTable();
		case 2:
			club.showEmployeesAsForm();
			
		default: 
			System.out.println("Opción invalida");
		
		
		}
		
		
	}
	
	

}
