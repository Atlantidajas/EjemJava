import java.util.ArrayList;//<--  Es necesario importar la clase ArrayList para poder crear objetos de esta clase
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		    
        // Declaro e inicializo el un objeto de tipo ArrayList
        ArrayList<String> a = new ArrayList<String>();
        
        
//size() -> Devuelve el tamaño (número de elementos) de la lista..
        System.out.println(" El número de elementos es => " + a.size());
        
        
//add(elemento) ->	Añade un elemento al final de la lista.
        a.add("Rojo");//<-- Posición 0
        a.add("Naranja");//<-- Posición 1
        a.add("Verde");//<-- Posición 2
        
        
//get(indice) -> Devuelve el elemento de la posición que se indica entre paréntesis.
        int posicionIndiceArrayList = 2;
        System.out.println(" El elemento que hay dentro de la posición " + posicionIndiceArrayList + " es => " + a.get( posicionIndiceArrayList ) );
        
        
//contains(elemento) -> Devuelve true si la lista contiene el elemento que se especifica y false en caso contrario.
        String valorBuscadoArray = "Rojo";
        if (a.contains( valorBuscadoArray )) {
        	System.out.println( " El color " + valorBuscadoArray + " si está dentro de los valores del arrayList" );
        }else {
        	System.out.println( " El color " + valorBuscadoArray + " no está dentro de los valores del arrayList " );
        }
        
        
 //remove(valor - ó - indice) -> Elimina el elemento con valor determinado.
        String valorBuscadoBorrarArray = "Rojo";
        a.remove(valorBuscadoBorrarArray);
        System.out.println(" El valor buscado => " + valorBuscadoBorrarArray + " fue borrado ");
        
        
 //set(indice, elemento) -> Machaca el elemento que se encuentra en una determinada posición con el elemento que se pasa como parámetro.
        a.set(1, "Turquesa");
        System.out.println(" Nuevo contenido en indice 1 despues de ser machacado es el introducido ");
        System.out.println(a.get(1));//<-- Aquí muestro como ahora el index 1 pasa a ser turquesa
        
        
//isEmpty() -> Devuelve true si la lista está vacía y false en caso de tener algún elemento.
        if(a.isEmpty()) {
        	System.out.println(" La lista está vacía ");
        }
        else {
        	System.out.println(" La lista aún contiene elementos en su interior ");
        }
        
//toArray()	-> Devuelve un array con todos y cada uno de los elementos que contiene la lista.
        a.toArray(); //<-- Pendiente de ver funcionamiento de este método.
     
 
        
//indexOf(elemento) -> Devuelve la posición de la primera ocurrencia del elemento que se indica entre paréntesis.
        //int posicion = a.indexOf(o); //<-- Pendiente de ver funcionamiento de este método.
        //System.out.println(posicion);
 
//Collections.sort(lista) -> os elementos de una lista se pueden ordenar con el método sort. El formato es el siguiente:
        Collections.sort(a);
        System.out.println(a.get(0));//<-- El resultado será el valor más próximo a la primera letra del abcedario.
        
//clear() -> Elimina todos los elementos pero no borra la lista.
        a.clear();
        
        
    }

	
}
