package dio.cdfortes.entidade;

public class Cliente {

    private String nome;
    private String cpf;

    public Cliente() {

        this.nome = "Cliente Padrão";
        this.cpf = "123456789";

    }

    public Cliente(String nome, String cpf) {

        this.nome = nome;
        this.cpf = cpf;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {

        return "Cliente{ nome = '" + nome + "'}";
    }

}
