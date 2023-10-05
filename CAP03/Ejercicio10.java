package CAP03;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escriba Mb: ");
        float mb = sc.nextInt();
        float conversión = 1_000*mb;
        System.out.println(mb+" Mb son "+conversión+" Kb.");
        sc.close();
    }
}
