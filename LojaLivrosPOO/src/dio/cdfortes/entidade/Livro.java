package dio.cdfortes.entidade;

import dio.cdfortes.entidade.contantes.Genero;

public class Livro extends Produto {

    private String nome;

    private Genero genero;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    @Override
    public double calcularFrete() {
        return (getPreco() * getQuantidade()) * (1 + genero.getFator());
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", genero=" + genero + '\'' +
                ", codigo='" + getCodigo() + '\'' +
                ", preço='" + getPreco() + '\'' +
                '}';
    }

}
