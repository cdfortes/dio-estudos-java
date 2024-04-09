package loja;

import equipamento.Iphone;

public class lojaApple {
    public static void main(String[] args) {
        System.out.println("Loja Apple");

        Iphone iphone = new Iphone();
        iphone.tocarMusica();
        iphone.pausarMusica();
        iphone.selecionarMusica();
        iphone.exibirPagina();
        iphone.adicionarAba();
        iphone.atualizarPagina();
        iphone.ligar();
        iphone.atender();
        

    }
}
