package CAP04;

import java.util.Scanner;

public class Ejercicio8 {
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
        if (media < 5) {
            System.out.print("Insuficiente");
        }
        if (media >= 5 & media<6){
            System.out.print("Suficiente");
        }
        if (media>=6 & media<7) {
            System.out.print("Bien");
        }
        if (media>=7 & media<9) {
            System.out.print("Notable");
        }
        if (media >=9 & media<=10)
        System.out.print("Sobresaliente");
        sc.close();
    }
}
