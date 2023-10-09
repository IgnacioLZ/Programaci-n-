package CAP04;

import java.util.Scanner;


public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba un número: ");
        int num = sc.nextInt();
        int cifra = num % 10;
        
            System.out.print(cifra);
        
        sc.close();
    }
}
