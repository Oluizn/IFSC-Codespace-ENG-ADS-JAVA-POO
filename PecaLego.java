public class PecaLego { // Definindo o escopo da classe
    // Definindo atributos da classe
    String cor;
    String formato;
    int numeroDePinos;

    public void mostrarDetalhes(){ // Funcao que mostra os detalhes da peca, imprime para o usuario
        System.out.println("Peca lego " + cor + " com " + numeroDePinos + " pinos, formato " + formato + ".");
    }

    public void girar(){ // funcao que imprime para o usuario a informacoes que a peca girou
        System.out.println("Peca lego " + cor + " girou 90 graus!");
    }

    // funcao que empilha peca, toma como parametro de entrada a peca que realizara a acao e dps a peca que sofrera a acao
    public void empilharSobre(PecaLego outraPeca){ 
        System.out.println("Peca lego " + this.cor + " foi empilhada sobre a peca Lego " + outraPeca.cor + ".");
    } // this e uma ferramenta para referenciar a instancia atual da classe, 
    // neste caso, quando chamado na funcao principal, 
    // pegara a informacao que esta contida no atributo cor do objeto usado.
    // this ira se referenciar a peca que esta realizando a acao.

    // outraPeca foi definido como o objeto que sofrera a acao, portanto, 
    // quando chamado o objeto, sera referenciado a instancia atual 
    // do atributo informado, nesse caso a cor atual do objeto.
    // neste caso foi definido como "outraPeca" o elemento que 
    // ira referenciar o objeto que esta sofrente a acao.

    public static void main(String[] args){
        // Criando objetos (peca Lego reais)
        PecaLego pecaVermelha = new PecaLego();
        PecaLego pecaAzul = new PecaLego();
        PecaLego pecaBranca = new PecaLego();

        // Definindo caracteristicas da peca vermelha
        pecaVermelha.cor = "Vermelha";
        pecaVermelha.formato = "Quadrada";
        pecaVermelha.numeroDePinos = 6;

        // Definindo caracteriscas da peca azul
        pecaAzul.cor = "Azul";
        pecaAzul.formato = "Oval";
        pecaAzul.numeroDePinos = 4;

        // Definindo caracteristicas da peca branca
        pecaBranca.cor = "Branca";
        pecaBranca.formato = "Triangular";
        pecaBranca.numeroDePinos = 3;

        // Fazendo as pecas realizarem acoes
        pecaVermelha.mostrarDetalhes();
        pecaVermelha.girar();

        pecaAzul.mostrarDetalhes();
        pecaAzul.girar();

        pecaBranca.mostrarDetalhes();
        pecaBranca.girar();
        
        // Chamando o metodo (funcao) que ira realizar a acao conjunta dos objetos, 
        // sendo pecaVermelha o objeto que realizara a acao.
        // e pecaBranca o objeto que sofrera a acao
        pecaVermelha.empilharSobre(pecaBranca);
        // pecaAzul realizara a acao e pecaVermelha sofrera a acao
        pecaAzul.empilharSobre(pecaVermelha);

        // Por fim teriamos uma pilha comecando com a pecaAzul, 
        // em seguida pecaVermelha e por fim pecaBranca
    }
 }