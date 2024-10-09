import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
    Thread hilo = new Thread(new Progrma1()); 

    //Iniciamos el ottro programa.
    hilo.start();

    try {
        //Esperamos a que termine el hilo.
        hilo.join();

        //Usaremos catch por si hay algun error.
    } catch (InterruptedException e) {
        System.out.println("El hilo se ha interrumpido.");

    }
        System.out.println("Programa terminado.");
    }
}