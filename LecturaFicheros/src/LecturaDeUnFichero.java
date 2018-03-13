import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LecturaDeUnFichero {

    public static void main(String[] args) {
        try {
        	//String rutaFicheroAbsoluta = "C:\Users\Jorge\Documents\multiplataforma\ejemplosJava\LecturaFicheros\src\ficheros\ficheroLectura.txt";
        	String rutaFicheroRelativa = "./src/ficheros/ficheroLectura.txt";//Se toma la ruta desde el directorio principal
            BufferedReader bf = new BufferedReader( new FileReader( rutaFicheroRelativa ) );
            String linea = "";
            while (linea != null) {
                System.out.println(linea);
                linea = bf.readLine();
            }
            bf.close();
        } catch (FileNotFoundException e) { // qu� hacer si no se encuentra el fichero
            System.out.println("No se encuentra el fichero ficheroPrueba.txt");
        } catch (IOException e) { // qu� hacer si hay un error en la lectura del fichero
            System.out.println("No se puede leer el fichero ficheroPrueba.txt");
        }
    }
}
