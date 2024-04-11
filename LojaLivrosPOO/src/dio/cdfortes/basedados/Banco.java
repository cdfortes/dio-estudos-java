package dio.cdfortes.basedados;

import dio.cdfortes.entidade.Cliente;
import dio.cdfortes.entidade.Cupom;
import dio.cdfortes.entidade.Pedido;
import dio.cdfortes.entidade.Produto;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private List<Produto> produtos;

    private List<Pedido> pedidos;

    private List<Cupom> cupons;

    private Cliente cliente;

    public Banco() {

        this.produtos = new ArrayList<>();
        this.pedidos = new ArrayList<>();
        this.cupons = new ArrayList<>();
        this.cliente = new Cliente();

        cupons.add(new Cupom("CUPOM2", 2));
        cupons.add(new Cupom("CUPOM5", 5));
        cupons.add(new Cupom("CUPOM7", 7));

    }

    public Cliente getCliente() {
        return cliente;
    }

    public Cupom[] getCupons() {
        return cupons.toArray(new Cupom[cupons.size()]);
    }

    public Pedido[] getPedidos() {
        return pedidos.toArray(new Pedido[pedidos.size()]);
    }

    public Produto[] getProdutos() {
        return produtos.toArray(new Produto[produtos.size()]);
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void removerProduto(int posicao) {
        produtos.remove(posicao);
    }

    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public void removerPedido(int posicao) {
        pedidos.remove(posicao);
    }

}
