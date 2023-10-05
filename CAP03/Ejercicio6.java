package CAP03;
    import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba base triángulo: ");
        float base = sc.nextInt();
        System.out.println("Escriba altura triángulo");
        float altura = sc.nextInt();
        System.out.println("El área de triángulo es: "+((base*altura)/2)+" m^2");

        sc.close();
    }
}
