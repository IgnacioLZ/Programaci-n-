package CAP04;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Primera nota: ");
        float primera = sc.nextInt();
        System.out.print("Segunda nota: ");
        float segunda = sc.nextInt();
        System.out.print("Tercera nota: ");
        float tercera = sc.nextInt();
        float media = (primera+segunda+tercera)/3;
        System.out.println("la media de las tres notas es de: "+(float)media);

        sc.close();
    }
}
