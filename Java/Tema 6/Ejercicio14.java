/**
 * Ejercicio 14 de la relación 6
 *
 * @author Javier Andrés Domínguez
 */
import java.util.Scanner;

public class Ejercicio14 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
	
    int intentos = 5;
    int numeroPensado;
    int minimo = 0;
    int maximo = 100;
    boolean acertado = false;
    int mayorMenorOIgual;  
    System.out.println("Piensa un número del 0 al 100. Intentaré adivinarlo en 5 intentos.");
    System.out.println("Pulsa la tecla INTRO cuando estés preparado.");
    s.next();

    do {
      numeroPensado = (int)(Math.random() * (maximo - minimo) + minimo);
      System.out.println("¿Es el " + numeroPensado + "?");
      System.out.print("El número que estás pensando es 1) mayor 2) menor 3) el mismo: ");
      mayorMenorOIgual = Integer.parseInt(System.console().readLine());
      intentos--;
      if ( (mayorMenorOIgual == 1) && (intentos > 0) )
        minimo = numeroPensado + 1;
      if ( (mayorMenorOIgual == 2) && (intentos > 0) )
        maximo = numeroPensado - 1;
      if (mayorMenorOIgual == 3) {
        acertado = true;
        System.out.println("¡Bien! ¡he acertado!");
      }
    } while(!acertado && (intentos > 0));
    if (!acertado) {
      System.out.println("Vaya, no he conseguido acertar el número.");
    }
  }
}