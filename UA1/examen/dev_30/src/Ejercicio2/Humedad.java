package Ejercicio2;

public class Humedad extends Thread{
    @Override
    public void run() {
        int n=100;
        for (int i =0;i<10;i++){
            int gramosAgua = (int) (Math.random() * n) + 1;
            System.out.println("La Humedad que hace ahora mismo es: "+gramosAgua+" g / m³");
            System.out.println("Lectura realizada por el sensor: " + System.currentTimeMillis());
            System.out.println("");

        }
    }
}
