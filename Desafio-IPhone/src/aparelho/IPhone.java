package aparelho;

import InterfaceAparelhos.AparelhoTelefonico;
import InterfaceAparelhos.NavegadorInternet;
import InterfaceAparelhos.ReprodutorMusica;

public class IPhone implements AparelhoTelefonico, ReprodutorMusica, NavegadorInternet{

    
    public void adicionarPagina() {
        System.out.println("Página adicionada");
        
    }

    
    public void atualizarPagina() {
        System.out.println("Página atualizada!");
    }

    public void exibirPagina() {
        System.out.println("Página exibida!");
    }

    
    public void tocar(String musica) {
       System.out.println("Tocando música: " + musica);
    }

    
    public void pausar() {
       System.out.println("Música pausada!");
    }

    
    public void selecionarMusica(String musica) {
       System.out.println(musica + " selecionada!");
    }

    
    public void ligar(String telefone) {
        System.out.println("Ligando para " + telefone);
    }

    
    public void atender(String telefone) {
       System.out.println("Atendendo a ligação de "+ telefone);
    }

    
    public void correioDeVoz() {
        System.out.println("Reproduzindo correio de voz");
    }
    
}
