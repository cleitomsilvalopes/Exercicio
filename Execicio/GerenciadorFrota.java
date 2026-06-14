import java.util.ArrayList;
import javax.swing.JOptionPane; 
import javax.swing.JOptionPane;
public class GerenciadorFrota{
    ArrayList<Veiculos> listasVeiculos = new ArrayList<>();
    public void adicionarVeiculo(Veiculos v){
        listasVeiculos.add(v);
    }
    public void listaVeiculos(){
        for(Veiculos automoveis: listasVeiculos){
            JOptionPane.showMessageDialog(null, "=-=-=-=-=-=-=-=-=-=-=-=-\nAutomovel:" + automoveis.getmodelo() + "\nAltonomia:" + automoveis.calcularAltonomia() + "-=-=-=-=-=-=-=-=-=-=-=-=");
        }
    }
}
