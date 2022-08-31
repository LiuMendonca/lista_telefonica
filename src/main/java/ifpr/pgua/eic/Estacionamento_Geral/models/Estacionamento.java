package ifpr.pgua.eic.Estacionamento_Geral.models;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.RootPaneContainer;

public class Estacionamento {

    private String nome;
    private String telefone;
    private ArrayList<Veiculo>veiculo;

    public Estacionamento(){
        veiculo = new ArrayList<>();
    }

    public static boolean adicionarVeiculo(String nome, String telefone){
        
        if(buscar(nome) == null){
            Veiculo veiculo;
            veiculo.add(veiculo);
            return true;
        }
        return false;
    }

    private static Object buscar(String nome2) {
        return null;
    }

    public boolean adicionarVeiculo(String placa, String modelo, String fabricante, String cor) {
        return false;
    }

    public static Veiculo getVeiculo() {
        return null;
    }

}