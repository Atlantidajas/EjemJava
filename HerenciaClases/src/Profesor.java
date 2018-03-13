public class Profesor extends Persona {
	
	private double sueldo;

	public Profesor( double sueldo,String nombre,int anioNacimiento ) {
		super( nombre, anioNacimiento );
		this.sueldo = sueldo;
	}
	
	@Override
	public String toString() {
		return " Sueldo --> " + this.sueldo + ";" + 
	           " Nombre --> " + this.nombre + ";" + 
			   " Año de nacimiento --> " + this.anioNacimiento + ";";
	}
	
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public double getSueldo() {
		return this.sueldo;
	}
	
}