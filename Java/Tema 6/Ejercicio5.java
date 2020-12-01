/**
 * Ejercicio 5 de la relación 6
 *
 * @author Javier Andrés Domínguez
 */
public class Ejercicio5 {
  public static void main(String[] args) {
    
    int maximo = 100;
    int minimo = 199;
    int suma = 0;
    int x;
    for (int i = 0; i < 50; i++) {
      x = (int)(Math.random()*100) + 100;
      System.out.print(x + " ");
      suma +=x;
      if (x < minimo) {
        minimo = x;
      }
      if (x > maximo) {
        maximo = x;
      }
    }
    System.out.println("\nMínimo: " + minimo + "\nMáximo: " + maximo + "\nMedia: " + suma / 50);
  }
}