package CAP02;

public class Ejercicio6 {
    public static void main (String[] args) {
        float base = 133.3f;
        float iva = (float)(base*0.1);
        Float total = (float)(base + iva);

        System.out.println("Factura sin IVA: " + base);
        System.out.println("Factura con IVA: " + total);

    }

}
