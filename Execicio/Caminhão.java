import javax.swing.JOptionPane;

public class Caminhão extends Veiculos{
    private double cargaEmToneladas;

    public Caminhão(String placa, String modelo, double capacidadeTanque, double consumoKm, double cargaEmToneladas){
    super(placa, modelo, capacidadeTanque, consumoKm);
    this.cargaEmToneladas = cargaEmToneladas;
    JOptionPane.showMessageDialog(null, "Placa: " + placa + "\nModelo: " + modelo + "\nCapacidade do Tanque: " + capacidadeTanque + "\nConsumo: " + consumoKm + " \nSuporta quantas toneladas: " + cargaEmToneladas);
    }
}
