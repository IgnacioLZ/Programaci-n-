package CAP04;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escriba altura h: ");
        float h = sc.nextInt();
        double segundos = ((2*h)/9.81)*1/2;
        System.out.print("El tiempo que tardará en caer un objeto desde una altura h es de: "+segundos+" segundos");


        sc.close();
    }
}
