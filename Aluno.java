public class Aluno extends Pessoa {

    public Aluno(String nome, int idade, String nacionalidade) {
        super(nome, idade, nacionalidade);
    }

    public void mostrarInfoAluno() {
        // Acessando o atributo protegido diretamente (permitido em subclasses)
        System.out.println("Nacionalidade do aluno: " + nacionalidade);

        // Chamando o método protegido da classe pai
        mostrarNacionalidade();
    }
}
