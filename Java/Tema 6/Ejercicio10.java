/**
 * Ejercicio 10 de la relación 6
 *
 * @author Javier Andrés Domínguez
 */
public class Ejercicio10 {
  public static void main(String[] args) {
    
    int x;
    int longitud;
    String relleno = "";
    
    for(int i = 1; i <= 10; i++) {
      longitud = (int)(Math.random() * 40) + 1;
      x = (int)(Math.random() * 6);
      switch(x) {
        case 0:
          relleno = "*";
          break;
        case 1:
          relleno = "-";
          break;
        case 2:
          relleno = "=";
          break;
        case 3:
          relleno = ".";
          break;
        case 4:
          relleno = "|";
          break;
        case 5:
          relleno = "@";
          break;
        default:
      }
      for(int j = 1; j <= longitud; j++) {
        System.out.print(relleno);
      }
      System.out.println();
    }
  }
}