/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
   		
            if (entry==1) return new HashSet<Conjuntos>();
            if (entry==2) return new TreeSet<Conjuntos>(); 
            if (entry==3) return new LinkedHashSet<Conjuntos>();
            return null;
   }
}
    
