/**
 * Ejercicio 10 de la relación 3.
 *
 * @author Javier Andrés Domínguez
 */
 public class Ejercicio10 {
  public static void main(String[] args) {

    System.out.print("Por favor, introduzca el número de Mb: ");
    double mb = Double.parseDouble(System.console().readLine());
    System.out.println(mb + "Mb son " +  (mb * 1024) + "Kb.");
  }
}
