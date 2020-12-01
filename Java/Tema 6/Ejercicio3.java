/**
 * Ejercicio 3 de la relación 6
 *
 * @author Javier Andrés Domínguez
 */
public class Ejercicio3 {
  public static void main(String[] args) {
    
    String tipo = "";
    String carta = "";
    switch((int)(Math.random()*4)) {
      case 0:
        tipo = "oros";
        break;
      case 1:
        tipo = "copas";
        break;
      case 2:
        tipo = "bastos";
        break;
      case 3:
        tipo = "espadas";
      default:
    }
    int numeroCarta = (int)(Math.random()*11) + 1;
    switch(numeroCarta) {
      case 1:
        carta = "As";
        break;
      case 8:
        carta = "Sota";
        break;
      case 9:
        carta = "Caballo";
        break;
      case 10:
        carta = "Rey";
        break;
      default:
        carta = String.valueOf(numeroCarta);
    }
    System.out.println(carta + " de " + tipo);
  }
}