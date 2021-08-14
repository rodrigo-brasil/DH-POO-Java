package Aula3;

import java.util.Scanner;

public class Jokenpo {

    public static int whichWin(String maojogador1, String maojogador2) {
        String maos = maojogador1 + maojogador2;
        if (maojogador1 == maojogador2) {
            System.out.println("Empate!");
            return 0;
        } else if (maos.equals("13") || maos.equals("21") || maos.equals("32")) {
            return 1;
        } else
            return 2;
    }

    public static void main(String[] args) {

        String nomeJogador1, nomeJogador2;
        String maoJogador1 = "", maoJogador2 = "";
        String input = "";
        int pontosJogador1 = 0;
        int pontosJogador2 = 0;
        int quemJoga = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome do jogador 1: ");
        nomeJogador1 = entrada.nextLine();
        System.out.print("Digite o nome do jogador 2: ");
        nomeJogador2 = entrada.nextLine();

        while (!input.equals("*")) {
            int ganhador = 0;
            String jogadorAtual = (quemJoga % 2 == 0) ? nomeJogador1 : nomeJogador2;
            System.out.print(jogadorAtual + " digite [1] para Pedra, [2] para Papel ou [3] para Tesoura: ");
            input = entrada.next();
            if (input.equals("*")) {
                System.out.println("Jogo terminou");
                System.out.println(nomeJogador1+":"+ pontosJogador1 + " | " + nomeJogador2+":"+ pontosJogador2);
                continue;
            }
            if (quemJoga % 2 == 0) {
                maoJogador1 = input;

            } else {
                maoJogador2 = input;
                ganhador = whichWin(maoJogador1, maoJogador2);
            }

            if (ganhador == 1) {
                pontosJogador1++;
                System.out.println(nomeJogador1 + " Ganhou! Pontos:" + pontosJogador1);
            }

            if (ganhador == 2) {
                pontosJogador2++;
                System.out.println(nomeJogador2 + " Ganhou! Pontos:" + pontosJogador2);
            }
            quemJoga++;
        }
    }
}
