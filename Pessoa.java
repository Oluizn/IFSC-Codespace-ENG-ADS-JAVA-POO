public class Pessoa {
    // Atributo público: acessível de qualquer lugar
    public String nome;

    // Atributo privado: acessível apenas dentro da própria classe
    private int idade;

    // Atributo protegido: acessível dentro da classe, no mesmo pacote e em subclasses
    protected String nacionalidade;

    // Construtor público: acessível de qualquer lugar
    public Pessoa(String nome, int idade, String nacionalidade) {
        this.nome = nome;
        this.idade = idade;
        this.nacionalidade = nacionalidade;
    }

    // Método público: pode ser chamado de qualquer lugar
    public void mostrarNome() {
        System.out.println("Nome: " + nome);
    }

    // Método privado: apenas acessível dentro da própria classe
    private void mostrarIdade() {
        System.out.println("Idade: " + idade);
    }

    // Método protegido: acessível na classe, em subclasses e no mesmo pacote
    protected void mostrarNacionalidade() {
        System.out.println("Nacionalidade: " + nacionalidade);
    }

    // Método público para mostrar todos os dados, incluindo o método privado
    public void mostrarDados() {
        mostrarNome();
        mostrarIdade(); // Método privado pode ser acessado internamente
        mostrarNacionalidade();
    }
}
