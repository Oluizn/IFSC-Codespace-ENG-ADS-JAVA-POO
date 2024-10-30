public class ExemploClasse { // definir uma nova classe
    // Método estático que pode ser chamado sem criar um objeto
    public static void imprimirMensagem() { // metodo sem objeto, void se refere a uma funcao sem retorno.
        System.out.println("Criando classe sem objeto, aula 3 POO"); // System.out.println para imprimir as informacoes para o usuario
    }

    // Método main onde a execução do programa começa, String[] parametro de inicializacao do metodo principal, esqueleto padrao da maquina virtual java
    public static void main(String[] args) { //
        // Chamando o método estático diretamente pela classe
        ExemploClasse.imprimirMensagem(); // chamando a funcao/metodo criada acima.
    }
}
