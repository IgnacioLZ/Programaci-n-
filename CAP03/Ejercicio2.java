package CAP03;
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        float pesetas = 166.386f;

        System.out.println("¿Cúantos euros quiere pasar a pesetas?");
        float euros = sc.nextInt();
        System.out.println("El total en pesetas es: " +(euros*pesetas));
        sc.close();
    }
}
