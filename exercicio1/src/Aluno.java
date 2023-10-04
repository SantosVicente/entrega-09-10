public class Aluno extends Pessoa{
    private String matricula;

    public Aluno(String nome, int idade, char sexo, String matricula) {
        super(nome, idade, sexo);

        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Matricula: " + matricula + '\n';
    }
}
