public class Caminhão extends Veiculos{
    private double cargaEmToneladas;

    public Caminhão(String placa, String modelo, double capacidadeTanque, double consumoKm, double caragaEmToneladas){
    super(placa, modelo, capacidadeTanque, consumoKm);
    this.cargaEmToneladas = cargaEmToneladas;
    System.out.println("placa: " + placa + "\nModelo: " + modelo + "\nCapacidade de tanque: " + capacidadeTanque + "\nConsumo: " + consumoKm + "\nCapacidade de passageiros: " + cargaEmToneladas);
    }
}