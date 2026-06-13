package Herança;
import Herança.Animais.Animal;
import Herança.Animais.Aves;
public class Ponbo extends Aves{
    private int cartas_enviadas;
    
    public Ponbo(String nome){
        super(nome);//aqui super erda o metodo contrutor que é animal que é da classe ANIMAL.
        cartas_enviadas = 10;
    }   

    public void fazer_pru(){
        System.out.println("o pombo " + getanimal() + " fez Pruuuhh");
    }

    public void enviar_cartas(){
        System.out.println("a " + getanimal() + " entregou sua carta");
        this.cartas_enviadas ++;
    }

}

