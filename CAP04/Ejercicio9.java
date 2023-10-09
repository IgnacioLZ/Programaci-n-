package CAP04;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa resuelve ecuaciones de segundo grado");
        System.out.print("Escribe valor de a: ");
        float a = sc.nextInt();
        System.out.print("Escribe valor de b: ");
        float b = sc.nextInt();
        System.out.print("Escribe valor de c: ");
        float c = sc.nextInt();
        float resultado1 = ((-b+((b*b)-(4*a*c))*1/2)/2*a);
        float resultado2 = ((-b+(b*b-4*-a*c)*1/2)/2*-a);
        if (a<0) {
            System.out.print("X = "+ resultado1);
        } else {
            System.out.print("X = "+resultado2);
        }
        
        sc.close();
    }
}


