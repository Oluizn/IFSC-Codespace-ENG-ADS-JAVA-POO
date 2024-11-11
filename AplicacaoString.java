public class AplicacaoString {
    public static void main(String[] args) {
        // Declarando e inicializando Strings
        String texto1 = "Antonio";
        String texto2 = "Luiz Neto";
        
        // Concatenando Strings
        String resultadoConcatenacao = texto1 + " " + texto2;
        System.out.println("Meu nome é: " + resultadoConcatenacao);

        // Obtendo o comprimento de uma String
        int comprimento = texto1.length();
        System.out.println("Comprimento de texto1: " + comprimento);

        // Convertendo para letras maiúsculas e minúsculas
        String maiusculo = texto2.toUpperCase();
        String minusculo = texto1.toLowerCase();
        System.out.println("Maiúsculas: " + maiusculo);
        System.out.println("Minúsculas: " + minusculo);

        // Comparando Strings (case-sensitive e ignorando maiúsculas/minúsculas)
        boolean igualCaseSensitive = texto1.equals(texto2);
        boolean igualIgnoreCase = texto1.equalsIgnoreCase(texto2);
        System.out.println("É igual (case-sensitive): " + igualCaseSensitive);
        System.out.println("É igual (ignore case): " + igualIgnoreCase);

        // Verificando se uma String contém outra
        boolean contemPalavra = texto2.contains("Luiz");
        System.out.println("Contém 'Luiz' em texto2: " + contemPalavra);

        // Extraindo parte de uma String (substring)
        String parte = texto1.substring(2, 5);
        System.out.println("Substring de texto1: " + parte);

        // Removendo espaços em branco no início e no fim da String
        String textoComEspacos = "   Espacos extra    ";
        String semEspacos = textoComEspacos.trim();
        System.out.println("Sem espaços nas bordas: '" + semEspacos + "'");

        // Substituindo caracteres
        String substituicao = texto1.replace("Antonio", "Joao");
        System.out.println("Substituição: " + substituicao);

        // Convertendo uma String em um array de caracteres
        char[] caracteres = texto1.toCharArray();
        System.out.print("Array de caracteres de texto1: ");
        for (char c : caracteres) {
            System.out.print(c + " ");
        }
    }
}
