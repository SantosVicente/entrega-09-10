import java.util.ArrayList;

public class CarrinhoDeCompras {
  private ArrayList<Produto> produtos;
  
  public CarrinhoDeCompras() {
    this.produtos = new ArrayList<Produto>();
  }

  public void adicionarProduto(Produto produto) {
    this.produtos.add(produto);
  }

  public void removerProduto(int codigo) {
    for (int i = 0; i < this.produtos.size(); i++) {
      if (this.produtos.get(i).getCodigo() == codigo) {
        this.produtos.remove(i);
      }
    }
  }

  public double calcularValorTotal() {
    double valorTotal = 0;
    for (int i = 0; i < this.produtos.size(); i++) {
      valorTotal += this.produtos.get(i).getPreco() * this.produtos.get(i).getQuantidade();
    }
    return valorTotal;
  }
}
