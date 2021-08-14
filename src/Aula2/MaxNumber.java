package Aula2;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o Numero 1");
        int number1 = entrada.nextInt();

        System.out.println("Digite o Numero 2");
        int number2 = entrada.nextInt();

        System.out.println("Digite o Numero 3");
        int number3 = entrada.nextInt();

        int maxnumber = Math.max(number1,number2);

        maxnumber = Math.max(maxnumber,number3);

        System.out.println(maxnumber);

    }
}
