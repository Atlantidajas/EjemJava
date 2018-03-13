import java.util.Collections;//<--Librería para trabajar con Collections
import java.util.ArrayList;//<-- Librería para trabajar con arrayList

public class Main {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        
        a.add("www");
        a.add("GGG");
        a.add("AAA");
        a.add("TTT");
       
        Collections.sort(a);//<-- Método de la clase Collections para ordenar introducir por parámetro objeto arrayList a en este caso.
        
        for (String values: a) {
            System.out.println( " Estos son los elementos contenidos en el arrayList y ordenado alfabéticamente =>" + values );
        }
    }
}