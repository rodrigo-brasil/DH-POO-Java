package Aula4;

public class Main {
    public static void main(String[] args) {
        UsuarioJogo jogador1 = new UsuarioJogo("Joao","joazinho");
        UsuarioJogo jogador2 = new UsuarioJogo("Maria","mariazinha");

        jogador1.aumentarPontuacao();
        jogador1.subirNivel();
        jogador1.bonus(20);
        jogador1.getNivel();
        jogador1.getPontuacao();

        jogador2.aumentarPontuacao();
        jogador2.subirNivel();
        jogador2.bonus(10);
        jogador2.getNivel();
        jogador2.getPontuacao();
    }
}
