import java.util.Scanner;

public class geradorSerialNumber {

    String numeroHexadecimal_0;
    String numeroHexadecimal_f;
    String[] serialNumber = new String[10000];
    int numeroDecimal_0;
    int numeroDecimal_f;

    public void converter(){
        try {
            // Converte a string hexadecimal para um número decimal (int)
            numeroDecimal_0 = Integer.parseInt(numeroHexadecimal_0, 16);
            numeroDecimal_f = Integer.parseInt(numeroHexadecimal_f, 16);
            for (int i = numeroDecimal_0; i <= numeroDecimal_f; i++){
                int j = 0;
                serialNumber[j] = Integer.toHexString(i);
                j++;
            }
        } catch (NumberFormatException e) {
            System.out.println("Erro: a string não é um número hexadecimal válido.");
        }
    }
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);

        geradorSerialNumber gerador = new geradorSerialNumber();
        System.out.println("Insira o valor inicial: ");
        gerador.numeroHexadecimal_0 = entrada.nextLine();
        System.out.println("Insira o valor final: ");
        gerador.numeroHexadecimal_f = entrada.nextLine();

        if (gerador.numeroDecimal_0 < gerador.numeroDecimal_f) {
            gerador.converter();
        }
        else{
            System.out.println("O valor inicial deve ser menor que o valor final");
        }
        for(int k = 0; k <= (gerador.numeroDecimal_f - gerador.numeroDecimal_0); k++){
            System.out.printf("%s", gerador.serialNumber[k]);
        }
        entrada.close();
    }
}
