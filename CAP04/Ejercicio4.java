package CAP04;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, introduzca el número de horas trabajadas durante la semana:");
        int horas = sc.nextInt();
        if (horas<=40) {
            System.out.println("El sueldo semanal que le corresponde es de "+(horas*12)+" euros");
        }
        if (horas>40) {
            System.out.println("El sueldo semanal que le corresponde es de "+(horas*12)+" euros");
            sc.close();
        }
    }
}
