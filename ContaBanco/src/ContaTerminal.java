import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("\nPor favor, digite o número da Conta ! ");
        int numero = sc.nextInt();

        System.out.println("Por favor, digite o número da Agência ! ");
        String agencia = sc.next();

        System.out.println("Por favor, digite o valor de deposito ! ");
        double saldo = sc.nextDouble();

        System.out.println("Por favor digite o nome do Titular da Conta ! ");
        String titular = "";

        titular += sc.nextLine();

        System.out.printf(
                "\n \nOlá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque",
                titular, agencia, numero, saldo);

        sc.close();

    }
}
