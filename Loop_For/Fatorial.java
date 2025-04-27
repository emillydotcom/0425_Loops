// Atividade 2
import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Por favor, digite um número inteiro positivo: ");
        int numero = scanner.nextInt(); 

        int fatorial = 1; 

        // Loop de 1 até o número informado
        for (int i = 1; i <= numero; i++) {
            fatorial *= i; 
        }

        System.out.println("O fatorial de " + numero + " é: " + fatorial);

        scanner.close(); 
        
    }
}
