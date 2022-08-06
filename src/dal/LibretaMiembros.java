package dal;

import java.util.ArrayList;
import dol.Miembro;

public class LibretaMiembros {
	
 
    
	ArrayList<Miembro> listaMiembros = new ArrayList<Miembro>();
    
   
    public void imprimirLista() {
    	
    	System.out.println(listaMiembros);
    	
    }
    
   
    
    
    public void addMiembro(Miembro m) {
    	
    	listaMiembros.add(m);
    	
    }


	
    
    



	

}
