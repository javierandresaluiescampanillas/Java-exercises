/**
 * Ejercicio 9 de la relación 6
 *
 * @author Javier Andrés Domínguez
 */
public class Ejercicio9 {
  public static void main(String[] args) {
    
    int x = 0;
    int cuentaNumeros = 0;
    while (x != 24) {
      x = (int)(Math.random() * 51) * 2;
      System.out.print(x + " ");
      cuentaNumeros++;
    }
    System.out.println("\nSe han generado " + cuentaNumeros + " números.");
  }
}