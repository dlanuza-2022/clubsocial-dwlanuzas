package main;


import java.util.Scanner;

import bll.Application;
import dol.Club;
import ui.Menu;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Menu menu = new Menu();
		
		
		
		System.out.println("======================================================================");
		System.out.println("===Bienvenido al programa de gestión de un club social. Bendiciones===");
		System.out.println("======================================================================");
		
		do {
			System.out.println("\n¿Cúal es el nombre de su club?");
			Application.socialClub.setName(sc.next());
			
			
		}while(Application.socialClub.getName()==null || Application.socialClub.getName()=="");
		
		
		menu.show();
		
		
		
		
;		
		
		
		
	}

}
