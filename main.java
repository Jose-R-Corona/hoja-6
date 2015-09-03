/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author Admin
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc ; //scanner para leer datos
        Factory nfactory = new Factory(); //creamos el factory para definir la clase
        AbstractSet desarrollador = null; 
        ArrayList conjunto1 = new ArrayList(); //grupo de desarrolladores java, web y celulares
        ArrayList conjunto2 = new ArrayList(); //grupo de desarrolladores java pero sin experiencia web
        ArrayList conjunto3 = new ArrayList(); //grupo de desarrolladores web y celulares pero sin experiencia java
        ArrayList conjunto4 = new ArrayList(); //grupo de desarrolladores con experiencia web o celulares pero no de java
        String nombre="";
        String conjunto;
        boolean [] conjuntos = new boolean [3];
        int cantjava;
        int cantweb;
        int cantcelulares;
        int opcion;
        int opcion2;
        int menu=0;

        System.out.println("Benvenido:");
        
        while (menu==0){    
            sc = new Scanner (System.in); //scanner para leer datos
            System.out.println("Escoja el patron de diseño a implementar");
            System.out.println("    1. HashSet");
            System.out.println("    2. TreeSet");
            System.out.println("    3. LinkedHashSet");
            System.out.print("    Ingrese la opcion: ");
            opcion=0;
            try{opcion=sc.nextInt();} //se guardan los datos en otra variable    
            catch(Exception e){System.out.println("Upps, ha ocurrido un error. La opcion ingresada es invalida, coloque una de las opciones indicadas\n"); opcion=0;}
            
            if (opcion==1 || opcion==2 || opcion==3){ 
                menu=1;
                desarrollador = nfactory.getClase(opcion);
            }
        }
        
        while (menu==1){ 
            sc = new Scanner (System.in); //scanner para leer datos
            System.out.println("\nEscoja una de las opciones siguientes para continuar");
            System.out.println("    1. Ingrear Desarrollador");
            System.out.println("    2. Resultados");
            System.out.println("    3. Salir");
            System.out.print("    Ingrese la opcion: ");
            opcion=0;
            try{opcion=sc.nextInt();} //se guardan los datos en otra variable    
            catch(Exception e){System.out.println("Upps, ha ocurrido un error. La opcion ingresada es invalida, intentelo de nuevo\n");}
            if (opcion==1)menu=2;
            if (opcion==2)menu=3; 
            if (opcion==3)menu=4;
                
        } 

            //ingresamos el nombre y el grupo al que pertenecen
        while (menu==2){ 
            
            sc = new Scanner (System.in); //scanner para leer datos
            System.out.print("\nIngrese el nombre: ");  
            try{nombre=sc.next();} //se guardan los datos en otra variable    
            catch(Exception e){System.out.println("Upps, ha ocurrido un error. La opcion ingresada es invalida, intentelo de nuevo\n");}

            
            sc = new Scanner (System.in); //scanner para leer datos
            System.out.println("\nExperiencia en desarollo de aplicaciones en JAVA: ");
            System.out.println("    1. Si");
            System.out.println("    2. No");
            System.out.print("    Ingrese la opcion: ");
            opcion=0;
            try{opcion=sc.nextInt();} //se guardan los datos en otra variable    
            catch(Exception e){System.out.println("Upps, ha ocurrido un error. La opcion ingresada es invalida, intentelo de nuevo\n");}
            if (opcion==1){ conjuntos[0]=true;}
            else conjuntos[0]=false;

            sc = new Scanner (System.in); //scanner para leer datos
            System.out.println("\nExperiencia en desarollo de aplicaciones WEB: ");
            System.out.println("    1. Si");
            System.out.println("    2. No");
            System.out.print("    Ingrese la opcion: ");
            opcion=0;
            try{opcion=sc.nextInt();} //se guardan los datos en otra variable    
            catch(Exception e){System.out.println("Upps, ha ocurrido un error. La opcion ingresada es invalida, intentelo de nuevo\n");}
            if (opcion==1){ conjuntos[1]=true;}
            else conjuntos[1]=false;

            sc = new Scanner (System.in); //scanner para leer datos
            System.out.println("\nExperiencia en desarollo de aplicaciones en Celulares: ");
            System.out.println("    1. Sí");
            System.out.println("    2. No");
            System.out.print("    Ingrese la opcion: ");
            opcion=0;
            
            
            try{opcion=sc.nextInt();} //se guardan los datos en otra variable    
            catch(Exception e){System.out.println("Upps, ha ocurrido un error. La opcion ingresada es invalida, intentelo de nuevo\n");}
            if (opcion==1){ conjuntos[2]=true;}
            else conjuntos[2]=false;

            Conjuntos programador = new Conjuntos (nombre, conjuntos[0],conjuntos[1], conjuntos[2]);
                
           }
            
        }
    }

   
