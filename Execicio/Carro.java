import javax.swing.JOptionPane;
public class Carro extends Veiculos{
private int quantidadePassageiros;

public Carro(String placa, String modelo, double capacidadeTanque, double consumoKm, int quantidadePassageiros){
    super(placa, modelo, capacidadeTanque, consumoKm);
    this.quantidadePassageiros = quantidadePassageiros;
    //.showMessageDialog(null, "Placa: " + placa + "z\nModelo: " + modelo + "\nCapacidade do Tanque: " + capacidadeTanque + "\nConsumo: " + consumoKm + " \nQuantidade de passageiros: " + quantidadePassageiros);   
    }
    @Override
    public double calcularAltonomia(){
        return getcapacidadeTanque() * getconsumoKm();   
    }
}