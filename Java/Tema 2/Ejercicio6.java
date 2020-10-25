/**
 *Ejercicio 6 de la relación 2.
 *
 * @author Javier Andrés Domínguez
 */
public class Ejercicio6 {
  public static void main(String[] args) {
    double baseImponible = 33.33;

    System.out.printf("Base imponible %8.2f\n", baseImponible);
    System.out.printf("IVA            %8.2f\n", (baseImponible * 0.21));
    System.out.printf("-----------------------\n");
    System.out.printf("Total          %8.2f\n", (baseImponible * 1.21));
  }
}
