
// Generar un programa en Java segun la secuencia de Fibonacci,
// cuyos valores no excedan los 4 millones. Encontrar los numeros
// pares y sumarlos.

public class Fibonacci {
    public static void main(String[] args) {
        int limite = 4000000;
        int sumaPares = 0;
        int num1 = 1;
        int num2 = 2;

        // Generar la secuencia de Fibonacci
        while (num1 <= limite) {
            // Comprobar si el número es par
            if (num1 % 2 == 0) {
                sumaPares += num1;
            }

            // Calcular el siguiente número de Fibonacci
            int siguiente = num1 + num2;
            num1 = num2;
            num2 = siguiente;
        }

        System.out.println("La suma de los números pares de Fibonacci menores o iguales a 4 millones es: " + sumaPares);
    }
}
