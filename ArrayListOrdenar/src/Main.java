import java.util.Collections;//<--Librer�a para trabajar con Collections
import java.util.ArrayList;//<-- Librer�a para trabajar con arrayList

public class Main {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        
        a.add("www");
        a.add("GGG");
        a.add("AAA");
        a.add("TTT");
       
        Collections.sort(a);//<-- M�todo de la clase Collections para ordenar introducir por par�metro objeto arrayList a en este caso.
        
        for (String values: a) {
            System.out.println( " Estos son los elementos contenidos en el arrayList y ordenado alfab�ticamente =>" + values );
        }
    }
}