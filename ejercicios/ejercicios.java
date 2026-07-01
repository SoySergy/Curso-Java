package ejercicios;

public class ejercicios {
    public static void main (String[] args) {
        String name = "Sergio";
        String lastName = "Velandia";
        int age = 23;

        String completeName = name + " " + lastName;
        System.out.println(completeName);

        System.out.println(name.length());

        System.out.println(name.charAt(0));
        System.out.println(name.charAt(5));

        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        System.out.println(name.contains("Sergio"));


        String formatExample = String.format("Mi nombre es %s, mi apellido es %s y tengo %d años.",name,lastName,age);
        System.out.println(formatExample);

        String stringWithSpaces = "     Hello, this is my code sin spaces ";
        String stringWithoutSpaces = stringWithSpaces.trim();
        System.out.println(stringWithSpaces); // Con espacios
        System.out.println(stringWithoutSpaces); // Sin espacios

        String mensaje = "Estoy aprendiendo metedos de Strings en Java.";
        String mensajeConGuiones = mensaje.replace(" ","-");
        System.out.println(mensajeConGuiones);

        String cadena1 = "Hello";
        String cadena2 = "Hello";
        System.out.println(cadena1.equals(cadena2));

        String example1 = "asdfghjk";
        String example2 = "qwertyuiop";

        System.out.println(example1.length());
        System.out.println(example2.length());

        boolean mismaLongitud =  example1 == example2;
        System.out.println(mismaLongitud);




    }
}
