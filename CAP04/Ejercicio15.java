package CAP04;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Elija dirección de la pirámide: arriba, abajo, derecha o izquierda.");
        String dirección = sc.nextLine();
        switch (dirección){
            case "arriba": 
            System.out.println("   *   ");
            System.out.println("  ***  ");
            System.out.println(" ***** ");
            break;
            case "abajo": 
            System.out.println(" ***** ");
            System.out.println("  ***  ");
            System.out.println("   *   ");
            break;
            case "izquierda":
            System.out.println("  *");
            System.out.println(" **");
            System.out.println("***");
            System.out.println(" **");
            System.out.println("  *");
            break;
            case "derecha":
            System.out.println(" *  ");
            System.out.println(" ** ");
            System.out.println(" ***");
            System.out.println(" ** ");
            System.out.println(" *  ");

            }
            sc.close();
        }
        }

        
    
