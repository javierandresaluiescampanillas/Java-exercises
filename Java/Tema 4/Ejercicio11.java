/**
 * Ejercicio 11 de la relación 4.
 *
 * @author Javier Andrés Domínguez
 */
 public class Ejercicio11 {

  public static void main(String[] args) {
    
	System.out.println("Este programa le dirá cuánto tiempo falta para media noche desde la hora que informe.");
    System.out.println("A continuación deberá introducir una hora del día, ");
    
    System.out.print("hora: ");
    int hora = Integer.parseInt(System.console().readLine());  
    
    System.out.print("minuto: ");
    int minuto = Integer.parseInt(System.console().readLine());

    int segundosPasados = (hora * 3600) + (minuto * 60);
    int segundosRestantes = (24 * 3600) - segundosPasados;
            
    System.out.printf("Desde las %02d:%02d hasta la medianoche faltan %d segundos", hora, minuto, segundosRestantes);
  }
}
