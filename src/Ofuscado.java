import java.io.IOException;
import java.util.Scanner;

/**
 * Clase para explicar el codigo ofuscado
 */

public class Ofuscado {
    public static void imprimir(String mensaje) {
        System.out.println(mensaje);
    }

    /**
     * Métod para calcular el factorial
     * @param numero
     * @return calculo del factorial
     */

    public static int factorial(int numero) {
        if (numero == 0) {
            return 1;
        } else {
            int factorial = 1;
            int valor = numero;
            do {
                factorial *= valor;
                valor--;
            } while
            (valor > 0);
            return factorial;
        }
    }

    /**
     * Método para crear un palindromo
     */

    public static String palindromo(String palabra) {
        String alreves = "";
        int posicion = 0;
        do {
            alreves = palabra.charAt(posicion) + alreves;
            posicion++;
        } while (posicion < palabra.length());
        alreves = palabra + alreves;
        return alreves;
    }


    /**
     * Metodo main para inciar el programa
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        do {
            imprimir("BIENVENIDO AL PROGRAMA OFUSCADO");
            imprimir("-------------------------------");
            imprimir("Elija una opcion:");
            imprimir("1) Factorial");
            imprimir("2) Palindromo");
            imprimir("3) Salir");
            imprimir(">");
            String variable3 = teclado.nextLine();
            opcion = Integer.parseInt(variable3);
            if (opcion == 1) {
                imprimir("Inserte un número:");
                String numero = teclado.nextLine();
                int num = Integer.parseInt(numero);
                int facto = factorial(num);
                imprimir("El resultado es:");
                imprimir("" + facto);
            } else {
                if (opcion == 2) {
                    imprimir("Inserte una palabra:");
                    String palabra = teclado.nextLine();
                    String palin = palindromo(palabra);
                    imprimir("El resultado es:");
                    imprimir("" + palin);
                }
            }
        }
        while (opcion != 3);
        teclado.close();
        System.out.println("Gracias por utilizar mi programa.");
    }
}