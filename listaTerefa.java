import java.util.Scanner;

public class listaTerefa {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira a descrição da tarefa: ");
        String tarefa = entrada.nextLine();

        System.out.println("Insira a data limite para a conclusão da tarefa (dia/mes/ano): ");
        String prazo = entrada.nextLine();

        System.out.println("Insira a prioridade da tarefa, sendo 1 - Baixa, 2 - Média, 3 - Alta: ");
        int prioridade = entrada.nextInt();

        System.out.println("Insira o valor a ser cobrado pela tarefa: ");
        float valor = entrada.nextFloat();

        System.out.println("Descrição: " + tarefa + "\nPrazo: " + prazo + "\nPrioridade: " + prioridade + "\nValor cobrado: " + valor);

        entrada.close();
    }
}
