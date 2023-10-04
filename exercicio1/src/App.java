public class App {
    public static void main(String[] args) throws Exception {
        Aluno aluno1 = new Aluno("João", 18, 'M', "1234");
        Aluno aluno2 = new Aluno("Maria", 19, 'F', "5678");
    
        System.out.println("Aluno 1:\n");
        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Idade: " + aluno1.getIdade());
        System.out.println("Sexo: " + aluno1.getSexo());
        System.out.println("Matricula: " + aluno1.getMatricula());

        System.out.println("\nAluno 2:\n");
        System.out.println("Nome: " + aluno2.getNome());
        System.out.println("Idade: " + aluno2.getIdade());
        System.out.println("Sexo: " + aluno2.getSexo());
        System.out.println("Matricula: " + aluno2.getMatricula());
    }
}
