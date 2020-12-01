/**
 * Ejercicio 8 de la relación 5.
 *
 * @author Javier Andrés Domínguez
 */
 public class Ejercicio8 {

  public static void main(String[] args) {
    
    System.out.print("Introduzca un número entero y le mostraré la tabla de multiplicar: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());
        
    for (int n = 0; n <= 10; n++) {
      System.out.println(numeroIntroducido + " x " + n + " = " + numeroIntroducido * n);
    }

  }
}
