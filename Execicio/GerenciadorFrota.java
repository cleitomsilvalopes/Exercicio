import java.util.ArrayList;
public class GerenciadorFrota{
    ArrayList<Veiculos> listasVeiculos = new ArrayList<>();
    public void adicionarVeiculo(Veiculos v){
        listasVeiculos.add(v);
    }
    public void listaVeiculos(){
        for(Veiculos automoveis: listasVeiculos){
            System.out.printf("=-=-=-=-=-=-=-=-=-=-=-=-\nAutomovel: %s \nAltonomia: %.2f\n-=-=-=-=-=-=-=-=-=-=-=-=", automoveis.getmodelo(),automoveis.calcularAltonomia());
        }
    }
}