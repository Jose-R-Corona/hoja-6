/**
 *Universidad del Valle de Guatemela
 *Jose corona
 *Diego de León
 *estructura de Datos
 */
//importamos la clase comparator
import java.util.Comparator;
	public class Comparador implements Comparator<Conjuntos>{
	    //compara los nombres para crear un orden alfabetico
	    public int compare(Conjuntos primero, Conjuntos segundo){
	        return primero.getNombre().compareTo(segundo.getNombre());
	    }
}
