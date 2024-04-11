package dio.cdfortes.utilidade;

import java.util.Optional;
import java.util.Scanner;

import dio.cdfortes.basedados.Banco;
import dio.cdfortes.entidade.Caderno;
import dio.cdfortes.entidade.Cupom;
import dio.cdfortes.entidade.Livro;
import dio.cdfortes.entidade.Pedido;
import dio.cdfortes.entidade.Produto;
import dio.cdfortes.entidade.contantes.Genero;
import dio.cdfortes.entidade.contantes.Materias;
import dio.cdfortes.negocio.ProdutoNegocio;

public final class LeitoraDados {
    /**
     * Classe do Java para manipular entradas via teclado.
     */
    private static Scanner scanner;

    static {
        scanner = new Scanner(System.in);
    }

    /**
     * Ler um dado específico
     * 
     * @return Dado lido
     */
    public static String lerDado() {

        String texto = scanner.nextLine();

        return texto;
    }

    /**
     * Ler os dados do livro a ser cadastrado.
     * 
     * @return Um livro a partir dos dados de entrada
     */
    public static Livro lerLivro() {

        System.out.println("Cadastrando livro...");
        Livro livro = new Livro();

        System.out.println("Digite o nome");
        String nome = lerDado();
        livro.setNome(nome);

        System.out.println("Digite o gênero: DRAMA, SUSPENSE, ROMANCE");
        String genero = lerDado();
        livro.setGenero(Genero.valueOf(genero.toUpperCase()));

        System.out.println("Digite o preço(padrão 0.0)");
        String preco = lerDado();
        livro.setPreco(Double.parseDouble(preco));

        return livro;
    }

    /**
     * Ler os dados do caderno a ser cadastrado.
     * 
     * @return Um caderno a partir dos dados de entrada
     */
    public static Caderno lerCaderno() {

        System.out.println("Cadastrando caderno...");
        Caderno caderno = new Caderno();

        System.out.println("Digite a quantidade de matérias: M2, M5, M10");
        String materias = lerDado();
        caderno.setTipo(Materias.valueOf(materias.toUpperCase()));

        System.out.println("Digite o preço(padrão 0.0)");
        String preco = lerDado();
        caderno.setPreco(Double.parseDouble(preco));

        return caderno;
    }

    /**
     * Ler os dados do pedido e retorna um objeto a partir destes.
     * 
     * @return Um pedido a partir dos dados de entrada
     */
    public static Pedido lerPedido(Banco banco) {

        ProdutoNegocio produtoNegocio = new ProdutoNegocio(banco);

        System.out.println("Cadastrando pedido...");
        Pedido pedido = new Pedido();

        String opcao = "s";
        do {

            System.out.println("Digite o código do produto(livro/Caderno)");
            String codigo = lerDado();

            Optional<Produto> resultado = produtoNegocio.consultar(codigo);
            if (resultado.isPresent()) {

                Produto produto = resultado.get();

                System.out.println("Digite a quantidade");
                String quantidade = lerDado();
                produto.setQuantidade(Integer.parseInt(quantidade));

                pedido.getProdutos().add(produto);
            } else {
                System.out.println("Produto inexistente. Escolha um produto válido");
            }

            System.out.println("Deseja selecionar mais um produto? s/n");
            opcao = lerDado();
        } while ("s".equals(opcao));

        return pedido;
    }

    /**
     * Ler os dados do cupom e retorna um objeto a partir destes.
     * 
     * @return O cupom a partir dos dados de entrada
     */
    public static Optional<Cupom> lerCupom(Banco banco) {

        System.out.println(
                "Caso queira utilizar algum cupom escolha entre: CUPOM2, CUPOM5, CUPOM7. Se não desejar, deixe em branco.");

        String desconto = lerDado();

        for (Cupom cupom : banco.getCupons()) {
            if (cupom.getCodigo().equalsIgnoreCase(desconto)) {
                return Optional.of(cupom);
            }
        }

        return Optional.empty();
    }
}
