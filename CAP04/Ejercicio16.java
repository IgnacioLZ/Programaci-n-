package CAP04;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int cont = 0;
        System.out.println("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.");
        String respuesta1 = sc.nextLine();
        if (respuesta1.equals("verdadero")){
            cont=cont+3;
        }
        System.out.println("2. Ha aumentado sus gastos de vestuario");
        String respuesta2 = sc.nextLine();
        if (respuesta2.equals("verdadero")){
            cont=cont+3;
        }
        System.out.println("3. Ha perdido el interés que mostraba anteriormente por ti");
        String respuesta3 = sc.nextLine();
        if (respuesta3.equals("verdadero")){
            cont=cont+3;
        }
        System.out.println("4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se\r\n" + //
                "arregla el pelo y se asea con más frecuencia (si es mujer)");
                String respuesta4 = sc.nextLine();
        if (respuesta4.equals("verdadero")){
            cont=cont+3;
        }
        System.out.println("5. No te deja que mires la agenda de su teléfono móvil");
        String respuesta5 = sc.nextLine();
        if (respuesta5.equals("verdadero")){
            cont=cont+3;
        }
        System.out.println("6. A veces tiene llamadas que dice no querer contestar cuando estás tú\r\n" + //
                "delante");
                String respuesta6 = sc.nextLine();
        if (respuesta6.equals("verdadero")){
            cont=cont+3;
        }
        System.out.println("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a");
        String respuesta7 = sc.nextLine();
        if (respuesta7.equals("verdadero")){
            cont=cont+3;
        }
        System.out.println("8. Muchos días viene tarde después de trabajar porque dice tener mucho\r\n" + //
                "más trabajo");
                String respuesta8 = sc.nextLine();
        if (respuesta8.equals("verdadero")){
            cont=cont+3;
        }
        System.out.println("9. Has notado que últimamente se perfuma más");
        String respuesta9 = sc.nextLine();
        if (respuesta9.equals("verdadero")){
            cont=cont+3;
        }
        System.out.println("10  . Se confunde y te dice que ha estado en sitios donde no ha ido contigo");
        String respuesta10 = sc.nextLine();
        if (respuesta10.equals("verdadero")){
            cont=cont+3;
        }
        System.out.println(cont);
        if (0<=cont & cont<=10) {
            System.out.println("¡Enhorabuena! tu pareja parece ser totalmente\r\n" + //
                    "fiel.");
        }
        if (11<=cont & cont<=22) {
            System.out.println("Quizás exista el peligro de otra persona en su\r\n" + //
                    "vida o en su mente, aunque seguramente será algo sin importancia. No\r\n" + //
                    "bajes la guardia.");
        }
        if (cont>=23) {
            System.out.println("Tu pareja tiene todos los ingredientes para estar\r\n" + //
                    "viviendo un romance con otra persona. Te aconsejamos que indagues un\r\n" + //
                    "poco más y averigües que es lo que está pasando por su cabeza.");
        }
        sc.close();

        

    }

}
