package ui;


import java.util.Scanner;

public class Menu implements IMenu {
	
	Scanner sc = new Scanner(System.in);
	MemberMenu memberMenu = new MemberMenu();
	EmployeeMenu employeeMenu = new EmployeeMenu();
	
	
	@Override
	public void displayOptions() {			
			System.out.println("Gestión de club social");
			System.out.println("1. Empleados");
			System.out.println("2. Miembros");
			System.out.println("3. Salir");
			
	}
	
	

	@Override
	public void show() {
		short option = 0;
		do {
			System.out.println();
			displayOptions();
			System.out.println();
			option = sc.nextShort();
			switch (option) {
				case 1:
					System.out.println("Aqui se mostrara el menu ");
					employeeMenu.show();
					break;
				case 2:
					System.out.println("Aqui se mostrara el menu de miembros:");
					memberMenu.show();
					break;
				case 3:
					System.out.println("Gracias por utilizar este programa. Bendiciones.");
					System.exit(0);
					break;
				default:
					System.out.println("Opción no válida.");
					break;
			}
			
		}while(option!=3);
		
	}

}
