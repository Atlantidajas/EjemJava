public class Rectangulo extends FiguraGeometrica {

    // Definición de atributos
    private double base;
    private double altura;

    // Definición de métodos
    public Rectangulo (double largo, double ancho) {
        super("Rectangulo");
        base=largo;
        altura=ancho;
    }
    
    public double area () {
        return base * altura;
    }
}