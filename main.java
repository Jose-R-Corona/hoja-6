/*
Universidad del valle de Guatemala
Jose Corona
Diego de León
Estructura de datos HOJA NO.6
*/

import java.util.Scanner;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
public class main {

    public static void main(String[] args) {
        Scanner sc ; //scanner para leer datos
        Factory nfactory = new Factory(); //creamos el factory para definir la clase
        AbstractSet desarrollador = null; 
        ArrayList conjunto1 = new ArrayList(); //desarrolladores java, web y celulares
        ArrayList conjunto2 = new ArrayList(); //desarrolladores java pero sin experiencia web
        ArrayList conjunto3 = new ArrayList(); //desarrolladores web y celulares pero sin  java
        ArrayList conjunto4 = new ArrayList(); //desarrolladores web o celulares pero no de java
        ArrayList conjunto5 = new ArrayList(); //desarrolladores java
        ArrayList conjunto6 = new ArrayList(); //desarrolladores web
        ArrayList conjunto7 = new ArrayList(); //desarrolladores celulares
        ArrayList conjunto8 = new ArrayList(); //desarrolladores conjuntomayor
        HashSet myHashSet = new HashSet();
        HashSet HashSetJava = new HashSet();
        HashSet HashSetWeb = new HashSet();
        HashSet HashSetCel = new HashSet();
        TreeSet myTreeSet = new TreeSet();
        Iterator<programador> iter_java;       //Se colocan 4 iteradores para extraer los cuatro datos de la tabla set
        Iterator<programador> iter_web;
        Iterator<programador> iter_celular;
        Iterator<programador> iter_nombre;
        String nombre="";
        String mensaje="No";
        String mensaje2="";       
        boolean [] conjuntos = new boolean [3];
        int num_java=0;
        int num_web=0;
        int num_celulares=0;
        int contador=0;
        boolean java=false;
        boolean web=false;
        boolean celular=false;
        int opcion;
        int menu=0;
        System.out.println(" ----------");
        System.out.println("|Bienvenido|");
        System.out.println(" ----------");
        
        while (menu==0){    
            sc = new Scanner (System.in); //scanner para leer datos
            System.out.println("Escoja el patron de diseño a implementar");
            System.out.println("    1. HashSet");
            System.out.println("    2. TreeSet");
            System.out.println("    3. LinkedHashSet");
            System.out.print("    Ingrese la opcion: ");
            opcion=0;
            try{opcion=sc.nextInt();} //se guardan los datos en otra variable    
            catch(Exception e){System.out.println("Upps, ha ocurrido un error. La opcion ingresada es invalida, intentelo de nuevo\n"); opcion=0;}
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
            //ingresamos el nombre y el grupo al que pertenecen
            
            if (menu==2){ 
                System.out.println("===================================================================================");
                sc = new Scanner (System.in); //scanner para leer datos
                System.out.print("\n    Ingrese el nombre: ");  
                try{nombre=sc.next();} //se guardan los datos en otra variable    
                catch(Exception e){System.out.println("Upps, ha ocurrido un error. La opcion ingresada es invalida, intentelo de nuevo\n");}
                menu=5;

                while (menu==5){
                    sc = new Scanner (System.in); //scanner para leer datos
                    System.out.println("\n    Experiencia en desarollo de aplicaciones en JAVA: ");
                    System.out.println("            1. Si");
                    System.out.println("            2. No");
                    System.out.print("            Ingrese la opcion(1 o 2): ");
                    opcion=0;
                    try{opcion=sc.nextInt();} //se guardan los datos en otra variable    
                    catch(Exception e){System.out.println("Upps, ha ocurrido un error. La opcion ingresada es invalida, intentelo de nuevo\n");}
                    if (opcion==1){ conjuntos[0]=true;}
                    else conjuntos[0]=false;
                    if (opcion==1 || opcion==2)menu=6;
                }
                while(menu==6){
                    sc = new Scanner (System.in); //scanner para leer datos
                    System.out.println("\n    Experiencia en desarollo de aplicaciones WEB: ");
                    System.out.println("            1. Si");
                    System.out.println("            2. No");
                    System.out.print("            Ingrese la opcion(1 o 2): ");
                    opcion=0;
                    try{opcion=sc.nextInt();} //se guardan los datos en otra variable    
                    catch(Exception e){System.out.println("Upps, ha ocurrido un error. La opcion ingresada es invalida, intentelo de nuevo\n");}
                    if (opcion==1){ conjuntos[1]=true;}
                    else conjuntos[1]=false;
                    if (opcion==1 || opcion==2)menu=7;
                }
                while(menu==7){
                    sc = new Scanner (System.in); //scanner para leer datos
                    System.out.println("\n    Experiencia en desarollo de aplicaciones en Celulares: ");
                    System.out.println("            1. Si");
                    System.out.println("            2. No");
                    System.out.print("            Ingrese la opcion(1 o 2): ");
                    opcion=0;
                    try{opcion=sc.nextInt();} //se guardan los datos en otra variable    
                    catch(Exception e){System.out.println("Upps, ha ocurrido un error. La opcion ingresada es invalida, intentelo de nuevo\n");}
                    if (opcion==1){ conjuntos[2]=true;}
                    else conjuntos[2]=false;
                    if (opcion==1 || opcion==2)menu=8;
                }
                //Se crea un objeto programador y se almacena en la tabla set desarrollador
                programador programador = new programador (nombre, conjuntos[0],conjuntos[1], conjuntos[2]);
                desarrollador.add(programador);
                menu=1;
                System.out.println("===================================================================================");
            }
            
            if (menu==3){
                //Cantidad de desarrolladores por grupo
                num_java=0;
                num_web=0;
                num_celulares=0;
                contador=0;
                mensaje2="";
                //Se utilizan iteradores para recorrer la tabla set, en este caso la tabla se llama desarrollador
                iter_java = desarrollador.iterator();       //Se colocan 4 iteradores para extraer los cuatro datos
                iter_web= desarrollador.iterator();
                iter_celular= desarrollador.iterator();
                iter_nombre= desarrollador.iterator();

                //recorremos el set
                while (iter_nombre.hasNext()) {
                    //extraemos los valores
                    nombre = iter_nombre.next().getNombre();
                    java = iter_java.next().getDesarrollador(0);
                    web = iter_web.next().getDesarrollador(1);
                    celular = iter_celular.next().getDesarrollador(2);

                    //incrementamos los contadores de cada grupo
                    if (java==true){ num_java += 1; }
                    if (web==true){ num_web += 1; }
                    if (celular==true){ num_celulares += 1; }

                    //Clasificaciones segun experiencia
                    if (java==true  && web==true && celular==true){ conjunto1.add(nombre); }        //Preugunta 1
                    if (java==true && web==false ){ conjunto2.add(nombre); }                        //Preugunta 2
                    if (java==false && web==true && celular==true){ conjunto3.add(nombre); }        //Preugunta 3
                    if (java==false && (web==true || celular==true)){ conjunto4.add(nombre); }      //Preugunta 4

                    
                    if (java==true && web==false )contador+=1;                                      //Preugunta 5
                    if (contador != 0){mensaje="No";}else{mensaje="Si";}
                    
                    
                    //Conjuntos separados
                    if (java==true) {HashSetJava.add(nombre);}                                          //Pregunta6
                    if (web==true) {HashSetWeb.add(nombre);}
                    if (celular==true){HashSetCel.add(nombre);}
                }
                
                if ((num_java>num_web && num_java>num_celulares)||(num_java>num_web && num_java>num_celulares)){ //La cantidad de programadores java es mayor
                    myHashSet.addAll(HashSetJava); mensaje2="JAVA. Lo manejan: "; myTreeSet.addAll(HashSetJava);
                }
                if ((num_web>num_java && num_web>num_celulares)||(num_web>num_java && num_web>num_celulares)){ //La cantidad de programadores web es mayor
                    myHashSet.addAll(HashSetWeb); mensaje2="WEB. Lo manejan: "; myTreeSet.addAll(HashSetWeb);
                }
                if ((num_celulares>num_web && num_celulares>num_java)||(num_celulares>num_web && num_celulares>num_java)){ //La cantidad de programadores celular es mayor
                    myHashSet.addAll(HashSetCel); mensaje2="CELULARES. Lo manejan: ";myTreeSet.addAll(HashSetCel);
                }
                if (num_celulares==num_web && num_celulares==num_java) mensaje="Todos los lenguajes tienen la misma cantida de desarrolladores";
                if (num_celulares==num_web) mensaje="El grupo web y de celulares tiene la misma cantidad de integrantes";
                if( num_celulares==num_java)mensaje="El grupo java y de celulares tiene la misma cantidad de integrantes";
                
                menu=1;
                //imprimimos las cantidades de cada grupo
                System.out.println("===================================================================================");
                System.out.println("Conjuntos: ");
                System.out.println("    Java: "+HashSetJava);
                System.out.println("    Web: "+HashSetWeb);
                System.out.println("    Cel: "+HashSetCel);
                System.out.println("===================================================================================");
                System.out.println("Desarrolladores con experiencia en JAVA, WEB, CELULARES: ");
                System.out.println(conjunto1);
                System.out.println("Desarrolladores con experiencia en JAVA y no en WEB: ");
                System.out.println(conjunto2);
                System.out.println("Desarrolladores con experiencia WEB y CELULARES, sin JAVA: ");
                System.out.println(conjunto3);
                System.out.println("Desarrolladores con experiencia WEB o CELULARES, sin JAVA: ");
                System.out.println(conjunto4);
                System.out.println("Los Desarrolladores con experiencia JAVA "+mensaje+" son un subconjunto de los Web");
                System.out.println("El lenguaje mas utilizado por los desarrolladores es: "+mensaje2);
                System.out.println(myHashSet);
                System.out.println("Lo manejan (orden alfabetico)");
                System.out.println(myTreeSet);
                System.out.println("===================================================================================");
                
                //Se borran los grupos 
                conjunto1.clear();
                conjunto2.clear();
                conjunto3.clear();
                conjunto4.clear();
                myHashSet.clear();
                HashSetJava.clear();
                HashSetWeb.clear();
                HashSetCel.clear();
                myTreeSet.clear();
                
                
            }
        }      
    }
}

   
