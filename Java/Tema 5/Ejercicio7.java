/**
 * Ejercicio 7 de la relación 5.
 *
 * @author Javier Andrés Domínguez
 */
 public class Ejercicio7 {

  public static void main(String[] args) {
    
    int intentos = 4;
    int numeroIntroducido;
    boolean correcto = false;
    
    do {
      System.out.print("Introduzca la clave de la caja fuerte: ");
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      
      if (numeroIntroducido == 8888) {
        correcto = true;
      } else {
        System.out.println("Clave incorrecta");
      }
      
      intentos--;
  
    } while((intentos > 0) && (!correcto));
    
    if (correcto) {
      System.out.println("Clave aceptada.");
    } else {
      System.out.println("Lo siento, ha agotado las 4 oportunidades.");
    }
  }
}