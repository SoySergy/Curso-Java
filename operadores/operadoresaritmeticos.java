package operadores;

public class operadoresaritmeticos {
    public static void main(String[] args) {

        // Operadores Aritmeticos
        int a = 5;
        int b = 2;
        System.out.println(a + b); // 7
        System.out.println(a - b); // 3
        System.out.println(a * b); // 10
        System.out.println(a / b); // 2
        System.out.println(a % b); //1

        // Asignacion
        // a = b; // Ahora a vale b que es 2
        // System.out.println(a);

        // Asignacion compuesta
        int c = 10;
        int d = 20;

        c += d;
        System.out.println(c); // 30

        c -= d;
        System.out.println(c); // 10

        c *= d;
        System.out.println(c); // 200

        c /= d;
        System.out.println(c); // 10

        c %= d;
        System.out.println(c); // 10

    }
}
