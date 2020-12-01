/**
 * Ejercicio 12 de la relación 5.
 *
 * @author Javier Andrés Domínguez
 */
 public class Ejercicio12 {

  public static void main(String[] args) {
    
    System.out.println("Este programa muestra los n primeros números de la serie de Fibonacci.");
    System.out.print("Por favor, introduzca x: ");
    int x = Integer.parseInt(System.console().readLine());

    switch (x) {
      case 1:
        System.out.print("0");
        break;
      case 2:
        System.out.print("0 1");
        break;
      default:
        System.out.print("0 1");
        int f1 = 0;
        int f2 = 1;
        int aux;
        while(x > 2) {
            aux = f1;
            f1 = f2;
            f2 = aux + f2;
            System.out.print(" " + f2);
            x--;
        }
    }
    System.out.println();
  }
}