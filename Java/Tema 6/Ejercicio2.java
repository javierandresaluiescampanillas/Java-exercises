/**
 * Ejercicio 2 de la relación 6
 *
 * @author Javier Andrés Domínguez
 */
public class Ejercicio2 {
  public static void main(String[] args) {
    
    String tipo = "";
    String carta = "";
    
    int numeroTipo = (int)(Math.random()*4) + 1;
    switch(numeroTipo) {
      case 1:
        tipo = "picas";
        break;
      case 2:
        tipo = "corazones";
        break;
      case 3:
        tipo = "diamantes";
        break;
      case 4:
        tipo = "tréboles";
      default:
    }
    int numeroCarta = (int)(Math.random()*13) + 1;
    switch(numeroCarta) {
      case 1:
        carta = "As";
        break;
      case 11:
        carta = "J";
        break;
      case 12:
        carta = "Q";
        break;
      case 13:
        carta = "K";
        break;
      default:
        carta = String.valueOf(numeroCarta);
    }
    System.out.println(carta + " de " + tipo);
  }
}