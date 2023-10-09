package CAP04;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Escriba número: ");
        int num = sc.nextInt();
        if (num%2==0){
            System.out.print("El número "+num+" es par");
        } else {
            System.out.print("El número "+num+" no es par");
        }
        if (num%5==0) {
            System.out.print(" y es divisible entre 5");
        } else {
            System.out.print(" y no es divisible entre 5"); 
        }
        sc.close();
    }
}
