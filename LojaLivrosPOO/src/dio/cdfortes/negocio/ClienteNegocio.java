package dio.cdfortes.negocio;

import java.util.Optional;

import dio.cdfortes.basedados.Banco;
import dio.cdfortes.entidade.Cliente;

public class ClienteNegocio {
    /**
     * {@inheritDoc}.
     */
    private Banco bancoDados;

    /**
     * Construtor.
     * 
     * @param banco Banco de dados para ter acesso aos clientes cadastrados
     */
    public ClienteNegocio(Banco banco) {
        this.bancoDados = banco;
    }

    /**
     * Consulta o cliente pelo seu CPF.
     * 
     * @param cpf CPF de um cliente
     * @return O cliente que possuir o CPF passado.
     */
    public Optional<Cliente> consultar(String cpf) {

        if (bancoDados.getCliente().getCpf().equals(cpf)) {
            return Optional.of(bancoDados.getCliente());
        } else {
            return Optional.empty();
        }
    }

    // TODO Fazer a exclusão de cliente

    // TODO Fazer a inclusão de cliente

}
