// Encontrar todos los multiplos de 3 y 5 hasta 1000 y luego sumar todos juntos.
public class MultiplesSum {
    public static void main(String[] args) {
        int limit = 1000;
        int sum = 0;

        for (int i = 1; i < limit; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }

        System.out.println("La suma de los múltiplos de 3 y 5 por debajo de " + limit + " es: " + sum);
    }
}
