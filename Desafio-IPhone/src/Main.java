import aparelho.IPhone;

public class Main {
    public static void main(String[] args)  {
        IPhone iPhone = new IPhone();

        //Aparelho telefonico
        iPhone.atender("999366568");
        iPhone.ligar("987653215");
        iPhone.correioDeVoz();

        //Reprodutor de música
        iPhone.selecionarMusica("Pagode");
        iPhone.tocar("Pagode");
        iPhone.pausar();

        //Navegador Internet
        iPhone.adicionarPagina();
        iPhone.atualizarPagina();
        iPhone.exibirPagina();
    }
}
