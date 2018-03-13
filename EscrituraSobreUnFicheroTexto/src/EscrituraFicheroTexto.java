import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class EscrituraFicheroTexto {

    public static void main(String[] args) { // Ejemplo 1� Escritura lineas texto en fichero txt
        try {
          //String rutaFicheroAbsoluta = "C:\Users\Jorge\Documents\multiplataforma\projectsJava\EscrituraSobreUnFicheroTexto\src\ficheros\pruebaEscrituraFichero.txt";
        	String rutaFicheroRelativa = "./src/ficheros/pruebaEscrituraFichero.txt";//Se toma la ruta desde el directorio principal
            BufferedWriter bw = new BufferedWriter(new FileWriter( rutaFicheroRelativa ));
            bw.write("Probando excritura en fichero primera linea \r\n");
            bw.write("Probando excritura en fichero primera linea \r\n");
            bw.write("Probando excritura en fichero primera linea \r\n");
            bw.close();
            System.out.println("Se grabaron datos correctamente");
        }
        catch (IOException e) {
            System.out.println("No se ha podido escribir en el fichero");
        }  
    }
    
    /*public static void main(String[] args) { // Ejemplo 2� Escritura lineas texto en fichero txt convirtiendo int a string
    	
        try {
        	//String rutaFicheroAbsoluta = "C:\Users\Jorge\Documents\multiplataforma\projectsJava\EscrituraSobreUnFicheroTexto\src\ficheros\pruebaEscrituraFichero.txt";
        	String rutaFicheroRelativa = "./src/ficheros/pruebaEscrituraFichero.txt";//Se toma la ruta desde el directorio principal
            BufferedWriter bw = new BufferedWriter(new FileWriter(rutaFicheroRelativa));
            for (int i = 0; i<= 100; i++) { // Sacar un n�mero del 1 al 100
            	if (i % 2 == 0) { // Solo pares
            		String ii = String.valueOf(i); // Conversi�n de int i a -> String ii (Para escritura documento txt)
            		bw.write( String.valueOf(ii) + " \r\n"); 
            	}
            }
            System.out.println("Se grabaron datos correctamente");
            bw.close();
        }
        catch (IOException e) {
            System.out.println("No se ha podido escribir en el fichero");
        }  
    }*/
    
}