package CAP03;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escriba Kb: ");
        float Kb = sc.nextInt();
        double conversión = 0.0001*Kb;
        System.out.println(Kb+" Mb son "+conversión+" Mb.");
        sc.close();
    }
}


