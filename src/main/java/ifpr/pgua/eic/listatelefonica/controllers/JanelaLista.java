package ifpr.pgua.eic.listatelefonica.controllers;

import ifpr.pgua.eic.listatelefonica.App;
import ifpr.pgua.eic.listatelefonica.models.Estacionamento;
import ifpr.pgua.eic.listatelefonica.models.Veiculo;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 * Tela para mostar a lista de Veiculos.
 */
public class JanelaLista {

    private HBox root;

    private ListView<Veiculo> ltvVeiculos;
    
    private TextArea taDetalhes;

    private Button btVoltar;

    private Estacionamento listaTelefonica;

    public JanelaLista(Estacionamento listaTelefonica){
        this.listaTelefonica = listaTelefonica;
        inicializaComponentes();
        carregaDados();
    }

    private void inicializaComponentes(){
        
        ltvVeiculos = new ListView<>();
        ltvVeiculos.setOnMouseClicked(this::mostraDetalhes);
        
        taDetalhes = new TextArea();
        taDetalhes.setPrefWidth(200.0);

        btVoltar = new Button("Voltar");
        btVoltar.setOnAction(this::voltar);


        VBox box = new VBox();
        box.setSpacing(10.0);

        box.getChildren().addAll(ltvVeiculos,btVoltar);

        root = new HBox();
        root.setSpacing(10.0);
        root.setPadding(new Insets(20));
        root.getChildren().addAll(box,taDetalhes);
    }


    private void carregaDados(){
        ltvVeiculos.getItems().clear();
        ltvVeiculos.getItems().addAll(Estacionamento.getVeiculo());
    }


    private void mostraDetalhes(MouseEvent evento){
        taDetalhes.clear();
        
        
        Veiculo Veiculo = ltvVeiculos.getSelectionModel().getSelectedItem();

        
        if(Veiculo != null){
            taDetalhes.appendText("Nome: "+Veiculo.getNome()+"\n");
            taDetalhes.appendText("Telefone: "+Veiculo.getTelefone()+"\n");
        }
    }

    public Parent getRoot(){
        return root;
    }

    private void voltar(ActionEvent evento) {
        App.popScreen();
    }

}
