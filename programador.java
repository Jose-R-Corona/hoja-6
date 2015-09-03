/*
Universidad del valle de Guatemala
Jose Corona
Diego de León
Estructura de datos HOJA NO.6
*/

/**
 *
 * @author Admin
 */
public class programador {
    // se crea la variable y el arraylist
    private String nombre;
    private boolean [] desarrollador = new boolean[3];
    
    public programador(String nombre, boolean desarrollador0, boolean desarrollador1, boolean desarrollador2){
        this.nombre = nombre;
        desarrollador[0]= desarrollador0;         // desarrolladores Java
        desarrollador[1]= desarrollador1;         // desarrolladoresWeb
        desarrollador[2]= desarrollador2;         // desarrolladoresCelulares
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

