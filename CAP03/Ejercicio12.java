package CAP03;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la nota del primer examen: ");
        float nota1 = sc.nextInt();
        System.out.println("¿Qué nota quieres sacar en el trimestre? ");
        float nota2 = sc.nextInt();
        double nota3 = (0.4*nota1)+(nota2*0.6);
        System.out.println("Para tener un "+nota2+" en el trimestre necesitas sacar un " +nota3+ " en el segundo examen. ");

        sc.close();

    }
}
