﻿/**
 *Ejercicio 5 de la relación 2.
 *
 * @author Javier Andrés Domínguez
 */
public class Ejercicio5 {
  public static void main(String[] args) {
    int pesetas = 30000;
    double euros = pesetas / 166.386;
    
    System.out.println(pesetas + " pesetas son " + euros + " euros.");
    System.out.printf("%d pesetas son %.2f euros.\n", pesetas, euros);
  }
}
