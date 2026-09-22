
import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] paquetes = {1,2,3,4,5,6,7,8,9,10};
        for (int i=1; i<=paquetes.length; i++){
        System.out.println("Ingrese la cantidad de paquetes en la hora "+i);
        paquetes[i]=leer(nextint);

        if (paquetes[i]<0){
            i=--i;
            System.out.println("cantidad no valida");
        }
        }



        
    }
}