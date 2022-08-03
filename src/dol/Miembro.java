package dol;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Miembro extends Person{
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
	
	private long numMembresia;
	Calendar c = new GregorianCalendar();
	private Calendar fechaEmision;
	private Calendar fechaVencimiento;
	
	
	

	

	public Miembro(String nombre, Calendar fechaNacimiento, int edad, char genero, long numMembresia, Calendar c,
			Calendar fechaEmision, Calendar fechaVencimiento) {
		super(nombre, fechaNacimiento, edad, genero);
		this.numMembresia = numMembresia;
		this.c = c;
		this.fechaEmision = fechaEmision;
		this.fechaVencimiento = fechaVencimiento;
	}

	public long getNumMembresia() {
		return numMembresia;
	}

	public void setNumMembresia(long numMembresia) {
		this.numMembresia = numMembresia;
	}

	public Calendar getFechaEmision() {
		return fechaEmision;
	}

	public void setFechaEmision(Calendar fechaEmision) {
		this.fechaEmision = fechaEmision;
	}

	public Calendar getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(Calendar fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	@Override
	public String getNombre() {
		return super.getNombre();
	}

	@Override
	public void setNombre(String nombre) {
		super.setNombre(nombre);
	}

	@Override
	public Calendar getFechaNacimiento() {
		return super.getFechaNacimiento();
	}

	@Override
	public void setFechaNacimiento(Calendar fechaNacimiento) {
		super.setFechaNacimiento(fechaNacimiento);
	}

	@Override
	public int getEdad() {
		return super.getEdad();
	}

	@Override
	public void setEdad(int edad) {
		super.setEdad(edad);
	}

	@Override
	public char getGenero() {
		return super.getGenero();
	}

	@Override
	public void setGenero(char genero) {
		super.setGenero(genero);
	}

	@Override
	public String toString() {
		return "Miembro [sdf=" + sdf + ", numMembresia=" + numMembresia + ", fechaEmision=" + fechaEmision
				+ ", fechaVencimiento=" + fechaVencimiento + ", nombre=" + nombre + ", edad=" + edad + ", genero="
				+ genero + "]";
	}
	
	
	
	
	
	

}
	