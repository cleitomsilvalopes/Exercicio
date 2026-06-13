package Herança;

import Herança.Animais.Animal;

public class Gato extends Animal{
    public Gato(String nome){
        super(nome);
    }
   public void miar(){
        System.out.println("o gato " + getanimal() + " miou");
   }
}
