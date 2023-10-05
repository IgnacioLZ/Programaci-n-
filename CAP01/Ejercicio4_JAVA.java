/*Ejercicio4_JAVA"*/

public class Ejercicio4_JAVA {
public static void main (String[] args)  {

    System.out.printf (" \033[37m--------------------------------------------------------------------------------  \n");
    System.out.printf("  %-12s | %-10s | %-10s | %-10s | %-10s | %-10s\n", "\033[37m HORARIO", "   \033[37m LUNES", "   \033[37m MARTES", "   \033[37m MIÉRCOLES", "   \033[37m JUEVES", "   \033[37m VIERNES");
    System.out.printf (" --------------------------------------------------------------------------------  \n");  
    System.out.printf("  %-12s  %-10s  %-10s  %-10s  %-10s  %-10s\n", "\033[37m 08:15-09:15", "\033[33m PROG.", "    \033[31m LENG.MARC.", "\033[31m LENG.MARC", " \033[33m PROG.", "      \033[35m FOL");
    System.out.printf("  %-12s  %-10s  %-10s  %-10s  %-10s  %-10s\n", "\033[37m 09:15-10:15", "\033[33m PROG.", "    \033[31m LENG.MARC", " \033[31m LENG.MARC", " \033[33m PROG.", "      \033[35m FOL");
    System.out.printf("  %-12s  %-10s  %-10s  %-10s  %-10s  %-10s\n", "\033[37m 10:15-11:15", "\033[33m PROG.", "    \033[36m BBDD", "      \033[33m PROG.", "     \033[33m PROG.", "      \033[35m FOL");
    System.out.printf("  %-12s  %-10s  %-10s  %-10s  %-10s  %-10s\n", "\033[37m 11:45-12:45", "\033[32m SIST.INF.", "\033[36m BBDD", "      \033[33m PROG.", "     \033[36m BBDD", "       \033[32m SIST.INF");
    System.out.printf("  %-12s  %-10s  %-10s  %-10s  %-10s  %-10s\n", "\033[37m 12:45-13:45", "\033[32m SIST.INF.", "\033[37m ENT.DES", "   \033[36m BBDD", "      \033[36m BBDD", "       \033[32m SIST.INF");
    System.out.printf("  %-12s  %-10s  %-10s  %-10s  %-10s  %-10s\n", "\033[37m 13:45-14:45", "\033[32m SIST.INF.", "\033[37m ENT.DES", "   \033[36m BBDD", "      \033[37m ENT.DES", "     \033[32mSIST.INF");

}
}