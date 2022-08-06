package dal;

import java.util.ArrayList;
import dol.Empleado;

public class LibretaEmpleados {
	
	
	
	ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();
	
  
    
    public void imprimirLista() {
    	
    	System.out.println(listaEmpleados);
    	
    }
    
	    
	    public void addEmpleado(Empleado e) {
	    	
	    	listaEmpleados.add(e);
	    	
	    }

	

}
