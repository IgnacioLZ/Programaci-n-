package CAP04;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
        System.out.print("Por favor, introduzca el valor de a: ");
        float a = sc.nextInt();
        System.out.print("Ahora introduzca el valor de b: ");
        float b = sc.nextInt();
        System.out.print("x = "+(-b/a));
        sc.close();
    }
}

