import java.util.ArrayList;
public class GerenciadorFrota{
    ArrayList<Veiculos> listaVeiculos = new ArrayList<>();

    public void adicionarVeiculo(Veiculos v){

    }
    public void listaVeiculos(){
        for(Veiculos automoveis: listaVeiculos){
            System.out.println(automoveis);
            System.out.println(automoveis.calcularAltonomia());
        }
    }
}
