package com.ejercicios;

public class Ejercicio1 {
    public static void main(String[] args) {
        /*
        a. Crea un proyecto de Java desde 0.
        b. Dentro del proyecto tenéis que crear un paquete.
        c. En el paquete tendréis que crear una clase.
        d. Dentro de la clase tenéis que crear el método main.
        e. E imprimir todos los datos que se han visto en las sesiones.
         */

        // Texto

        char caracter = 'm';
        String cadena ="Me gusta la pizza";

        // Enteros

        byte entero1 = 22;
        short entero2 = 44;
        int entero3 = 96;
        long entero4 = 20050616;

        // Decimales

        double decimal1= 16.6;
        float decimal2 = 5.9f;

        // Booleanos

        boolean yes = true;
        boolean no = false;

        System.out.println("Todos los tipos de datos enseñados son: \n");
        System.out.println("- Carácter: " + caracter);
        System.out.println("- Cadena de texto: " + cadena);
        System.out.println("- Byte: " + entero1);
        System.out.println("- Short: " + entero2);
        System.out.println("- Integer: " + entero3);
        System.out.println("- Long: " + entero4);
        System.out.println("- Double: " + decimal1);
        System.out.println("- Flotante: " + decimal2);
        System.out.println("- Boolean con resultado: " + yes);
        System.out.println("- Boolean con resultado: " + no);
    }
}
