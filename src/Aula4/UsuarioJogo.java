package Aula4;

public class UsuarioJogo {
   private String nome;
   private String nickname;
   private int pontuacao;
   private int nivel;

    public UsuarioJogo(String nome, String nickname) {
        this.nome = nome;
        this.nickname = nickname;
    }

    public void aumentarPontuacao() {
        this.pontuacao++;
    }

    public void subirNivel() {
        this.nivel++;
    }
    public void subirNivel(int valor) {
        this.nivel+=valor;
    }

    public void bonus(int valor) {
        this.pontuacao += valor;
    }

    public void getPontuacao() {
        System.out.println(this.nome + " tenho " + this.pontuacao + " pontos");
    }

    public void getNivel() {
        System.out.println(this.nome + " sou nivel " + this.nivel);
    }
}
