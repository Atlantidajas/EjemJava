import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
	
	    ArrayList<String> a = new ArrayList<String>();//<-- Declaro e inicializo objeto
	
	    a.add("Elo");//<-- Con el m�todo add -> a�ade un elemento al final de la lista.
	    a.add("Mar�a Jose");//<-- Con el m�todo add -> a�ade un elemento al final de la lista.
	    a.add("Laura");//<-- Con el m�todo add -> a�ade un elemento al final de la lista.
	    a.add("Victor Mart�n");//<-- Con el m�todo add -> a�ade un elemento al final de la lista.
	    a.add("Sonia");//<-- Con el m�todo add -> a�ade un elemento al final de la lista.
	    
	    System.out.println(" Contenido de la lista es : ");
	    
	    int numeroElementosArray = a.size();//<-- M�todo de la class ArrayList -> Devuelve n�mero de elementos del array.
	    
//<----- For	        
	    	for(int i = 0; i < numeroElementosArray; i++) {
	    		String posicionElementoArray = a.get(i);//<-- M�todo de la class ArrayList ->Devuelve el elemento de la posici�n indicada.
	            System.out.println( " Resultado con un For => " + posicionElementoArray );
	            //Al devolver el elemento, devuelve un string ejemplo "Victor Mart�n"
	        }
	    	
	    	
System.out.println(" -----------------------------------------------------------------------------------------------------------");

	    	
//<------ Foreach
	    	for(String color: a) {
	            System.out.println( " Resultado con un Foreach => " + color);
	        }
	    	
	    }
}


