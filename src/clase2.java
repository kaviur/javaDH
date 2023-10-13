import java.math.BigInteger;
import java.util.Scanner;

public class clase2 {
    public static void main(String[] args) {
        BigInteger numero = BigInteger.valueOf(1);
        Scanner scanner = new Scanner(System.in);

        while(numero.compareTo(BigInteger.ZERO) != 0){
            System.out.println("Ingrese un número o cero para salir");

//            numero = scanner.nextLong();
//
//            if (esPrimo(numero)) {
//                System.out.println(numero + " es un número primo.");
//            } else {
//                System.out.println(numero + " no es un número primo.");
//            }

            numero = new BigInteger(scanner.nextLine());

            if (esPrimo(numero)) {
                System.out.println(numero + " es un número primo.");
            } else {
                System.out.println(numero + " no es un número primo.");
            }
        }

        scanner.close();
    }

    public static boolean esPrimo(Long numero) {
        // Si el número es menor o igual a 1, no es primo
        if (numero <= 1) {
            return false;
        }

        // Verificamos si el número es divisible por algún valor en el rango de 2 a la raíz cuadrada del número
        for (long i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false; // No es primo
            }
        }

        return true; // Es primo
    }

    //Este método acepta números grandes y pequeños de forma optimizada
    public static boolean esPrimo(BigInteger numero) {
        if (numero.compareTo(BigInteger.ONE) <= 0) {
            return false;
        }

        for (BigInteger i = new BigInteger("2"); i.multiply(i).compareTo(numero) <= 0; i = i.add(BigInteger.ONE)) {
            if (numero.remainder(i).equals(BigInteger.ZERO)) {
                return false;
            }
        }

        return true;
    }
}
