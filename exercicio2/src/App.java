public class App {
    public static void main(String[] args) throws Exception {
        Cachorro cachorro = new Cachorro("Rex", 10, 5, "Labrador");
        Gato gato = new Gato("Luna", 3, 2, "Branca");

        System.out.println();
        
        System.out.println("Cachcorro:\n");
        System.out.println("Nome: " + cachorro.getNome());
        System.out.println("Peso: " + cachorro.getPeso());
        System.out.println("Idade: " + cachorro.getIdade());
        System.out.println("Raça: " + cachorro.getRaca());
        System.out.print(cachorro.getNome() + " disse: ");
        cachorro.emitirSom();
        
        System.out.println("\n\nGato:\n");
        System.out.println("Nome: " + gato.getNome());
        System.out.println("Peso: " + gato.getPeso());
        System.out.println("Idade: " + gato.getIdade());
        System.out.println("Cor: " + gato.getCor());
        System.out.print(gato.getNome() + " disse: ");
        gato.emitirSom();

        System.out.println();
    }
}
