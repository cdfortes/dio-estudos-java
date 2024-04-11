package dio.cdfortes.negocio;

import java.time.LocalDate;
import java.util.List;

import dio.cdfortes.basedados.Banco;
import dio.cdfortes.entidade.Cupom;
import dio.cdfortes.entidade.Pedido;
import dio.cdfortes.entidade.Produto;

public class PedidoNegocio {
    private Banco bancoDados;

    /**
     * Construtor.
     * 
     * @param banco Banco de dados para ter armazenar e ter acesso os pedidos
     */
    public PedidoNegocio(Banco banco) {
        this.bancoDados = banco;
    }

    private double calcularTotal(List<Produto> produtos, Cupom cupom) {

        double total = 0.0;
        for (Produto produto : produtos) {
            total += produto.calcularFrete();
        }

        if (cupom != null) {
            return total * (1 - cupom.getDesconto());
        } else {
            return total;
        }

    }

    /**
     * Salva um novo pedido sem cupom de desconto.
     * 
     * @param novoPedido Pedido a ser armazenado
     */
    public void salvar(Pedido novoPedido) {
        salvar(novoPedido, null);
    }

    /**
     * Salva um novo pedido com cupom de desconto.
     * 
     * @param novoPedido Pedido a ser armazenado
     * @param cupom      Cupom de desconto a ser utilizado
     */
    public void salvar(Pedido novoPedido, Cupom cupom) {

        String codigo = "PE%4d%2d%04d";
        LocalDate hoje = LocalDate.now();
        codigo = String.format(codigo, hoje.getYear(), hoje.getMonthValue(), bancoDados.getPedidos().length);

        novoPedido.setCodigo(codigo);
        novoPedido.setCliente(bancoDados.getCliente());
        novoPedido.setTotal(calcularTotal(novoPedido.getProdutos(), cupom));
        bancoDados.adicionarPedido(novoPedido);
        System.out.println("Pedido cadastrado com sucesso.");
    }

    /**
     * Exclui um pedido a partir de seu código de rastreio.
     * 
     * @param codigo Código do pedido
     */
    public void excluir(String codigo) {

        int pedidoExclusao = -1;
        for (int i = 0; i < bancoDados.getPedidos().length; i++) {

            Pedido pedido = bancoDados.getPedidos()[i];
            if (pedido.getCodigo().equals(codigo)) {
                pedidoExclusao = i;
                break;
            }
        }

        if (pedidoExclusao != -1) {
            bancoDados.removerPedido(pedidoExclusao);
            System.out.println("Pedido excluído com sucesso.");
        } else {
            System.out.println("Pedido inexistente.");
        }
    }

    /**
     * Lista todos os pedidos realizados.
     */
    public void listarTodos() {

        if (bancoDados.getPedidos().length == 0) {
            System.out.println("Não existem pedidos cadastrados");
        } else {

            for (Pedido pedido : bancoDados.getPedidos()) {
                System.out.println(pedido.toString());
            }
        }
    }
}
