package examenprog;

import java.util.Scanner;


public class Examenprog {
   //Creamos variables estaticas para definir la longitud de nuestro array
	public static final int num_ciclistas = 15;
	public static final int num_etapas = 5;
  	
	//Creamos los arrays
	public static void main(final String[] vuelta) {
		
	    final int[] dorsales = new int [15];
		final String[] ciclistas = new String[15];
		final int[][]  tiempos = new int [15][5];
		boolean creado = false;
		boolean finalizado = true;
		
		for(int i = 1; i < ciclistas.length; ++i) { 	
		}
	//Hacemos que muestre el menu mientras que no se seleccione la opcion de finalizar	
		do {
			final int menu = opciones();
			switch (menu) {
			case 1: {
			    generartiempo(tiempos); 
				creado = true;
				continue;
			}
			case 2: 
			case 3:
			case 4:
			case 5:
			
			case 6: {
				finalizado = false;
				continue;		
			}
			
			
		
			default: {
				System.out.println("La opcion introducida no es valida");
				
			}
			
		
	    while (finalizado);
	    System.out.println("Ha finalizado");
			
		}
	//Creamos las opciones del menu
	    	
      public static int opciones() {
    	  System.out.println("Menu de opciones");
    	  System.out.println("****************");
    	  System.out.println("1) Genera los tiempos y dorsales");
    	  System.out.println("2) Muestra el ganador de la vuelta");
    	  System.out.println("3) Muestra el ganador de una etapa");
    	  System.out.println("4) Muestra el ganador de cada etapa");
    	  System.out.println("5) Muestra la tabla de tiempos");
          System.out.println("6) Finalizar");
          final Scanner s = new Scanner(System.in);
          System.out.println("Introduce una opción");
          final int nextInt = s.nextInt();
          return nextInt;
        		  
	    }
          
   // Creamos las funciones que necesitemos para agilizar el trabajo
          
         public static void generartiempo(final int[][]tiempos) {
        	  for (int i = 0; i < 15; ++i ) {
        		   for(int j = 0; j < 5; ++j) {
        		tiempos[i][j] = 1 + (int)(Math.random()*10000.0);
        	 }	 
          }
      }       
   }   
        	 
        	 
         
          
          
        
