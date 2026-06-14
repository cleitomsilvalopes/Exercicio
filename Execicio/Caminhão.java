public class Caminhão extends Veiculos{
    private double cargaEmToneladas;

    public Caminhão(String placa, String modelo, double capacidadeTanque, double consumoKm, double cargaEmToneladas){
    super(placa, modelo, capacidadeTanque, consumoKm);
    this.cargaEmToneladas = cargaEmToneladas;
    }
    @Override
    public double calcularAltonomia(){
        double autonomia = getcapacidadeTanque() * getconsumoKm();
        if(autonomia < 0){
            return 0;
        }else{
            return autonomia - (cargaEmToneladas - 0.5);
        }
    }
}