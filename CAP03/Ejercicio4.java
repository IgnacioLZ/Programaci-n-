package CAP03;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    System.out.println("Escriba num1: ");
    float num1 = sc.nextInt();
    System.out.println("Escriba num2: ");
    float num2 = sc.nextInt();
    System.out.println(num1+" + "+num2+" = "+(num1+num2));
    System.out.println(num1+" - "+num2+" = "+(num1-num2));
    System.out.println(num1+" x "+num2+" = "+(num1*num2));
    System.out.println(num1+" / "+num2+" = "+(num1/num2));
        sc.close();
    }
}
