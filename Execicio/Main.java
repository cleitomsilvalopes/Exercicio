package Herança;

public class Main {
    public static void main(String[] args){
        Cachorro cachorro = new Cachorro("fejão");
        cachorro.beber();

        Gato gato = new Gato("fela");
        gato.comer();

        Dragão dragão = new Dragão("banguela");
        dragão.fogo();

        Ponbo pombo = new Ponbo("ponba galega");
        pombo.enviar_cartas();
        pombo.voar();

    }
}
