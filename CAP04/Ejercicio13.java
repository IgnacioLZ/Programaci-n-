package CAP04;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba num1: ");
        int num1 = sc.nextInt();
        System.out.println("Escriba num2: ");
        int num2 = sc.nextInt();
        System.out.println("Escriba num3: ");
        int num3 = sc.nextInt();
        if (num1<num2) {
            if (num3>num2) {
            System.out.println(num1+", "+num2+", "+num3);
        }else{ if (num3<num1){
            System.out.println(num3+", "+num1+", "+num2);
        } else {
            System.out.println(num2+", "+num3+", "+num1);
        }
        }
        }
        if (num3<num1) {
            if (num2>num1) {
                System.out.println(num3+", "+num1+", "+num2);
            } else {
                System.out.println(num3+", "+num2+", "+num1);
            }
        
        }
        if (num2<num1) {
            if (num3>num1) {
                System.out.println(num2+", "+num1+", "+num3);
            } else {
                System.out.println(num2+", "+num3+", "+num1);
            }
        
        }
        sc.close();

    }
}
