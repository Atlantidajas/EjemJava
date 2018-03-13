
public class Main {

	public static void main(String[] args) {
		
		double numeroIntroducido;
		
	//Redondeo de un número con la método round de la clase Math(redondea siempre al entero más próximo).
		numeroIntroducido = 10.6;		
		System.out.println(" 1º Redondeo del número " + numeroIntroducido + " es igual a => " + Math.round( numeroIntroducido ) );
		numeroIntroducido = -10.6;		
		System.out.println(" 2º Redondeo del número " + numeroIntroducido + " es igual a => " + Math.round( numeroIntroducido ) );
    //<-- Fin-->
		
		
	//Devuelve el entero menor
		numeroIntroducido = 3.3;
		System.out.println(" 3º El entero menor del número " + numeroIntroducido + " es igual a => " + Math.floor( numeroIntroducido ) );
		numeroIntroducido = 3.6;
		System.out.println(" 4º El entero menor del número " + numeroIntroducido + " es igual a => " + Math.floor( numeroIntroducido ) );
	//<-- Fin-->
		
	//Devuelve el entero mayor
		numeroIntroducido = 3.3;
		System.out.println(" 5º El entero mayor del número " + numeroIntroducido + " es igual a => " + Math.ceil( numeroIntroducido ));
		numeroIntroducido = 3.6;
		System.out.println(" 6º El entero mayor del número " + numeroIntroducido + " es igual a => " + Math.ceil( numeroIntroducido ));
	//<-- Fin-->
		
	//Valor absoluto
		numeroIntroducido = -3.3;//<-- Ojo negativo
		System.out.println(" 7º El valor absoluto " + numeroIntroducido + " es igual a => " + Math.abs( numeroIntroducido ));
	//<-- Fin-->
		
		
	//Raiz cuadrada
		numeroIntroducido = 9;
		System.out.println(" 8º La raiz cuadrada de " + numeroIntroducido + " es igual a => " + Math.sqrt( numeroIntroducido ));
	//<-- Fin-->
		
		
	//Potencia de un número
		numeroIntroducido = 7;
		int elevadoPotencia = 2;
		System.out.println(" 9º El número " + numeroIntroducido + " elevado a la potencia " + elevadoPotencia + " es igual a => " + Math.pow( numeroIntroducido,elevadoPotencia ));
    //<-- Fin-->	
		
		
	//Número aleatorio
		System.out.println(" 10º El número que ha salido aleatorio es => " + Math.random());
	//<-- Fin-->
		
		
	//Mayor de dos números
		int primerNumeroIntroducido = 2;
		int segundoNumeroIntroducido = 3;
		System.out.println(" 11º El mayor de los números " + primerNumeroIntroducido + " y " + segundoNumeroIntroducido + " es => " +Math.max( primerNumeroIntroducido,segundoNumeroIntroducido ));
	//<-- Fin-->
		
		
	//Menor de dos números
		primerNumeroIntroducido = 2;
		segundoNumeroIntroducido = 3;
		System.out.println(" 12º El menor de los números " + primerNumeroIntroducido + " y " + segundoNumeroIntroducido + " es => " +Math.min( primerNumeroIntroducido,segundoNumeroIntroducido ));	
	//<-- Fin-->	
		
	}
}
