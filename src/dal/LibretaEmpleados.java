package dal;

import java.util.LinkedList;

import dol.Empleado;

import ui.Interfaz;

public class LibretaEmpleados {
	
	
	
	LinkedList<Empleado> listaEmpleados = new LinkedList<Empleado>();
	
  
    
    public LinkedList<Empleado> getLista1(){
    	return listaEmpleados;
    }
    
    public void setLista1(LinkedList<Empleado> listaEmpleados) {
    	this.listaEmpleados = listaEmpleados;
    	
    }

	public boolean add(Empleado e) {
		
		return true;
	}

	@Override
	public String toString() {
		return "LibretaEmpleados [listaEmpleados=" + listaEmpleados + "]";
	}
	
	
	

}
