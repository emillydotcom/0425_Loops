// Atividade 2
import java.util.Scanner;

public class SomaPositivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0; // variável para guardar a soma
        int numero = 0; // inicialização da variável

        System.out.println("Por favor, digite um número:");

        while (numero >= 0) {
            numero = scanner.nextInt(); // lê o próximo número

            if (numero >= 0) {
                soma += numero; // adiciona o número na soma se ele for positivo
            }
        }

        System.out.println("A soma dos números positivos inseridos é: " + soma);
        
        scanner.close(); 
    }
}
