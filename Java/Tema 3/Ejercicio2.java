/**
 * Ejercicio 2 de la relación 3.
 *
 * @author Javier Andrés Domínguez
 */
 public class Ejercicio2 {
  public static void main(String[] args) {
    System.out.print("Por favor, introduce la cantidad de euros que quieres convertir: ");
    double euros = Double.parseDouble(System.console().readLine());

    int pesetas = (int) (euros * 166.386);
    
    System.out.print(euros + " euros son " + pesetas + " pesetas.");
  }
}
