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
	
	static Calendar c = new GregorianCalendar();
	
	static LibretaEmpleados libroEmpleados = new LibretaEmpleados();
	static LibretaMiembros libroMiembros = new LibretaMiembros();
	
	public static void lectura() {
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
			
			break;
		default:
			System.out.println("Opción inválida.");
		    break;	
		
		}
		
		
	}
	
	private static void agregarEmpleado() {
		
		System.out.println("Agregar un nuevo empleado.");
		System.out.println("Por favor, ingrese la informacion del empleado:");
		Empleado e = new Empleado();
	    System.out.println("Nombre del empleado:");
	    e.setNombre(leer.nextLine());
	    		
		System.out.println("Fecha de nacimiento:");
		System.out.println("Dia: ");
		int tempDay = leer.nextInt();
		System.out.println("Mes: "
				+ "1. Enero         2. Febrero"
				+ "3. Marzo         4. Abril "
				+ "5. Mayo          6. Junio"
				+ "7. Julio         8. Agosto"
				+ "9. Semptiembre  10. Octubte"
				+ "11. Noviembre   12. Diciembre" );
		int tempMonth = leer.nextInt();
		System.out.println("Año");
		int tempYear = leer.nextInt();
		
        String tempString = Integer.toString(tempDay) + '/' + Integer.toString(tempMonth) + '/' + Integer.toBinaryString(tempYear);
		
		e.setFechaNacimiento(tempString);
		
		
		System.out.println("Edad: ");
		e.setEdad(leer.nextInt());
		


		//Peticion de gen.
		boolean salir = false;
		do{
			
			System.out.println("Genero: ");
			System.out.println("1. H.");
			System.out.println("2. M.");
		    int op = leer.nextInt();
		    switch(op) {
		    case 1:
		    	e.setGenero('H');
		    	salir = true;
		    	break;
		    case 2: 
		    	e.setGenero('M');
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
		e.setNumEmpleado(leer.nextLong());
		
		System.out.println("Fecha de ingreso.");
		System.out.println("Dia: ");
		tempDay = leer.nextInt();
		System.out.println("Mes: "
				+ "1. Enero         2. Febrero"
				+ "3. Marzo         4. Abril "
				+ "5. Mayo          6. Junio"
				+ "7. Julio         8. Agosto"
				+ "9. Semptiembre  10. Octubte"
				+ "11. Noviembre   12. Diciembre" );
		tempMonth = leer.nextInt();
		System.out.println("Año");
		tempYear = leer.nextInt();
        
		
		tempString = Integer.toString(tempDay) + '/' + Integer.toString(tempMonth) + '/' + Integer.toBinaryString(tempYear);
		
		e.setFechaIngreso(tempString);
		
		
		/*Si se modifica el tipo de institucion, favor de agregar
		 * diferentes puestos de trabajo, mediante un menu y un
		 * metodo switch.
		 * 
		 */
		System.out.println("Puesto de trabajo.");
		e.setPuesto(leer.nextLine());
		
		
		//Control errores.
		if(libroEmpleados.add(e) == true) {
			System.out.println("Los datos de su empleado han sido guardados correctamente.");
		
		}else {
			System.out.println("Hubo un error ingresado los datos.");
			imprimirMenuEmpleados();
			
		}
		
	}
		
	private static void mostrarEmpleados() {
		
		System.out.println(libroEmpleados);
		imprimirMenu();
		
		
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
			
			break;
		default:
			System.out.println("Opción inválida.");
		    break;	
		
		}
		
		
	}
	
	private static void agregarMiembro() {
		
		System.out.println("Agregar un nuevo miembro.");
		System.out.println("Por favor, ingrese la informacion del miembro:");
		Miembro m = new Miembro();
	    System.out.println("Nombre del miembro:");
	    m.setNombre(leer.nextLine());
	    		
		System.out.println("Fecha de nacimiento:");
		System.out.println("Dia: ");
		int tempDay = leer.nextInt();
		System.out.println("Mes: "
				+ "1. Enero         2. Febrero"
				+ "3. Marzo         4. Abril "
				+ "5. Mayo          6. Junio"
				+ "7. Julio         8. Agosto"
				+ "9. Semptiembre  10. Octubte"
				+ "11. Noviembre   12. Diciembre" );
		int tempMonth = leer.nextInt();
		System.out.println("Año");
		int tempYear = leer.nextInt();
		
		String tempString = Integer.toString(tempDay) + '/' + Integer.toString(tempMonth) + '/' + Integer.toBinaryString(tempYear);
		
		m.setFechaNacimiento(tempString);
		
		System.out.println("Edad: ");
		m.setEdad(leer.nextInt());
		


		//Peticion de gen.
		boolean salir = false;
		do{
			
			System.out.println("Genero: ");
			System.out.println("1. H.");
			System.out.println("2. M.");
		    int op = leer.nextInt();
		    switch(op) {
		    case 1:
		    	m.setGenero('H');
		    	salir = true;
		    	break;
		    case 2: 
		    	m.setGenero('M');
		    	salir = true;
		    	break;
		    default:
		    	System.out.println("Opcion invalida.");
		    	break;
		    
		    }
			
		}while(salir == false);
		
		System.out.println("Numero de membresia: ");
		m.setNumMembresia(leer.nextLong());
		
		System.out.println("Fecha de emision de la membresia: ");
		System.out.println("Dia: ");
		tempDay = leer.nextInt();
		
		
		
		System.out.println("Mes: "
					+ "1. Enero         2. Febrero"
					+ "3. Marzo         4. Abril "
					+ "5. Mayo          6. Junio"
					+ "7. Julio         8. Agosto"
					+ "9. Semptiembre  10. Octubte"
					+ "11. Noviembre   12. Diciembre" );
		tempMonth = leer.nextInt();
			
		System.out.println("Año");
		tempYear = leer.nextInt();
		
		tempString = Integer.toString(tempDay) + '/' + Integer.toString(tempMonth) + '/' + Integer.toBinaryString(tempYear);
		
		m.setFechaEmision(tempString);
		
		
		
		//La fecha de vencimiento debe ser 2 años posteriores a la emision.
		tempYear = tempYear + 2;
		
		tempString = Integer.toString(tempDay) + '/' + Integer.toString(tempMonth) + '/' + Integer.toBinaryString(tempYear);
		
		m.setFechaVencimiento(tempString);
		
		
		//Control de errors.
		if(libroMiembros.add(m) == true) {
			System.out.println("Los datos de su empleado han sido guardados correctamente.");
		
		}else {
			System.out.println("Hubo un error ingresado los datos.");
			imprimirMenuMiembros();
			
		}
	}
		
	private static void mostrarMiembros() {
		
		System.out.println(libroMiembros);
		imprimirMenu();
			
			
	}
	
	
	
	
	
	
	
	//Final
	private static void salir() {
		
		System.out.println("Usted ha finalizado la ejecución del programa.");
		System.out.println("Gracias por preferirnos. Buen día, bendiciones.");
		System.exit(0);
	}
	

}
