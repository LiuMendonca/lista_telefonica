package ifpr.pgua.eic.Estacionamento_Geral;

import ifpr.pgua.eic.Estacionamento_Geral.controllers.JanelaCadastro;
import ifpr.pgua.eic.Estacionamento_Geral.controllers.JanelaLista;
import ifpr.pgua.eic.Estacionamento_Geral.controllers.JanelaPrincipal;
import ifpr.pgua.eic.Estacionamento_Geral.models.Estacionamento;
import ifpr.pgua.eic.Estacionamento_Geral.utils.BaseAppNavigator;
import ifpr.pgua.eic.Estacionamento_Geral.utils.ScreenRegistryFXML;
import ifpr.pgua.eic.Estacionamento_Geral.utils.ScreenRegistryNoFXML;

/**
 * JavaFX App
 */
public class App extends BaseAppNavigator {

    private Estacionamento listaTelefonica;

    @Override
    public void init() throws Exception {
        super.init();

        listaTelefonica = new Estacionamento();
    }

    @Override
    public String getHome() {
        return "PRINCIPAL";
    }

    @Override
    public String getAppTitle() {
        return "Lista Telefônica Teste";
    }

    @Override
    public void registrarTelas() {
        registraTela("PRINCIPAL", new ScreenRegistryNoFXML(o->new JanelaPrincipal().getRoot()));
        registraTela("CADASTRO", new ScreenRegistryNoFXML(o->new JanelaCadastro(listaTelefonica).getRoot()));
        registraTela("LISTA", new ScreenRegistryNoFXML(o->new JanelaLista(listaTelefonica).getRoot()));
        
    }
}