import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        final int sucursales = 4;
        final int productos = 5;  

        int[][] ventas = new int[sucursales][productos];

        int[] totalPorSucursal = new int[sucursales];
        int[] totalPorProducto = new int[productos];

        int registrosMayores30 = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== INGRESO DE UNIDADES VENDIDAS ===");
        for (int i = 0; i < sucursales; i++) {
            System.out.println("--- Sucursal " + (i + 1) + " ---");
            for (int j = 0; j < productos; j++) {
                do {
                    System.out.print("Producto " + (j + 1) + ": ");
                    ventas[i][j] = scanner.nextInt();

                    if (ventas[i][j] < 0) {
                        System.out.println("Error: Las unidades no pueden ser negativas. Reintente.");
                    }
                } while (ventas[i][j] < 0);

                if (ventas[i][j] > 30) {
                    registrosMayores30++;
                }
            }
        }

        for (int i = 0; i < sucursales; i++) {
            for (int j = 0; j < productos; j++) {
                totalPorSucursal[i] += ventas[i][j];
                totalPorProducto[j] += ventas[i][j]; 
            }
        }

        int menorVentaSucursal = totalPorSucursal[0];
        int sucursalMenor = 1;

        for (int i = 1; i < sucursales; i++) {
            if (totalPorSucursal[i] < menorVentaSucursal) {
                menorVentaSucursal = totalPorSucursal[i];
                sucursalMenor = i + 1;
            }
        }

        int mayorVentaProducto = totalPorProducto[0];
        int productoMayor = 1;

        for (int j = 1; j < productos; j++) {
            if (totalPorProducto[j] > mayorVentaProducto) {
                mayorVentaProducto = totalPorProducto[j];
                productoMayor = j + 1;
            }
        }


        System.out.println("\n=======================================================");
        System.out.println("                 Matriz de muestra de ventas             ");
        System.out.println("=======================================================");
        System.out.println("Sucursal     Prod   P1   P2   P3   P4   P5   | Total Sucursal");
        System.out.println("-----------------------------------------------------------------------");

        for (int i = 0; i < sucursales; i++) {
            System.out.print("Sucursal " + (i + 1) + "   ");
            for (int j = 0; j < productos; j++) {
                System.out.print(ventas[i][j] + "   ");
            }
            System.out.println("| " + totalPorSucursal[i]);
        }

        System.out.println("-----------------------------------------------------------------------");
        System.out.print("Total Producto :");
        for (int j = 0; j < productos; j++) {
            System.out.print(totalPorProducto[j] + "  ");
        }
        System.out.println("\n");

        System.out.println("================ REPORTES Y RESULTADOS ================");
        System.out.println("Sucursal con menor ventas totales: Sucursal " + sucursalMenor 
                + " (Total: " + menorVentaSucursal + " unidades)");

        System.out.println("Producto con mayor ventas totales: Producto " + productoMayor 
                + " (Total: " + mayorVentaProducto + " unidades)");

        System.out.println("Cantidad de registros mayores a 30 unidades: " + registrosMayores30);
        scanner.close();
    }
}