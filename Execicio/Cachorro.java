package Herança;
import Herança.Animais.Animal;

public class Cachorro extends Animal{
    public Cachorro(String nome){
        super(nome);// primeira linha -> contém a chamada do construtor da classe super.
    }
   public void pular(){
    System.out.println("o " + getanimal() + " esta pulando");
    System.out.println();
   } 
}