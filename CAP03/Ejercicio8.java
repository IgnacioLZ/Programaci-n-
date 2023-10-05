package CAP03;
import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Horas de trabajo al día: ");
        float horas = sc.nextInt();
        System.out.println("Si trabaja "+horas+" horas al día, gana semanalmente: "+((12*horas)*5));
        sc.close();
    }
}
