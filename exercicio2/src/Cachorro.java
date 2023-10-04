public class Cachorro extends Animal{
    private String raca;

    public Cachorro(String nome, int peso, int idade, String raca) {
        super(nome, peso, idade);
        this.raca = raca;
    }

    @Override
    public void emitirSom() {
        System.out.println("Au au");
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
    
}
