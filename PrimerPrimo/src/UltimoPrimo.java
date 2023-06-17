public class UltimoPrimo {

    public static void main(String[] args) {
        long numero = 600851475143L;
        long ultimoFactorPrimo = calcularUltimoFactorPrimo(numero);
        System.out.println("El último factor primo de " + numero + " es: " + ultimoFactorPrimo);
    }

    public static long calcularUltimoFactorPrimo(long numero) {
        long ultimoFactorPrimo = 1;

        // Dividir el número por 2 para eliminar los factores primos pares
        while (numero % 2 == 0) {
            ultimoFactorPrimo = 2;
            numero /= 2;
        }

        // Buscar factores primos impares
        for (long i = 3; i <= Math.sqrt(numero); i += 2) {
            while (numero % i == 0) {
                ultimoFactorPrimo = i;
                numero /= i;
            }
        }

        // Si el número es primo
        if (numero > 2) {
            ultimoFactorPrimo = numero;
        }

        return ultimoFactorPrimo;
    }
}
