/**
 * Ejercicio 15 de la relación 4.
 *
 * @author Javier Andrés Domínguez
 */
public class Ejercicio15 {

  public static void main(String[] args) {
        
    System.out.println("Este programa construye una pirámide.");
    System.out.print("Introduzca un carácter de relleno: ");
    String x = System.console().readLine();
    System.out.println("Elija un tipo de pirámide");
    System.out.println("1. Con el vértice hacia arriba");
    System.out.println("2. Con el vértice hacia abajo");
    System.out.println("3. Con el vértice hacia la izquierda");
    System.out.println("4. Con el vértice hacia la derecha");
    int opcion = Integer.parseInt(System.console().readLine());

    switch(opcion) {
      case 1:
        System.out.println("  " + x);
        System.out.println(" " + x + x + x);
        System.out.println(x + x + x + x + x);
        break;
      case 2:
        System.out.println(x + x + x + x + x);
        System.out.println(" " + x + x + x);
        System.out.println("  " + x);
        break;
      case 3:
        System.out.println("    " + x);
        System.out.println("  " + x + " " + x);
        System.out.println(x + " " + x + " " + x);
        System.out.println("  " + x + " " + x);
        System.out.println("    " + x);
        break;
      case 4:
        System.out.println(x);
        System.out.println(x + " " + x);
        System.out.println(x + " " + x + " " + x);
        System.out.println(x + " " + x);
        System.out.println(x);
        break;
      default:
    }
  }
}
