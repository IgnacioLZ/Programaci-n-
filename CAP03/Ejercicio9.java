package CAP03;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba radio: ");
        double radio = sc.nextInt();
        System.out.println("Escriba altura: ");
        double altura = sc.nextInt();
        double volumen = ((1/3)*(3.1415*(radio*radio))*altura);
        System.out.println("El volumen del cono es: "+volumen);


        sc.close();
    }
}
