package dio.cdfortes.entidade;

public abstract class Produto {

    private String codigo;

    private double preco;

    private int quantidade;

    public Produto() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * Calcula o preço do frete para os produtos comprados. Este cálculo pode
     * variar de acordo com o produto
     * 
     * @return valor do frete para o determinado produto
     */
    public abstract double calcularFrete();

}
