package CAP04;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba hora");
        int hora = sc.nextInt();
        if((6 < hora )&(hora < 12)){
        System.out.println("Buenos días");}
    
        if((12<hora)&(hora<21)) {
            System.out.println("Buenas tardes");}
        
        if((21<hora<<0)&(0<=hora<<6)) {
            System.out.println("Buenas noches");}
            sc.close();
        if (hora>23) {
            System.out.println("Hora no váilda, escriba otra");
        }
    }
}
