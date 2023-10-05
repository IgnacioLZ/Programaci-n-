package CAP03;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        float euro = 0.00601012f ;

        System.out.println("¿Cúantas pesetas quiere pasar a euros?");
        float pesetas = sc.nextInt();
        System.out.println("El total en euros es: " +(euro*pesetas));
        sc.close();
    }
}


