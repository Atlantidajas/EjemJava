
public class Main {

	public static void main(String[] args) {
		
		double numeroIntroducido;
		
	//Redondeo de un n�mero con la m�todo round de la clase Math(redondea siempre al entero m�s pr�ximo).
		numeroIntroducido = 10.6;		
		System.out.println(" 1� Redondeo del n�mero " + numeroIntroducido + " es igual a => " + Math.round( numeroIntroducido ) );
		numeroIntroducido = -10.6;		
		System.out.println(" 2� Redondeo del n�mero " + numeroIntroducido + " es igual a => " + Math.round( numeroIntroducido ) );
    //<-- Fin-->
		
		
	//Devuelve el entero menor
		numeroIntroducido = 3.3;
		System.out.println(" 3� El entero menor del n�mero " + numeroIntroducido + " es igual a => " + Math.floor( numeroIntroducido ) );
		numeroIntroducido = 3.6;
		System.out.println(" 4� El entero menor del n�mero " + numeroIntroducido + " es igual a => " + Math.floor( numeroIntroducido ) );
	//<-- Fin-->
		
	//Devuelve el entero mayor
		numeroIntroducido = 3.3;
		System.out.println(" 5� El entero mayor del n�mero " + numeroIntroducido + " es igual a => " + Math.ceil( numeroIntroducido ));
		numeroIntroducido = 3.6;
		System.out.println(" 6� El entero mayor del n�mero " + numeroIntroducido + " es igual a => " + Math.ceil( numeroIntroducido ));
	//<-- Fin-->
		
	//Valor absoluto
		numeroIntroducido = -3.3;//<-- Ojo negativo
		System.out.println(" 7� El valor absoluto " + numeroIntroducido + " es igual a => " + Math.abs( numeroIntroducido ));
	//<-- Fin-->
		
		
	//Raiz cuadrada
		numeroIntroducido = 9;
		System.out.println(" 8� La raiz cuadrada de " + numeroIntroducido + " es igual a => " + Math.sqrt( numeroIntroducido ));
	//<-- Fin-->
		
		
	//Potencia de un n�mero
		numeroIntroducido = 7;
		int elevadoPotencia = 2;
		System.out.println(" 9� El n�mero " + numeroIntroducido + " elevado a la potencia " + elevadoPotencia + " es igual a => " + Math.pow( numeroIntroducido,elevadoPotencia ));
    //<-- Fin-->	
		
		
	//N�mero aleatorio
		System.out.println(" 10� El n�mero que ha salido aleatorio es => " + Math.random());
	//<-- Fin-->
		
		
	//Mayor de dos n�meros
		int primerNumeroIntroducido = 2;
		int segundoNumeroIntroducido = 3;
		System.out.println(" 11� El mayor de los n�meros " + primerNumeroIntroducido + " y " + segundoNumeroIntroducido + " es => " +Math.max( primerNumeroIntroducido,segundoNumeroIntroducido ));
	//<-- Fin-->
		
		
	//Menor de dos n�meros
		primerNumeroIntroducido = 2;
		segundoNumeroIntroducido = 3;
		System.out.println(" 12� El menor de los n�meros " + primerNumeroIntroducido + " y " + segundoNumeroIntroducido + " es => " +Math.min( primerNumeroIntroducido,segundoNumeroIntroducido ));	
	//<-- Fin-->	
		
	}
}
