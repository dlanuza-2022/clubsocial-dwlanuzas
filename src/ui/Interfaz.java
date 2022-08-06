package ui;


import java.util.Scanner;
import dol.Empleado;
import dol.Miembro;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import dal.LibretaEmpleados;
import dal.LibretaMiembros;

public class Interfaz {
	
	static Scanner leer = new Scanner(System.in);
	
	static LibretaEmpleados libroEmpleados = new LibretaEmpleados();
	static LibretaMiembros libroMiembros = new LibretaMiembros();
	
	public void lectura() {
		System.out.println("Bienvenido.");
		
		imprimirMenu();
		
	}
	
	
	private static void imprimirMenu() {
		
		
		System.out.println("Por favor, escoja una de las siguientes opciones.");
		System.out.println("Para acceder a la opción, escriba el número correspondiente.");
		System.out.println("1. Empleados.");
		System.out.println("2. Miembros.");
		System.out.println("3. Salir.");
		
		int op = leer.nextInt();
		
		switch(op) {
		
		case 1:
			imprimirMenuEmpleados();
			break;
		case 2:
			imprimirMenuMiembros();
			break;
		case 3:
			salir();
			break;
		default:
			System.out.println("Opción inválida.");
		    break;	
		
		
		}
		
	}
	
	private static void imprimirMenuEmpleados() {
		System.out.println("Por favor, escoja una de las siguientes opciones.");
		System.out.println("Para acceder a la opción, escriba el número correspondiente.");
		System.out.println("1. Agregar empleado.");
		System.out.println("2. Mostrar lista de empleados.");
		System.out.println("3. Volver.");
		
	int op = leer.nextInt();
		
		switch(op) {
		
		case 1:
			agregarEmpleado();
			break;
		case 2:
			mostrarEmpleados();
			break;
		case 3:
			imprimirMenu();
			break;
		default:
			System.out.println("Opción inválida.");
		    break;	
		
		}
		
		
	}
	
	private static void agregarEmpleado() {
		
		System.out.println("Agregar un nuevo empleado.");
		System.out.println("Por favor, ingrese la informacion del empleado:");
		
	    System.out.println("Nombre del empleado:");
	    String tempNombre = leer.nextLine();
	    leer.nextLine();
	    
		System.out.println("Fecha de nacimiento:");
			
		System.out.println("Dia: ");
		int tempDay = leer.nextInt();
		leer.nextLine();
		
		System.out.println("Mes: "
				+ "\n1. Enero         2. Febrero"
				+ "\n3. Marzo         4. Abril "
				+ "\n5. Mayo          6. Junio"
				+ "\n7. Julio         8. Agosto"
				+ "\n9. Semptiembre  10. Octubte"
				+ "\n11. Noviembre   12. Diciembre" );
		int tempMonth = leer.nextInt();
		leer.nextLine();
		System.out.println("Año");
		int tempYear = leer.nextInt();
		leer.nextLine();
		
        String tempString = Integer.toString(tempDay) + '/' + Integer.toString(tempMonth) + '/' + Integer.toBinaryString(tempYear);
		
		
		
		
		System.out.println("Edad: ");
		int tempEdad = leer.nextInt();
		leer.nextLine();
		

        char tempSexo = 'H';
		//Peticion de gen.
		boolean salir = false;
		do{
			
			System.out.println("Genero: ");
			System.out.println("Digite 1 o 2.");
			System.out.println("1. H.");
			System.out.println("2. M.");
		    int op = leer.nextInt();
		    switch(op) {
		    case 1:
		    	tempSexo = 'H';
		    	salir = true;
		    	break;
		    case 2: 
		    	tempSexo = 'M';
		    	salir = true;
		    	break;
		    default:
		    	System.out.println("Opcion invalida.");
		    	break;
		    
		    }
			
		}while(salir == false);
		
		/*Posibilidad de personalizar el tipo de empresa
		 * pero si no da tiempo no hacer nada.
		*/
		System.out.println("Numero de empleado.");
		long tempNumEmpleado = leer.nextLong();
		leer.nextLine();
		
		System.out.println("Fecha de ingreso.");
		System.out.println("Dia: ");
		tempDay = leer.nextInt();
		leer.nextLine();
		System.out.println("Mes: "
				+ "\n1. Enero         2. Febrero"
				+ "\n3. Marzo         4. Abril "
				+ "\n5. Mayo          6. Junio"
				+ "\n7. Julio         8. Agosto"
				+ "\n9. Semptiembre  10. Octubte"
				+ "\n11. Noviembre   12. Diciembre" );
		tempMonth = leer.nextInt();
		leer.nextLine();
		System.out.println("Año");
		tempYear = leer.nextInt();
		leer.nextLine();
		
		String tempString2 = Integer.toString(tempDay) + '/' + Integer.toString(tempMonth) + '/' + Integer.toBinaryString(tempYear);
		
	
		
		
		/*Si se modifica el tipo de institucion, favor de agregar
		 * diferentes puestos de trabajo, mediante un menu y un
		 * metodo switch.
		 * 
		 */
		System.out.println("Puesto de trabajo.");
		String tempPuestoTrabajo = leer.nextLine();
		leer.nextLine();
		
		Empleado e = new Empleado(tempNombre, tempString, tempEdad, tempSexo, tempNumEmpleado, tempString2, tempPuestoTrabajo);
		
		libroEmpleados.addEmpleado(e);
		
	    System.out.println("Los datos de su empleado han sido guardados correctamente.");
		
	    imprimirMenuEmpleados();
		
	}
		
	private static void mostrarEmpleados() {
		
		libroEmpleados.imprimirLista();
		
		imprimirMenuEmpleados();
		
		
	}
		
	
	private static void imprimirMenuMiembros() {
		System.out.println("Por favor, escoja una de las siguientes opciones.");
		System.out.println("Para acceder a la opción, escriba el número correspondiente.");
		System.out.println("1. Agregar miembro.");
		System.out.println("2. Mostrar lista de miembros.");
		System.out.println("3. Volver.");
		
	int op = leer.nextInt();
		
		switch(op) {
		
		case 1:
			agregarMiembro();
			break;
		case 2:
			mostrarMiembros();
			
			break;
		case 3:
			imprimirMenu();
			break;
		default:
			System.out.println("Opción inválida.");
		    break;	
		
		}
		
		
	}
	
	private static void agregarMiembro() {
		
		System.out.println("Agregar un nuevo miembro.");
		System.out.println("Por favor, ingrese la informacion del miembro:");
		
	    
		
		System.out.println("Nombre del miembro:");
	    String tempNombre = leer.nextLine();
	    leer.nextLine();
	    		
		System.out.println("Fecha de nacimiento:");
		System.out.println("Dia: ");
        int tempDay = leer.nextInt();
        leer.nextLine();
        
        System.out.println("Mes: "
				+ "\n1. Enero         2. Febrero"
				+ "\n3. Marzo         4. Abril "
				+ "\n5. Mayo          6. Junio"
				+ "\n7. Julio         8. Agosto"
				+ "\n9. Semptiembre  10. Octubte"
				+ "\n11. Noviembre   12. Diciembre" );
		int tempMonth = leer.nextInt();
		leer.nextLine();
		
		System.out.println("Año");
		int tempYear = leer.nextInt();
		leer.nextLine();
		
		
		String tempString = Integer.toString(tempDay) + '/' + Integer.toString(tempMonth) + '/' + Integer.toBinaryString(tempYear);
		
		
		System.out.println("Edad: ");
		int tempEdad = leer.nextInt();
		leer.nextLine();
		
        char tempSexo = 'H';

		
			
			System.out.println("Genero: ");
			System.out.println("Digite 1 o 2.");
			System.out.println("1. H.");
			System.out.println("2. M.");
		    int op = leer.nextInt();
		    switch(op) {
		    case 1:
		    	 tempSexo = 'H';
		    	
		    	break;
		    case 2: 
		    	tempSexo = 'M';
		    	
		    	break;
		    default:
		    	System.out.println("Opcion invalida.");
		    	break;
		    
		    }
		
		
		System.out.println("Numero de membresia: ");
		long tempNumMembresia = leer.nextLong();
		leer.nextLine();
		
		System.out.println("Fecha de emision de la membresia: ");
		System.out.println("Dia: ");
		tempDay = leer.nextInt();
		leer.nextLine();
		
		
		System.out.println("Mes: "
					+ "\n1. Enero         2. Febrero"
					+ "\n3. Marzo         4. Abril "
					+ "\n5. Mayo          6. Junio"
					+ "\n7. Julio         8. Agosto"
					+ "\n9. Semptiembre  10. Octubte"
					+ "\n11. Noviembre   12. Diciembre" );
		tempMonth = leer.nextInt();
		leer.nextLine();
		
		System.out.println("Año");
		tempYear = leer.nextInt();
		leer.nextLine();
		
		String tempString2 = Integer.toString(tempDay) + '/' + Integer.toString(tempMonth) + '/' + Integer.toBinaryString(tempYear);
		
		
		
		
		
		//La fecha de vencimiento debe ser 2 años posteriores a la emision.
		tempYear = tempYear + 2;
		
		String tempString3 = Integer.toString(tempDay) + '/' + Integer.toString(tempMonth) + '/' + Integer.toBinaryString(tempYear);
		
		
		Miembro m = new Miembro(tempNombre, tempString, tempEdad, tempSexo, tempNumMembresia, tempString2, tempString3);
		
		libroMiembros.addMiembro(m);
		
		
	    System.out.println("Los datos de su empleado han sido guardados correctamente.");
		
	    imprimirMenuMiembros();
	    
		
	}
		
	private static void mostrarMiembros() {
		
		libroMiembros.imprimirLista();
		imprimirMenuMiembros();
			
			
	}
	
	
	
	
	
	
	
	//Final
	private static void salir() {
		
		System.out.println("Usted ha finalizado la ejecución del programa.");
		System.out.println("Gracias por preferirnos. Buen día, bendiciones.");
		System.exit(0);
	}
	

}
