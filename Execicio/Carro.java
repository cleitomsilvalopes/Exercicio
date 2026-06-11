public class Carro extends Veiculos{
    private int quantidadePassageiros;

    public Carro(String placa, String modelo, double capacidadeTanque, double consumoKm, int quantidadePassageiros){
        super(placa, modelo, capacidadeTanque, consumoKm);
        this.quantidadePassageiros = quantidadePassageiros;
        System.out.println("placa: " + placa + "\nModelo: " + modelo + "\nCapacidade de tanque: " + capacidadeTanque + "\nConsumo: " + consumoKm + "\nCapacidade de passageiros: " + quantidadePassageiros);
    }
}