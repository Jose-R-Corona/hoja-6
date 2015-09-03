/*
Universidad del valle de Guatemala
Jose Corona
Diego de León
Estructura de datos HOJA NO.6
*/

import java.util.AbstractSet;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;

/**
 *
 * @author Admin
 */
public class Factory {
   

   	public  AbstractSet getClase(int entry) {
   		
            if (entry==1) return new HashSet<programador>();
            if (entry==2) return new TreeSet<programador>(new Comparador()); 
            if (entry==3) return new LinkedHashSet<programador>();
            return null;
   }
}
    

