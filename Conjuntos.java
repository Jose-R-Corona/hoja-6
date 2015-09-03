/**
 *Universidad del Valle de Guatemela
 *Jose corona
 *Diego de León
 *estructura de Datos
 */

/**
 *
 * @author Admin
 */
public class Conjuntos {
    private String nombre;
    private boolean [] desarrollador = new boolean[3];
    
    public Conjuntos(String nombre, boolean desarrollador0, boolean desarrollador1, boolean desarrollador2){
        this.nombre = nombre;
        desarrollador[0]= desarrollador0;         //Java
        desarrollador[1]= desarrollador1;         //Web
        desarrollador[2]= desarrollador2;         //Celulares
    }
    
    public boolean getDesarrollador (int x){
        if (x==0) return desarrollador[0];
        if (x==1) return desarrollador[1];
        if (x==2) return desarrollador[2];
        return false;
    }
    
    public String getNombre(){
        return nombre;
    }
    
}
