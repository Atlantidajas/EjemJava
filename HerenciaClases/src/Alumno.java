
public class Alumno extends Persona{
	
	protected String curso;

	public Alumno( String curso, String nombre, int anioNacimiento ) {
		super( nombre, anioNacimiento );//<-- Llamo al constructor de la clase heredada
		
		this.curso = curso;
	}
	@Override
	public String toString() {
		return " Curso --> " + this.curso + ";" +
	           " Nombre --> " + this.nombre + ";" + //<-- De la clase heredada
			   " Año de nacimiento --> " + this.anioNacimiento +";";//<-- De la clase heredada
	}
	
	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getCurso() {
		return this.curso;
	}

}