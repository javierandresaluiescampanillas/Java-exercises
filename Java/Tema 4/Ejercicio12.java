/**
 * Ejercicio 12 de la relación 4.
 *
 * @author Javier Andrés Domínguez
 */
 public class Ejercicio12 {

  public static void main(String[] args) {
    
    int puntos = 0;
    String respuesta;
    
    System.out.println("CUESTIONARIO DE 1º DAM");
    
    System.out.println("1.¿Cuál es el mejor profesor?");
    System.out.println("a) Luis\nb) Pilar\nc) Juan Carlos"); 
    System.out.print("=> ");
    respuesta = System.console().readLine();
    if (respuesta.equals("a")) {
      puntos++;
    }

    System.out.println("2. ¿Cuándo se pone una Primary key?");
    System.out.println("a) Cuando una entidad no se repite más.\nb) Cuando usas la llave principal de tu casa.\nc) Cuando consigas las llaves de tu clase de primaria."); 
    System.out.print("=> ");
    respuesta = System.console().readLine();  
    if (respuesta.equals("b")) {
      puntos++;
    }

    System.out.println("3. ¿Qué se usa para un salto de línea?");
    System.out.println("a) Enter\nb) <rb>\nc) <span>"); 
    System.out.print("=> ");
    respuesta = System.console().readLine();
    if (respuesta.equals("a")) {
      puntos++;
    }
    
    System.out.println("4. ¿En qué consiste el lenguaje máquina?");
    System.out.println("a) Un lenguaje entendido por el monitro\nb) Los controles más básicos del pc como el ratón y el teclado.\nc) Un lenguaje que sólo puede ser entendido por la máquina basados en 0´s y 1´s según los porrazos que le des para que funcionen.");
    System.out.print("=> ");
    respuesta = System.console().readLine();
    if (respuesta.equals("c")) {
      puntos++;
    }
    
    System.out.println("5. ¿Qué nota se merece Javier por este glorioso trabajo?");
    System.out.println("a) 10\nb) Matrícula de honor\nc) Una palmadita en la espalda"); 
    System.out.print("=> ");
    respuesta = System.console().readLine();
    if (respuesta.equals("a", "b", "c")) {
      puntos++;
    }

    System.out.println("\nHa obtenido " + puntos + " puntos.");
  }
}
