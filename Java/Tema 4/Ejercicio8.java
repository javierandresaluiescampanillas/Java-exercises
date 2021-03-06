﻿/**
 * Ejercicio 8 de la relación 4.
 *
 * @author Javier Andrés Domínguez
 */
 public class Ejercicio8 {

  public static void main(String[] args) {

    System.out.println("Este programa calcula la media de tres notas.");
    
    System.out.print("Por favor, introduzca la primera nota: ");
    Double nota1 = Double.parseDouble(System.console().readLine());
    
    System.out.print("A continuación la segunda nota: ");
    Double nota2 = Double.parseDouble(System.console().readLine());
    
    System.out.print("Y por último la tercera nota: ");
    Double nota3 = Double.parseDouble(System.console().readLine());
   
    if ((nota1, nota2, nota3 > 10) || (nota1, nota2, nota3 < 0)) {
	     System.out.print("Hay una nota con una valor imposible.");
   	}

    double media = (nota1 + nota2 + nota3) / 3;

    System.out.printf("La media es %.2f\n", media);
    
    if (media < 5) {
      System.out.print("Insuficiente");
    }
    
    if ((media >= 5) && (media < 6)) {
      System.out.print("Suficiente");
    }
    
    if ((media >= 6) && (media < 7)) {
      System.out.print("Bien");
    }
    
    if ((media >= 7) && (media < 9)) {
      System.out.print("Notable");
    }
    
    if (media >= 9) {
      System.out.print("Sobresaliente");
    }
  }
}
