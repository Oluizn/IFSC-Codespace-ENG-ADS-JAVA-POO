public class TestePessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", 25, "Brasileira");

        // Acessando o atributo público diretamente
        System.out.println("Nome: " + pessoa.nome);

        // Tentando acessar o atributo privado (isso causará erro de compilação)
        // System.out.println("Idade: " + pessoa.idade); // Erro: idade é privado

        // Acessando o método público
        pessoa.mostrarNome();

        // Tentando acessar o método privado (causará erro de compilação)
        // pessoa.mostrarIdade(); // Erro: mostrarIdade é privado

        // Tentando acessar o método protegido diretamente (pode ou não dar erro)
        // pessoa.mostrarNacionalidade(); // Erro se TestePessoa estiver em outro pacote

        // Acessando todos os dados através de um método público
        pessoa.mostrarDados();
    }
}

