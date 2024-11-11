import java.util.Scanner;
public class CalculadorSoma {
    public int somar (int[] num){
        int soma = 0;
        for(int i=0; i<num.length;i++)
            soma += num[i];
        return soma;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        CalculadorSoma calc = new CalculadorSoma();
        int[] vetor = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(calc.somar(vetor));
        int[] vetor2 = {1,2,3,4,5,6,7,8};
        System.out.println(calc.somar(vetor2));
        int[] vetor3 = {1,2,3,4,5,6};
        System.out.println(calc.somar(vetor3));
        int[] vetor4 = {1,2,3,4};
        System.out.println(calc.somar(vetor4));
        int[] vetor5 = {1,2};
        System.out.println(calc.somar(vetor5));
        scanner.close();
    }
}
