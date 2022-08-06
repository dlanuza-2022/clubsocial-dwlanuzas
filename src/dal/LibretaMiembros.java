package dal;

import java.util.LinkedList;


import dol.Miembro;
import ui.Interfaz;

public class LibretaMiembros {
	
 
    
    LinkedList<Miembro> listaMiembros = new LinkedList<Miembro>();
    
   
    
    
    public LinkedList<Miembro> getLista2(){
    	return listaMiembros;
    }
    
    
    public void setLista2(LinkedList<Miembro> listaMiembros) {
    	this.listaMiembros = listaMiembros;
    	
    }
    
    
	public boolean add(Miembro e) {
		
		return true;
	}
	
	

	@Override
	public String toString() {
		return "LibretaMiembros [listaMiembros=" + listaMiembros + "]";
	}
	
	

}
