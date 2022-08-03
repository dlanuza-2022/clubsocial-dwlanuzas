package dol;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado extends Person{
	
	private long numEmpleado;
	private Calendar fechaIngreso = new GregorianCalendar();
	private String puesto;
	
	

	


	public Empleado(String nombre, Calendar fechaNacimiento, int edad, char genero, long numEmpleado,
			Calendar fechaIngreso, String puesto) {
		super(nombre, fechaNacimiento, edad, genero);
		this.numEmpleado = numEmpleado;
		this.fechaIngreso = fechaIngreso;
		this.puesto = puesto;
	}


	public long getNumEmpleado() {
		return numEmpleado;
	}


	public void setNumEmpleado(long numEmpleado) {
		this.numEmpleado = numEmpleado;
	}


	public Calendar getFechaIngreso() {
		return fechaIngreso;
	}


	public void setFechaIngreso(Calendar fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}


	public String getPuesto() {
		return puesto;
	}


	public void setPuesto(String puesto) {
		this.puesto = puesto;
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
		// TODO Auto-generated method stub
		return super.getEdad();
	}


	@Override
	public void setEdad(int edad) {
		// TODO Auto-generated method stub
		super.setEdad(edad);
	}


	@Override
	public char getGenero() {
		// TODO Auto-generated method stub
		return super.getGenero();
	}


	@Override
	public void setGenero(char genero) {
		// TODO Auto-generated method stub
		super.setGenero(genero);
	}


	@Override
	public String toString() {
		return "Empleado [numEmpleado=" + numEmpleado + ", fechaIngreso=" + fechaIngreso + ", puesto=" + puesto
				+ ", nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + "]";
	}
	
	
	
	
	
	

}
