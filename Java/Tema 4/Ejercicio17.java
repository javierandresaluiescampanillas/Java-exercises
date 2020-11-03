/**
 * Ejercicio 17 de la relación 4.
 *
 * @author Javier Andrés Domínguez
 */
public class Ejercicio17 {

  public static void main(String[] args) {
    
	System.out.println("Este programa te indica la última cifra de un número entero")
    System.out.print("Por favor, introduzca un número entero: ");
    int x = Integer.parseInt(System.console().readLine());
    System.out.println("La última cifra del número introducido es el " + (x % 10));
  }
}
