import java.util.InputMismatchException;
import java.util.Scanner;

public class LeerCadena {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            StringBuilder cadena = new StringBuilder();

            System.out.print("Introduce una cadena de caracteres: ");
            while (true) {
                String entrada = scanner.next();
                if (entrada.equals("*")) {
                    break;
                }
                cadena.append(entrada).append(" ");
            }

            System.out.println("Cadena leída: " + cadena.toString());
        } catch (InputMismatchException e) {
            System.out.println("Error: entrada no válida");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}