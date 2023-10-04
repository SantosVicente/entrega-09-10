/*
 * Crie uma classe abstrata chamada Animal que tenha os atributos nome, peso e idade, e um método abstrato chamado emitirSom que não receba nenhum parâmetro e não retorne nenhum valor. Crie duas subclasses que herdem de Animal: Cachorro e Gato. A classe Cachorro deve ter um atributo chamado raca, e a classe Gato deve ter um atributo chamado cor. Ambas as classes devem ter um construtor que receba os atributos de Animal e o atributo específico da classe como parâmetros e os inicialize. O método emitirSom de cada classe deve imprimir na tela o som que o animal faz (“Au au” para o cachorro, e “Miau” para o gato). Crie uma classe de teste que instancie um objeto da classe Cachorro com os valores “Rex”, 10, 5 e “Labrador”, e um objeto da classe Gato com os valores “Luna”, 3, 2 e “Branca”. Imprima os atributos de cada objeto usando os métodos get, e invoque o método emitirSom para cada objeto.
 * 
 */

public class Gato extends Animal{
    private String cor;

    public Gato(String nome, int peso, int idade, String cor) {
        super(nome, peso, idade);
        this.cor = cor;
    }

    @Override
    public void emitirSom() {
        System.out.println("Miau");
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
}
