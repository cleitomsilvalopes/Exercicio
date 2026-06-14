
public class Carro extends Veiculos{
private int quantidadePassageiros;

public Carro(String placa, String modelo, double capacidadeTanque, double consumoKm, int quantidadePassageiros){
    super(placa, modelo, capacidadeTanque, consumoKm);
    this.quantidadePassageiros = quantidadePassageiros;   
    }
    @Override
    public double calcularAltonomia(){
        return getcapacidadeTanque() * getconsumoKm();   
    }
}