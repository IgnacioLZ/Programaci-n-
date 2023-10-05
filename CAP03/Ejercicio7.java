package CAP03;
import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Escriba base factura: ");
    float base = sc.nextInt();
    double iva = (base*0.21);
    System.out.println("La factura con IVA es: "+ (base+iva));
        sc.close();

    
    }
}
