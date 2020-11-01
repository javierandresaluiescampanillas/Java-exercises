/**
 * Ejercicio 18 de la relación 4.
 *
 * @author Javier Andrés Domínguez
 */
public class Ejercicio18 {
	
  public static void main(string[] args) {
	  
	int x, primeraCifra = 0;
    
    System.out.print("Por favor, introduzca un número entero (de 5 cifras como máximo): ");
    n = Integer.parseInt(System.console().readLine());
    
    if ( x < 10 ) {
      primeraCifra = x;
    }
    
    if (( x >= 10 ) && ( x < 100 )) {
      primeraCifra = x / 10;
    }
    
    if (( x >= 100 ) && ( x < 1000 )) {
      primeraCifra = x / 100;
    }
    
    if (( x >= 1000 ) && ( x < 10000 )) {
      primeraCifra = x / 1000;
    }
    
    if ( x >= 10000 ) {
      primeraCifra = x / 10000;
    }
    
    System.out.println("La primera cifra del número introducido es el " + primeraCifra);
	  
  }
}
     