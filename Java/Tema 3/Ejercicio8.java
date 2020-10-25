/**
 * Ejercicio 8 de la relación 3.
 *
 * @author Javier Andrés Domínguez
 */
 public class Ejercicio8 {
  public static void main(String[] args) {

    System.out.print("Por favor, introduzca el número de horas trabajadas durante la semana: ");
    int horasTrabajadas = Integer.parseInt(System.console().readLine());
    System.out.println("Su salario semanal es de " + (horasTrabajadas * 12) + " euros.");
  }
}
