import dominio.Agencia;
import dominio.Banco;
import dominio.Cliente;
import dominio.Conta;
import dominio.ContaCorrente;
import dominio.ContaPoupanca;

public class Main {
    public static void main(String[] args) throws Exception {
        Banco BCA = new Banco();
        BCA.setNome("BCA");

        Agencia agencia = new Agencia("Agencia01", BCA, 1);
        Agencia agencia2 = new Agencia("Agencia02", BCA, 2);

        Cliente carlos = new Cliente("Carlos", "123456", "Ponta do Sol", "342342349", "cdfortes");

        Conta cc = new ContaCorrente(carlos, agencia);
        Conta poupanca = new ContaPoupanca(carlos, agencia);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        BCA.getClientes();

    }
}
