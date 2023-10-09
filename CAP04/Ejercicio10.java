package CAP04;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escriba día: ");
        int día= sc.nextInt();
        sc.nextLine();
        System.out.print("Escriba mes: ");
        String mes= sc.nextLine();
        switch  (mes) {
            case "Enero": 
            if (día<=19) {
                System.out.println("Capricornio");
            } else {
                System.out.println("Acuario");
            }
            break;
            case "Febrero": 
            if (día<=18) {
                System.out.println("Acuario");
            } else {
                System.out.println("Piscis");
            }
            break;
            case "Marzo": 
            if (día<=20) {
                System.out.println("Piscis");
            } else {
                System.out.println("Aries");
            }
            break;
            case "Abril": 
            if (día<=21) {
                System.out.println("Aries");
            } else {
                System.out.println("Tauro");
            }
            break;
            case "Mayo": 
            if (día<=20) {
                System.out.println("Tauro");
            } else {
                System.out.println("Géminis");
            }
            break;
            case "Junio": 
            if (día<=20) {
                System.out.println("Géminis");
            } else {
                System.out.println("Cancer");
            }
            break;
            case "Julio": 
            if (día<=22) {
                System.out.println("Cancer");
            } else {
                System.out.println("Leo");
            }
            break;
            case "Agosto": 
            if (día<=22) {
                System.out.println("Leo");
            } else {
                System.out.println("Virgo");
            }
            break;
            case "Septiembre": 
            if (día<=22) {
                System.out.println("Virgo");
            } else {
                System.out.println("Libra");
            }
            break;
            case "Octubre": 
            if (día<=22) {
                System.out.println("Libra");
            } else {
                System.out.println("Escorpio");
            }
            break;
            case "Noviembre": 
            if (día<=21) {
                System.out.println("Escorpio");
            } else {
                System.out.println("Sagitario");
            }
            break;
            case "Diciembre": 
            if (día<=21) {
                System.out.println("Sagitario");
            } else {
                System.out.println("Capricornio");
            }
            sc.close();
        }
    }
}
