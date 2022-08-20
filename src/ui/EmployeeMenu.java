package ui;

import java.sql.Date;
import java.util.Scanner;

import dol.Employee;
import dol.Club;
import misc.DateOperator;

public class EmployeeMenu implements IMenu {
	Scanner sc = new Scanner(System.in);
	private String ddMMyyyy;
	Club club = new Club(" ");
	
	
	
	@Override
	public void displayOptions() {
		System.out.println("Gestión de club social > Empleados");
		System.out.println("1. Agregar nuevo empleado.");
		System.out.println("2. Mostrar lista de empleados.");
		System.out.println("3. Volver al menu principal.");
		
	}
	

	@Override
	public void show() {
		displayOptions();
		
		short option = 0;
		Menu menu = new Menu();
		
		do {
			displayOptions();
			option = sc.nextShort();
			switch (option) {
				case 1:
					System.out.println("===Agregar empleado===");
					addEmployee();
					
					break;
				case 2:
					System.out.println("===Informacion de los empleados===");
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
		Employee e = new Employee();
		
		System.out.println("===Agregar nuevo empleado.===");
		
		
		System.out.print("\n-Nombre de empleado: ");
		System.out.print("\n-Primer nombre: ");
		e.setFirstName(sc.next());
		
		System.out.print("\n-Segundo nombre: ");
		e.setMiddleName(sc.next());
		
		System.out.print("\n-Primer apellido: ");
		e.setSurName(sc.next());
		
		System.out.print("\n-Segundo Apellido: ");
		e.setSecondSurname(sc.next());
		
		System.out.print("\n-Sexo del empleado: ");
		e.setGender(sc.next());
		
		//OJO: ¿Porque me pide cast a date?
		Date date = (Date) DateOperator.catchValidDate(sc, "Fecha de nacimiento (dd/MM/yyyy) ");
		e.setBirthDate(date);
		
		System.out.print("\n-Número de empleado: ");
		e.setEmployeeNumber(sc.next());
		
		date = (Date) DateOperator.catchValidDate(sc, "Fecha de entrada (dd/MM/yyyy)");
		e.setEntryDate(date);
		
		System.out.println("Puesto de trabajo: ");
		e.setJob(sc.next());
		
		e.showDataAsRow();
	
		
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
