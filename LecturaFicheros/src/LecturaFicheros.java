import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LecturaFicheros {

	public String rutaFichero;
	
    public LecturaFicheros(String rutaFichero){
    	this.rutaFichero = rutaFichero;
    }
    	
    public void lecturaTXT() {	
    	
        try {
        	//String rutaFicheroAbsoluta = "C:\Users\Jorge\Documents\multiplataforma\ejemplosJava\LecturaFicheros\src\ficheros\ficheroLectura.txt";
        	String rutaFicheroRelativa = this.rutaFichero;//Se toma la ruta desde el directorio principal
            BufferedReader bf = new BufferedReader( new FileReader( rutaFicheroRelativa ) );
            String linea = "";
            while (linea != null) {
                System.out.println(linea);
                linea = bf.readLine();
            }
            bf.close();
        } catch (FileNotFoundException e) { // qué hacer si no se encuentra el fichero
            System.out.println("No se encuentra el fichero ficheroLectura.txt");
        } catch (IOException e) { // qué hacer si hay un error en la lectura del fichero
            System.out.println("No se puede leer el fichero ficheroLectura.txt");
        }
    }
}