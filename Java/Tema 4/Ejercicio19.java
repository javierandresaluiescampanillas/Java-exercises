/**
 * Ejercicio 19 de la relación 4.
 *
 * @author Javier Andrés Domínguez
 */
 public class Ejercicio19 {

  public static void main(String[] args) {
    
    int x, digitos = 0;
    
    System.out.print("Por favor, introduzca un número entero de 5 cifras como máximo: ");
    x = Math.abs(Integer.parseInt(System.console().readLine()));
    
    if ( x < 10 ) {
      digitos = 1;
    }
    
    if (( x >= 10 ) && ( x < 100 )) {
      digitos = 2;
    }
    
    if (( x >= 100 ) && ( x < 1000 )) {
      digitos = 3;
    }
    
    if (( x >= 1000 ) && ( x < 10000 )) {
      digitos = 4;
    }
    
    if ( x >= 10000 ) {
      digitos = 5;
    }
    
    System.out.println("El número introducido tiene " + digitos + " dígitos.");
  }
}
