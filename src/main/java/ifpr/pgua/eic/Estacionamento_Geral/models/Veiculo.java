package ifpr.pgua.eic.Estacionamento_Geral.models;

public class Veiculo {
    private String placa;
    private String modelo;
    private String fabricante;
    private String cor;
    
    public Veiculo(String placa, String modelo, String fabricante, String cor) {
        this.placa = placa;
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.cor = cor;
    }

    public String getplaca() {
        return placa;
    }

    public void setplaca(String placa) {
        this.placa = placa;
    }

    public String getmodelo() {
        return modelo;
    }

    public void setmodelo(String modelo) {
        this.modelo = modelo;
    }

    public String getfabricante() {
        return fabricante;
    }

    public void setfabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getcor() {
        return fabricante;
    }

    public void setcor(String fabricante) {
        this.fabricante = fabricante;
    }

    public String toString(){
        return placa;
    }

    public String getNome() {
        return null;
    }

    public String getTelefone() {
        return null;
    }

    public String getEmail() {
        return null;
    }

    public static void add(Veiculo veiculo) {
    }



}
