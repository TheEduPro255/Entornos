package entornos;
import java.util.Scanner;
// TODO: Auto-generated Javadoc

/**
 * The Class Main.
 */
public class Main {
  
  /**
   * The main method.
   *
   * @param args the arguments
   */
  public static void main(String[] args) {
    Scanner s = new Scanner("System.in");
    System.out.println("Introduce el a�o");
    int a�o = s.nextInt();
    if (a�o % 4 == 0) {
      System.out.println("El a�o es bisiesto");  
    }
    else {
      System.out.println("El a�o no es bisiesto");
    }
  }

}
