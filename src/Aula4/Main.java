package Aula4;

public class Main {
    public static void main(String[] args) {
        UsuarioJogo jogador1 = new UsuarioJogo("Joao", "joazinho");
        UsuarioJogo jogador2 = new UsuarioJogo("Maria", "mariazinha");


        jogador1.aumentarPontuacao();
        jogador1.subirNivel();
        jogador1.bonus(20);
        jogador1.showNivel();
        jogador1.showPontuacao();

        jogador2.aumentarPontuacao();
        jogador2.subirNivel(5);
        jogador2.bonus(10);
        jogador2.showNivel();
        jogador2.showPontuacao();


    }
}