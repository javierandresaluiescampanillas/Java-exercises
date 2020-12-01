/**
 * Ejercicio 13 de la relación 6
 *
 * @author Javier Andrés Domínguez
 */
public class Ejercicio13 {
  public static void main(String[] args) {
    
    int x1, x2;
    do {
      x1 = (int)(Math.random() * 6) + 1;
      x2 = (int)(Math.random() * 6) + 1;
      System.out.println(x1 + " " + x2);
    } while (x1 != x2);
  }
}
