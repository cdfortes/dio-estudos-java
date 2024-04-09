package equipamento;
import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{
    

  
    public void tocarMusica() {
       
        System.out.println("Tocando música: ");
       
    }


    public void pausarMusica() {
        
        System.out.println("Pausando música");
       
    }


    public void selecionarMusica() {
        
        System.out.println("Selecionando música");
     
    }


    @Override
    public void exibirPagina() {
        System.out.println("exibirPagina");
    }


    @Override
    public void adicionarAba() {
        System.out.println("adicionar nova Aba ");
    }


    @Override
    public void atualizarPagina() {
        System.out.println("atualizarPagina ");
    }


    @Override
    public void ligar() {
        System.out.println("ligar ");
    }


    @Override
    public void atender() {
        System.out.println("atender ");
    }


    @Override
    public void iniciarCorreioVoz() {
        System.out.println("iniciarCorreioVoz ");
    }
}
