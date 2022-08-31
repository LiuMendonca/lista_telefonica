package ifpr.pgua.eic.Estacionamento_Geral.controllers;

import ifpr.pgua.eic.Estacionamento_Geral.App;
import ifpr.pgua.eic.Estacionamento_Geral.models.Estacionamento;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class JanelaCadastro {
    
    private VBox root;
    private Label lbPlaca;
    private TextField tfPlaca;

    private Label lbModelo;
    private TextField tfModelo;

    private Label lbFabricante;
    private TextField tfFabricante;

    private Label lbCor;
    private TextField tfCor;

    private Button btCadastrar;
    private Button btVoltar;

    private Estacionamento estacionamento;

    public JanelaCadastro(Estacionamento estacionamento){
        this.estacionamento = estacionamento;
        inicializaComponentes();
    }

    private void inicializaComponentes(){

        lbPlaca = new Label("Placa: ");
        tfPlaca = new TextField();

        lbModelo = new Label("Modelo:");
        tfModelo = new TextField();

        lbFabricante = new Label("Fabricante:");
        tfFabricante = new TextField();

        lbCor = new Label("Cor:");
        tfCor = new TextField();

        btCadastrar = new Button("Cadastrar");
        btCadastrar.setOnAction(this::cadastrar);

        btVoltar = new Button("Voltar");
        btVoltar.setOnAction(this::voltar);

        HBox botoes = new HBox();
        botoes.getChildren().addAll(btVoltar,btCadastrar);
        botoes.setSpacing(5.0);

        root = new VBox();
        root.setSpacing(5.0);
        root.setPadding(new Insets(20));

        root.getChildren().addAll(lbPlaca,tfPlaca);
        root.getChildren().addAll(lbCor,tfCor);
        root.getChildren().addAll(lbModelo,tfModelo);
        root.getChildren().addAll(lbFabricante,tfFabricante);
        root.getChildren().add(botoes);

    }
    

    public Parent getRoot(){
        return root;
    }
    private void cadastrar(ActionEvent evento){

        /*Pega o texto digitado pelo usuário e armazena em uma variável. */
        String placa = tfPlaca.getText();
        String modelo = tfModelo.getText();
        String fabricante  = tfFabricante.getText();
        String cor = tfCor.getText();

        String msg = "Cadastro realizado!";
        if(!estacionamento.adicionarVeiculo(placa, modelo, fabricante, cor)){
            msg = "Cadastro não realizado!";
        }else{
            limpar();
        }
        Alert alert = new Alert(AlertType.INFORMATION,msg);
        alert.showAndWait();


    }

    private void limpar(){
        tfPlaca.clear();
        tfModelo.clear();
        tfFabricante.clear();
        tfCor.clear();
    }

    private void voltar(ActionEvent evento){
        App.popScreen();
    }


}