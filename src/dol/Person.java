package dol;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public abstract class Person {
	
	protected String nombre;
	private Calendar c = new GregorianCalendar();
	protected int edad;
	protected char genero;
	private Calendar fechaNacimiento;
	
	
	
	
	public Person(String nombre, Calendar fechaNacimiento, int edad, char genero) {
		super();
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.edad = edad;
		this.genero = genero;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Calendar getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	public void setFechaNacimiento(Calendar fechaNacimiento) {
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
