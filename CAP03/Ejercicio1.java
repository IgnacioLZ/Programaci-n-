package CAP03;
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Escriba num1: ");
        int num1 = sc.nextInt();
        System.out.print("Escriba num2: " );
        int num2 = sc.nextInt();
        System.out.println(num1+" x "+num2+" = "+(num1*num2));
        sc.close();
    }
}
