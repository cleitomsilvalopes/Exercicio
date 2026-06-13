
import javax.swing.JOptionPane;
public class MainExercicio{
 
    public static void main(String[] args){
        GerenciadorFrota adicionar = new GerenciadorFrota();
    while(true){
            String categoria = JOptionPane.showInputDialog(null, "Carro ou Caminhão ?", "Identificação", JOptionPane.QUESTION_MESSAGE);

            String placa = JOptionPane.showInputDialog(null, "Informe a placa", "Adicionando placa", JOptionPane.QUESTION_MESSAGE);
            
            String modelo = JOptionPane.showInputDialog(null, "Informe o modelo: ", "Modelo", JOptionPane.QUESTION_MESSAGE);

            double capacidadeDoTanque = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a capacidade de litros no tanque:", "Capacidade Maxima Do Tanque", JOptionPane.QUESTION_MESSAGE));
            
            double consumo_por_km = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe quantos km faz por litro: ", "Consumo quilometrado", JOptionPane.QUESTION_MESSAGE));
            if(categoria.equalsIgnoreCase("carro")){
                int passageiros = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos passageiros: ", "Passageiros", JOptionPane.QUESTION_MESSAGE));
                Carro carro = new Carro(placa.toUpperCase(), modelo, capacidadeDoTanque, consumo_por_km, passageiros);
                adicionar.adicionarVeiculo(carro);
            }else if(categoria.equalsIgnoreCase("caminhão")){
                Double toneladas = Double.parseDouble(JOptionPane.showInputDialog(null, "O caminhão suporta quantas toneladas ? ", "Capacidade em toneladas", JOptionPane.QUESTION_MESSAGE));
                Caminhão caminhão = new Caminhão(placa, modelo, capacidadeDoTanque, consumo_por_km, toneladas);
                adicionar.adicionarVeiculo(caminhão);
            }   
        
            String saida = JOptionPane.showInputDialog(null, "Deseja adicionar mais carros ? ", "Adicionar automoveis", JOptionPane.QUESTION_MESSAGE);
            
            if(saida.equalsIgnoreCase("não")){
                adicionar.listaVeiculos();
                break;
            }
        } 
    }
}