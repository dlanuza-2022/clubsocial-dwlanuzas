package main;


import java.util.Scanner;

import dol.Club;
import ui.Menu;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Menu menu = new Menu();
		
		String nombreClub;
		
		System.out.println("======================================================================");
		System.out.println("===Bienvenido al programa de gestión de un club social. Bendiciones===");
		System.out.println("======================================================================");
		
		System.out.println("\n¿Cúal es el nombre de su club?");
		nombreClub = sc.nextLine();
		
		
		
		System.out.println("Menu de gestión del club" + nombreClub);
		
		menu.show();
		
;		
		
		
		
	}

}
