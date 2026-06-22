package introduccion;

public class datosprimitivos {
    public static void main(String[] args) {

        // Tipos de Datos Primitivos

        // int , numeros enteros (32 bits, -2,147,483,648 a 2,147,483,647)
        int Numero = 1;
        System.out.println(Numero);

        // double , numeros con decimales (64 bits)
        double NumeroDecimal = 21.23;
        System.out.println(NumeroDecimal);

        // char , caracter (16 bits, un solo carácter Unicode)
        char Caracter = 'S';
        System.out.println(Caracter);

        // boolean , true or false
        boolean Booleano = true;
        System.out.println(Booleano);

        // byte , numeros enteros pequeños (8 bits, -128 a 127)
        byte NumeroByte = 100;
        System.out.println(NumeroByte);

        // short , numeros enteros cortos (16 bits, -32,768 a 32,767)
        short NumeroShort = 30000;
        System.out.println(NumeroShort);

        // long , numeros enteros grandes (64 bits, -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807)
        long NumeroLong = 9000000000L;
        System.out.println(NumeroLong);

        // float , numeros con decimales de precision simple (32 bits)
        float NumeroFloat = 5.75f;
        System.out.println(NumeroFloat);

    }
}