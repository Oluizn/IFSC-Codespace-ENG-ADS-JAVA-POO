import java.util.Scanner;

public class Desafio4 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int operador = 137;

        while (operador !=0) {
            System.out.println("Menu: Digite a opção desejada: ");
            System.out.println("1- Conversor de números");
            System.out.println("2- Verificador de caracteres");
            System.out.println("0- Sair");

            operador = entrada.nextInt();

            switch(operador){
                case 1:
                    System.out.println("Digite um número inteiro: ");
                    int valor = entrada.nextInt();

                    System.out.println("Valor em binário: " + Integer.toBinaryString(valor));
                    System.out.println("Valor em octal: " + Integer.toOctalString(valor));
                    System.out.println("Valor em decimal: " + valor);
                    System.out.println("Valor em hexadecimal: " + Integer.toHexString(valor));
                    
                    break;
                case 2:
                    System.out.println("Digite um caracter: ");
                    char letra = entrada.next().charAt(0);

                    System.out.println("É letra?");
                    if(Character.isLetter(letra)){
                        System.out.println("True");
                    }
                    else{
                        System.out.println("False");
                    }
                    System.out.println("É digito?");
                    if (Character.isDigit(letra)){
                        System.out.println("True");
                    }
                    else{
                        System.out.println("False");
                    }
                    System.out.println("É um espaço em branco?");
                    if(Character.isWhitespace(letra)){
                        System.out.println("True");
                    }
                    else{
                        System.out.println("False");
                    }
                    System.out.println("É um caracter maiúsculo?");
                    if (Character.isUpperCase(letra)){
                        System.out.println("True");
                    }
                    else{
                        System.out.println("False");
                    }
                    System.out.println("É um caracter minúsculo?");
                    if(Character.isLowerCase(letra)){
                        System.out.println("True");
                    }
                    else{
                        System.out.println("False");
                    }
                    break;
                case 0:
                    System.out.println("Saindo.....");
                    System.exit(0);
                default:
                    System.out.println("Valor inválido, digite os valores do menu");
                    break;
            } 
        }
        entrada.close();
    }
}