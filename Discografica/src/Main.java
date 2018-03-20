import java.util.ArrayList;
import java.util.Collections;

public class Main {
 
    public static void main(String[] args) {
        ArrayList<Disco> d = new ArrayList<Disco>();
       
        Disco d1 = new Disco("M Clan", "Delta", 2016);
        Disco d2 = new Disco("Revólver", "Babilonia", 2015);
        Disco d3 = new Disco("Coti", "Malditas Canciones", 2009);
       
        d.add(d1);
        d.add(d2);
        d.add(d3);
       
        Collections.sort(d);
       
        for(Disco disco: d)
            System.out.println(disco);
 
    }
 
}