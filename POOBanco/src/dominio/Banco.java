package dominio;

import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas;
    private List<Agencia> agencias;
    private List<Cliente> clientes;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public List<Agencia> getAgencias() {
        return agencias;
    }

    public void setAgencias(Agencia agencia) {
        this.agencias.add(agencia);
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void setAgencias(List<Agencia> agencias) {
        this.agencias = agencias;
    }

    public void listarClientes() {
        for (Cliente cliente : clientes) {
            System.out.println(cliente.getNome());
        }
    }

}
