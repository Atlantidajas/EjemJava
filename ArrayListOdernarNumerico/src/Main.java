import java.util.Collections;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        
        a.add(67);
        a.add(78);
        a.add(10);
        a.add(4);
        
        System.out.println("\nN�meros en el orden original:");
        for (int numero: a) {
            System.out.println(numero);
        }

        Collections.sort(a);
        System.out.println("\nN�meros ordenados:");
        for (int numero: a) {
            System.out.println(numero);
        }
    }
}