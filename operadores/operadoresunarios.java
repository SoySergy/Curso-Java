package operadores;

public class operadoresunarios {
    public static void main(String[] args) {

        // ---------------------------------------------------------------------
        // 1. SUFIJO (a++) -> El cambio ocurre DESPUÉS de usar la variable
        // ---------------------------------------------------------------------
        int s = 6;
        System.out.println("Sufijo - Valor inicial: " + s); // 6

        s++; // Aumenta en 1 (Equivale a: s = s + 1)
        System.out.println("Sufijo - Después de s++: " + s); // 7

        System.out.println();

        // ---------------------------------------------------------------------
        // 2. PREFIJO (--a) -> El cambio ocurre AL INSTANTE, antes de todo
        // ---------------------------------------------------------------------
        int o = 7;
        System.out.println("Prefijo - Valor inicial: " + o); // 7

        --o; // Resta 1 al instante (Equivale a: o = o - 1)
        System.out.println("Prefijo - Después de --o: " + o); // 6

    }
}