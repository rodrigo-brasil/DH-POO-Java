package Aula2;

import java.util.Scanner;

public class NumeroPrimo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o Numero");
        int number = entrada.nextInt();
        System.out.println(isPrime(number));

    }

    public static boolean isPrime(int number) {
        int divisores = 0;
        for (int j = number; j > 0; j--) {
            if (number % j == 0)
                divisores++;
        }
        if (divisores > 2)
            return false;
        else
            return true;
    }

}
