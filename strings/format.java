package strings;

public class format {
    public static void main (String[] main)
    {
/**
 * String.format() — chuleta rápida
 * ------------------------------------------------------------
 * Símbolo | Tipo                              | Ejemplo
 * ------------------------------------------------------------
 *   %s    | String (objeto, usa .toString())  | %s → "Brais"
 *   %d    | Entero (int, long)                | %d → 37
 *   %f    | Decimal (float, double)           | %f → 3.140000
 *   %c    | Carácter                          | %c → 'a'
 *   %b    | Boolean                           | %b → true
 *   %n    | Salto de línea (portable)         |
 *   %%    | Un % literal                      |
 * ------------------------------------------------------------
 */

// Ejemplo de uso:
        String name = "Sergio";
        int age = 23;

        System.out.println(String.format("Hola, me llamo %s. Tengo %d años.", name, age));
    }
}
