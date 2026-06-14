public class Veiculos {
    private String placa;
    private String modelo;
    private double capacidadeTanque;
    private double consumoKm;

    public Veiculos(String placa, String modelo, double capacidadeTanque, double consumokm){
        this.placa = placa;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
        this.consumoKm= consumoKm;
    }
     public String getplaca(){
        return placa;
     }
     public void setplaca(String placa){
        this.placa = placa;
     }

     public String getmodelo(){
        return modelo;
     }
     public void setmodelo(String modelo){
        this.modelo = modelo;
     }

     public double getcapacidadeTanque(){
        return capacidadeTanque;
     }
     public void setcapacidadeTanque(double capacidadeTanque){
        this.capacidadeTanque = capacidadeTanque;
     }

     public double getconsumoKm(){
        return consumoKm;
     }
     public void setconsumoKm(double consumo){
        this.consumoKm = consumoKm;
     }
}
