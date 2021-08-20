package Aula6;

public class Main {
    public static void main(String[] args) {
        Adocao cachorro1 = new Adocao("Dog","viralata",5.3,2005);
        Adocao cachorro2 = new Adocao("Dog2","Golden",5.3,2010,true,true);

        System.out.println(cachorro1.getNome());
        System.out.println(cachorro1.getIdade());
        System.out.println(cachorro1.estaAptoAdocao());
        System.out.println("\n");
        System.out.println(cachorro2.getNome());
        System.out.println(cachorro2.getIdade());
        System.out.println(cachorro2.estaAptoAdocao());

    }
}
