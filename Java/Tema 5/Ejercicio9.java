/**
 * Ejercicio 9 de la relación 5.
 *
 * @author Javier Andrés Domínguez
 */
public class Ejercicio9 {

 public static void main(String[] args) {
    
   int numeroDeDigitos = 1, x, numeroIntroducido;

   System.out.print("Introduzca un número entero y le diré cuántos dígitos tiene: ");
   numeroIntroducido = Integer.parseInt(System.console().readLine());
    
   x = numeroIntroducido;
   
   while (x > 10) {
     x /= 10;
     numeroDeDigitos++;
   }
   
   System.out.println(numeroIntroducido + " tiene " + numeroDeDigitos + " dígito/s.");
  }
}
