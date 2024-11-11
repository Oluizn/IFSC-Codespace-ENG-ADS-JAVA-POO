import java.util.Scanner;

public class desafio2 {
    public double converterCelsiusParaFahrenheit(double celsius){
        double fahrenheit = (celsius * 9/5) + 32;
        return fahrenheit;
    }

    public double converterFahrenheitCelsius(double fahrenheit){
        double celsius = (fahrenheit - 32) * 5/9;
        return celsius;
    }

    public int multiplicar (int valorA, int valorB){
        return valorA * valorB;
    }
    public double multiplicar (double valorA, double valorB){
        return valorA * valorB;
    }

    public static void main (String[] args){
        desafio2 temperatura = new desafio2();
        Scanner scanner = new Scanner(System.in);

        int operando = 0;

        while (operando != 9){
            System.out.println("Digite a ação que deseja realizar: ");
            System.out.println("1 - Converter temperatura de celsius para fahrenheit.");
            System.out.println("2 - Converter temperatura de fahrenheit para celsius.");
            System.out.println("3 - Multiplicação de dois numeros inteiros e reais.");
            System.out.println("4 - Explicação sobre a diferença entre método estático e método de instância.");
            System.out.println("9 - Para sair.");
            
            operando = scanner.nextInt();

            switch (operando) {
                case 1:
                    System.out.println("Informe a temperatura em celsius: ");
                    double tempCelsius = scanner.nextInt();
                    System.out.println("\nTemperatura de " + tempCelsius + "º celsius em fahrenheit é: " + temperatura.converterCelsiusParaFahrenheit(tempCelsius) + "\n");
                    break;
                case 2:
                    System.out.println("Insira a temperatura em fahrenheit: ");
                    double tempFahrenheit = scanner.nextInt();
                    System.out.println("\nTemperatura de " + tempFahrenheit + " fahrenheit em celsius é: " + temperatura.converterFahrenheitCelsius(tempFahrenheit) + "º\n");
                    break;
                case 3:
                    desafio2 mult = new desafio2();
                    System.out.println("Resultado da multiplicação 4 x 4 é: " + mult.multiplicar(4, 4));
                    System.out.println("Resultado da multiplicação 4,5 x 4,5 é: " + mult.multiplicar(4.5, 4.5) + "\n");
                    break;
                case 4:
                    System.out.println("\nMétodo Estático: Pertence à classe e pode ser chamado diretamente pelo nome da classe, sem a necessidade de um objeto. Útil para operações que não dependem de dados específicos de uma instância.\n" + //
                                                "\n" + //
                                                "Método de Instância: Pertence a uma instância específica da classe e requer um objeto para ser chamado. Usado para operações que manipulam ou dependem dos dados daquela instância específica\n\n");
                    break;
                case 9:
                    System.out.println("Saindo . . . ");
                    break;
                default:
                    System.out.println("Valor inválido, escolha entre 1 e 2 ou 9 para sair!!");
                    break;
            }
        }
        scanner.close();
    }
    
}
