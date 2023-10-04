public abstract class Animal {
    private String nome;
    private int peso;
    private int idade;

    public Animal(String nome, int peso, int idade) {
        this.nome = nome;
        this.peso = peso;
        this.idade = idade;
    }

    public abstract void emitirSom();

    public String getNome() {
        return nome;
    }

    public int getPeso() {
        return peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}