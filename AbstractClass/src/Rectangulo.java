public class Rectangulo extends FiguraGeometrica {

    // Definici�n de atributos
    private double base;
    private double altura;

    // Definici�n de m�todos
    public Rectangulo (double largo, double ancho) {
        super("Rectangulo");
        base=largo;
        altura=ancho;
    }
    
    public double area () {
        return base * altura;
    }
}