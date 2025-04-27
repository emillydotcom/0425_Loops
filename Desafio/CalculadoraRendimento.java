// Desafio super dificil de calculadora de rendimentos!!
import java.util.Scanner;

public class CalculadoraRendimento {

    // Cálculo de capitalização simples
    public static double calcularCapitalizacaoSimples(double p, double r, int t) {
        return p * (1 + (r / 100) * t);
    }

    // Cálculo de capitalização composta
    public static double calcularCapitalizacaoComposta(double p, double r, int t) {
        return p * Math.pow((1 + (r / 100)), t);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true; 
        // Variável de controle do loop / boolean - only true or false


        while (continuar) {
            System.out.println("\n--- Calculadora de Rendimento Financeiro ---");

            
            System.out.print("Por favor, digite o valor do investimento inicial (P): ");
            double investimento = scanner.nextDouble();

            System.out.print("Agora, digite a taxa de juros anual (r) (%): ");
            double taxa = scanner.nextDouble();

            System.out.print("Por último, digite o período de investimento (t) em anos: ");
            int tempo = scanner.nextInt();

            scanner.nextLine(); 

            System.out.print("Digite o tipo de capitalização (simples ou composta): ");
            String tipoCapitalizacao = scanner.nextLine().toLowerCase(); 
            // Convertendo p minúsculas p não dar erro dependendo da entrada

            double montante = 0.0;

            // Verificando o tipo de capitalização 
            if (tipoCapitalizacao.equals("simples")) {
                montante = calcularCapitalizacaoSimples(investimento, taxa, tempo);
            } else if (tipoCapitalizacao.equals("composta")) {
                montante = calcularCapitalizacaoComposta(investimento, taxa, tempo);
            } else {
                System.out.println("Tipo de capitalização inválido! Tente novamente.");
                continue; 
            }

            
            System.out.printf("Montante final após %d anos: R$ %.2f\n", tempo, montante);

            
            System.out.print("\nVocê deseja realizar outro cálculo? (s/n): ");
            String resposta = scanner.nextLine().toLowerCase();

            if (!(resposta.equals("s") || resposta.equals("sim"))) {
                continuar = false;
                System.out.println("Programa encerrado. Muito Obrigada por utilizar nosso programa!");
            }
        }

        scanner.close(); 
        // fechar o scanner = bons hábitos :):):)
    }
}
