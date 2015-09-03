
//importamos la clase comparator
import java.util.Comparator;
	public class Comparador implements Comparator<programador>{
	    //compara los nombres para crear un orden alfabetico
	    public int compare(programador primero, programador segundo){
	        return primero.getNombre().compareTo(segundo.getNombre());
	    }
}