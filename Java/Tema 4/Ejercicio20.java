﻿/**
 * Ejercicio 20 de la relación 4.
 *
 * @author Javier Andrés Domínguez
 */
 public class Ejercicio20 {

  public static void main(String[] args) {
    
    int x;
    boolean capicua = false;
    
    System.out.print("Por favor, introduzca un número entero (de 5 cifras como máximo): ");
    x = Integer.parseInt(System.console().readLine());
    
    if (x < 10) {
      capicua = true;
    }
    if ((x >= 10) && (x < 100)) {
      if ((x / 10) == (x % 10)) {
        capicua = true;
      }
    }
    if ((x >= 100) && (x < 1000)) {
      if ((x / 100) == (x % 10)) {
        capicua = true;
      }
    }
    if ((x >= 1000) && (x < 10000)) {
      if (((x / 1000) == (x % 10)) && ((( x / 100 ) % 10)== (( x / 10) % 10))) {
        capicua = true;
      }
    }
    if (x >= 10000) {
      if (((x / 10000) == (x % 10) ) && ((((x / 1000) % 10)) == ((x / 10) % 10))) {
        capicua = true;
      }
    }
    
    if (capicua) {
      System.out.println("El número introducido es capicúa.");
    } else {
      System.out.println("El número introducido no es capicúa.");
    }
  }
}
