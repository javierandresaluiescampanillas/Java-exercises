/**
 * Ejercicio 6 de la relación 6
 *
 * @author Javier Andrés Domínguez
 */
public class Ejercicio6 {
  public static void main(String[] args) {
    
    int intentos = 5;
    int numeroIntroducido;
    boolean acertado = false;
    int numeroMisterioso = (int)(Math.random() * 101);
    System.out.println("Estoy pensando un número del 0 al 100, intenta adivinarlo. Tienes 5 intentos.");
    
	do {
      System.out.print("Introduce un número: ");
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      intentos--;
      if ( (numeroIntroducido > numeroMisterioso) && (intentos > 0) ){
        System.out.println("El número que estoy pensando es menor que " + numeroIntroducido);
        System.out.println("Te quedan " + intentos + " intentos.");
      }
      if ( (numeroIntroducido < numeroMisterioso) && (intentos > 0) ){
        System.out.println("El número que estoy pensando es mayor que " + numeroIntroducido);
        System.out.println("Te quedan " + intentos + " intentos.");
      }
      if (numeroIntroducido == numeroMisterioso) {
        acertado = true;
        System.out.println("¡Enhorabuena! ¡Has acertado!");
      }
    } while (!acertado && (intentos	> 0));
    if (!acertado) {
      System.out.println("Lo siento, no has acertado, el número que estaba pensando era el " + numeroMisterioso);
    }
  }
}