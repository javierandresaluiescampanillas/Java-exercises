/**
 * Ejercicio 5 de la relación 1.
 *
 * @author Javier Andrés Domínguez
 */
public class Ejercicio5 {
  public static void main(String[] args) {
    String rojo = "\033[31m";
    String verde = "\033[32m";
    String naranja = "\033[33m";
    String azul = "\033[34m";
    String morado = "\033[35m";
    String celeste = "\033[36m";
    String blanco = "\033[37m";

    System.out.println(naranja + "Lunes\tMartes\tMiérc.\tJueves\tViernes");
    System.out.println("======\t=======\t======\t======\t=======");
    System.out.println(verde + "ED\tPRO\tPRO\tPRO" + rojo + "\tFOL");
    System.out.println(verde + "LM\tPRO\tPRO\tLM" + rojo + "\tFOL");
    System.out.println(celeste + "LM" + rojo + "\tED\tPRO" + blanco + "\tLM" + morado + "\tFOL");
    System.out.println(naranja + "PRO" + rojo + "\tED\tBBDD" + blanco + "\tSINF" + morado + "\tSINF");
    System.out.println(naranja + "BBDD" + morado + "\tBBDD" + celeste + "\tSINF" + morado + "\tSINF" + celeste + "\tED");
    System.out.println(naranja + "BBDD" + morado + "\tBBDD" + celeste + "\tSINF" + morado + "\tSINF" + celeste + "\tED");
  }
}
