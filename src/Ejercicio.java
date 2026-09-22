
import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int horamenor=0;
        int cont=0;
        int suma=0;
        int[] paquetes = {0,1,2,3,4,5,6,7,9,10};
        for (int i=0; i<paquetes.length; i++){
        System.out.println("Ingrese la cantidad de paquetes en la hora "+(++cont));
        //se leeria la cantidadd de paquetes
        System.out.println(paquetes[i]);

        if (paquetes[i]<0){
            i=--i;
            System.out.println("cantidad no valida");
        }
        if (paquetes[i]>0){
            suma= suma+paquetes[i];
                System.out.println("suma = " + suma);
        }
        }
        float prom;
        prom=suma/10f;
        System.out.println("el promedio por hora es de: "+ prom);


        
    }
}