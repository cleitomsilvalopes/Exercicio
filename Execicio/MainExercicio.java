
import javax.swing.JOptionPane;
public class MainExercicio{
    public static void main(String[] args){
        while(true){
            String placa = JOptionPane.showInputDialog(null, "Informe a placa", "Adicionando placa", JOptionPane.QUESTION_MESSAGE);
            String modelo = JOptionPane.showInputDialog(null, "Informe o modelo: ", "Modelo", JOptionPane.QUESTION_MESSAGE);
            double capacidadeDoTanque = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a capacidade de litros no tanque:", "Capacidade Maxima Do Tanque", JOptionPane.QUESTION_MESSAGE));
            double consumo_por_km = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe quantos km faz por litro: ", "Consumo quilometrado", JOptionPane.QUESTION_MESSAGE));
            String saida = JOptionPane.showInputDialog(null, "Deseja adicionar mais carros ? ", "Adicionar automoveis", JOptionPane.QUESTION_MESSAGE);
            
            if(saida.equalsIgnoreCase("não")){
                break;
            }
        }
        Carro carro = new Carro(placa, modelo, capacidadeDoTanque, consumo_por_km);
    }
} 