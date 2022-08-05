package dol;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public abstract class Person {
	
	protected String nombre;
	protected int edad;
	protected char genero;
	private String fechaNacimiento;
	
	
	
	
	public Person(String nombre, String fechaNacimiento, int edad, char genero) {
		super();
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.edad = edad;
		this.genero = genero;
	}
	
	
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}



	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

	
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}



	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}



	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public char getGenero() {
		return genero;
	}
	
	public void setGenero(char genero) {
		this.genero = genero;
	}
	
	
	
	
	
	

}
