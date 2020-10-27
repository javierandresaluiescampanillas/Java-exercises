/**
 * Ejercicio 6 de la relación 4.
 *
 * @author Javier Andrés Domínguez
 */
 public class Ejercicio6 {
	 
  final static double gravedad = 9.81;
  public static void main(String[] args) {
	System.out.println("Averiguaré cuánto tarda en caer el cuerpo.")
	System.out.print("Por favor, introduzca la altura (en metros) desde la que cae el objeto: ");
    Double h = Double.parseDouble(System.console().readLine());

    double s = Math.sqrt(2*h/g);

    System.out.printf("El objeto tarda %.2f s en caer.\n", s); 
  }
}