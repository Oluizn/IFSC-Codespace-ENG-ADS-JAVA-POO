import java.util.Scanner;

public class HexadecimalConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Recebe o número hexadecimal inicial
        System.out.print("Digite o número hexadecimal inicial: ");
        String hexStart = scanner.nextLine();

        // Converte o número hexadecimal inicial para decimal
        int startValue = Integer.parseInt(hexStart, 16);

        // Recebe o número hexadecimal final
        System.out.print("Digite o número hexadecimal final: ");
        String hexEnd = scanner.nextLine();

        // Converte o número hexadecimal final para decimal
        int endValue = Integer.parseInt(hexEnd, 16);

        // Calcula o tamanho do vetor com base na quantidade de incrementos
        int arraySize = endValue - startValue + 1;
        String[] hexArray = new String[arraySize];

        System.out.println("\nValores incrementados (Decimal -> Hexadecimal):");

        // Armazena os valores incrementados no vetor
        for (int i = 0; i < arraySize; i++) {
            int decimalValue = startValue + i;
            String hexValue = Integer.toHexString(decimalValue).toUpperCase();
            hexArray[i] = hexValue;
            System.out.println("Decimal: " + decimalValue + " -> Hexadecimal: " + hexValue);
        }
        scanner.close();
    }
}
