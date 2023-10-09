package CAP04;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba un día de la semana: ");
        String día = sc.nextLine();
    switch (día) {
        case "lunes":
        System.out.println("Programación");
        break;
        case "martes":
        System.out.println("Lenguaje de Marcas");
        break;
        case "miercoles":
        System.out.println("Lenguaje de Marcas");
        break;
        case "jueves":
        System.out.println("Programación");
        break;
        case "viernes":
        System.out.println("FOL");
        break;
        default:
        System.out.println("Elija otro día de la semana");

    }
    sc.close();
    }
}
