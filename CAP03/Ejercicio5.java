package CAP03;
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escriba base rectángulo: ");
        float base = sc.nextInt();
        System.out.println("Escriba altura rectángulo");
        float altura = sc.nextInt();
        System.out.println("El área de rectángulo es: "+(base*altura)+" m^2");

        sc.close();
    }
}
