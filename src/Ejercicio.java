import java.util.Scanner;

public class Ejercicio{
    public static void main(String[] args) {
        final int horas = 10;
        int[] paquetes = new int[horas];
        int totalPaquetes = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("===Registro_de_Paquetes===");
        for (int i = 0; i < horas; i++) {
            do {
                System.out.print("Ingrese cantidad de paquetes procesados en la hora " + (i + 1) + ": ");
                paquetes[i] = leer.nextInt();

                if (paquetes[i] < 0) {
                    System.out.println("Error: La cantidad no puede ser negativa. Intente de nuevo.");
                }
            } while (paquetes[i] < 0);

            totalPaquetes += paquetes[i];
        }
        double promedio = (double) totalPaquetes / horas;

        int menorCantidad = paquetes[0];
        int horaMenor = 1;

        for (int i = 1; i < horas; i++) {
            if (paquetes[i] < menorCantidad) {
                menorCantidad = paquetes[i];
                horaMenor = i + 1; 
            }
        }
        int horasBajoPromedio = 0;
        int rachaActual = 0;
        int rachaMaxima = 0;
        for (int i = 0; i < horas; i++) {
            if (paquetes[i] < promedio) {
                horasBajoPromedio++;
                rachaActual++;
                if (rachaActual > rachaMaxima) {
                    rachaMaxima = rachaActual;
                }
            } else {
                rachaActual = 0;
            }
        }

        System.out.println("\n================ Resultados ================");
        System.out.println("Total de paquetes: " + totalPaquetes);
        System.out.printf("Promedio de paquetes por hora: %.2f\n", promedio);
        System.out.println("Hora con menor cantidad de paquetes: Hora " + horaMenor + " (" + menorCantidad + " paquetes)");
        System.out.println("Horas con producción inferior al promedio: " + horasBajoPromedio);
        System.out.println("Racha más larga consecutiva bajo el promedio: " + rachaMaxima + " hora(s)");

        // 5. Listado final
        System.out.println("\n================ Listado Final ================");
        System.out.println("Hora-----Cantidad");
        System.out.println("=================");
        for (int i = 0; i < horas; i++) {
            System.out.println("   " + (i + 1) + "     " + paquetes[i]);
        }
        leer.close();
    }
}