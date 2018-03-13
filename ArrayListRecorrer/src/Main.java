import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
	
	    ArrayList<String> a = new ArrayList<String>();//<-- Declaro e inicializo objeto
	
	    a.add("Elo");//<-- Con el método add -> añade un elemento al final de la lista.
	    a.add("María Jose");//<-- Con el método add -> añade un elemento al final de la lista.
	    a.add("Laura");//<-- Con el método add -> añade un elemento al final de la lista.
	    a.add("Victor Martín");//<-- Con el método add -> añade un elemento al final de la lista.
	    a.add("Sonia");//<-- Con el método add -> añade un elemento al final de la lista.
	    
	    System.out.println(" Contenido de la lista es : ");
	    
	    int numeroElementosArray = a.size();//<-- Método de la class ArrayList -> Devuelve número de elementos del array.
	    
//<----- For	        
	    	for(int i = 0; i < numeroElementosArray; i++) {
	    		String posicionElementoArray = a.get(i);//<-- Método de la class ArrayList ->Devuelve el elemento de la posición indicada.
	            System.out.println( " Resultado con un For => " + posicionElementoArray );
	            //Al devolver el elemento, devuelve un string ejemplo "Victor Martín"
	        }
	    	
	    	
System.out.println(" -----------------------------------------------------------------------------------------------------------");

	    	
//<------ Foreach
	    	for(String color: a) {
	            System.out.println( " Resultado con un Foreach => " + color);
	        }
	    	
	    }
}


