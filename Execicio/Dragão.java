package Herança;

import Herança.Animais.Aves;

public class Dragão extends Aves{
     public Dragão(String nome){
        super(nome);
     }

     public void fogo(){
        System.out.println("o dragão " + getanimal() + " cuspio fogo");
     }
}
