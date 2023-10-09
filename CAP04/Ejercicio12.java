package CAP04;

import java.util.Scanner;


public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Responda con un SÍ o NO a las siguientes cuestiones: ");
        System.out.println("¿Es Java un lenguaje compilado?");
        String respuesta1=sc.nextLine();
        int cont = 1;
        if (respuesta1.equals("si")){ 
        System.out.println("Correcto");
        }  else {
            System.out.println("Incorrecto");
        }
        System.out.println("¿Es Java un lenguaje interpretado?");
        String respuesta2=sc.nextLine();
        if (respuesta2.equals("si")){ 
        System.out.println("Correcto");
        cont++;     
        }  else {
            System.out.println("Incorrecto");
        }
        System.out.println("¿Es un algoritmo, un conjunto de programas?");
        String respuesta3=sc.nextLine();
        if (respuesta3.equals("no")){ 
        System.out.println("Correcto");
        cont++;     
        }  else {
            System.out.println("Incorrecto");
        }
        System.out.println("¿Es la algorítmica la ciencia que estudia los algoritmos?");
        String respuesta4=sc.nextLine();
        if (respuesta4.equals("no")){ 
        System.out.println("Correcto");
        cont++;     
        }  else {
            System.out.println("Incorrecto");
        }
        System.out.println(" En la arquitectura de Von Neumann, el lugar donde se realizan las operaciones es en la Unidad de control");
        String respuesta5=sc.nextLine();
        if (respuesta5.equals("no")){ 
        System.out.println("Correcto");
        cont++;     
        }  else {
            System.out.println("Incorrecto");
        }
        System.out.println("Ha tenido "+cont+" de 5 preguntas correctas");
        sc.close();
}
}
