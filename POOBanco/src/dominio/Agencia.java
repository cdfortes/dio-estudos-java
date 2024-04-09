package dominio;

public class Agencia {
    private String nome;
    private Integer numero;
    private Banco banco;

    public Agencia(String nome, Banco banco, Integer numero) {
        this.nome = nome;
        this.numero = numero;
        this.banco = banco;
    }

    public String getNome() {
        return nome;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

}
