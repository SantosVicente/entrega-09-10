/*
  Crie uma classe chamada Produto que tenha os atributos codigo, nome, preco e 
  quantidade. Crie um construtor que receba esses atributos como parâmetros e os 
  inicialize. Crie também os métodos get e set para cada atributo. Crie uma classe
  chamada CarrinhoDeCompras que tenha um atributo do tipo ArrayList<Produto> 
  chamado produtos. Crie um construtor que inicialize esse atributo como um 
  objeto vazio do tipo ArrayList<Produto>. Crie também os métodos: adicionarProduto,
  que recebe um objeto do tipo Produto como parâmetro e adiciona esse objeto 
  ao atributo produtos; removerProduto, que recebe um código de produto como 
  parâmetro e remove do atributo produtos o objeto que tenha esse código; 
  calcularValorTotal, que não recebe nenhum parâmetro e retorna o valor total
  dos produtos no atributo produtos, somando o preço de cada produto multiplicado
  pela sua quantidade. Crie uma classe de teste que instancie um objeto da classe 
  CarrinhoDeCompras, e adicione a ele três objetos da classe Produto, com os 
  seguintes valores: (1, “Caneta”, 2.00, 5), (2, “Caderno”, 10.00, 2), 
  (3, “Lápis”, 1.00, 10). Imprima o valor total do carrinho de compras usando 
  o método calcularValorTotal. Em seguida, remova o produto com o código 2 
  usando o método removerProduto, e imprima novamente o valor total do carrinho
  de compras.
*/

public class App {
    public static void main(String[] args) throws Exception {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        Produto produto1 = new Produto(1, "Caneta", 2.00, 5);
        Produto produto2 = new Produto(2, "Caderno", 10.00, 2);
        Produto produto3 = new Produto(3, "Lápis", 1.00, 10);

        carrinho.adicionarProduto(produto1);
        carrinho.adicionarProduto(produto2);
        carrinho.adicionarProduto(produto3);

        System.out.println();
        System.out.println("Valor total do carrinho: R$ " + carrinho.calcularValorTotal());
        
        carrinho.removerProduto(2);
        
        System.out.println("Valor total do carrinho: R$ " + carrinho.calcularValorTotal());
        System.out.println();
        
    }
}
