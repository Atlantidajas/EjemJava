
public class Main {

	public static void main(String[] args) {
		Alumno al = new Alumno( "Primero de bachillerato", "Juan Gomez", 1999 );
		System.out.println( al.toString() );
		
		Profesor pf = new Profesor( 1800, "Laura Gutierrez", 1968 );
		System.out.println( pf.toString() );

	}

}
