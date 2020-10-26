/**
 * Ejercicio 1 de la relación 4.
 *
 * @author Javier Andrés Domínguez
 */
 public class Ejercicio1 {
  public static void main(String[] args) {

    String dia;

    System.out.print("Por favor, introduzca un día de la semana y le diré qué asignatura toca a primera: ");
    dia = (System.console().readLine()); 
    dia.toLowerCase();
    
    switch(dia) {
      case "lunes":
        System.out.println("Entornos de desarrollo");
        break;
	  case "martes":
      case "miércoles":
      case "jueves":
        System.out.println("Programación");
        break;
      case "viernes":
        System.out.println("Formación de orientación laboral");
        break;
      case "sábado":
      case "domingo":
        System.out.println("No hay clase");
        break;
      default:
        System.out.println("El día introducido no es apropiado.");
    }
  }
}
