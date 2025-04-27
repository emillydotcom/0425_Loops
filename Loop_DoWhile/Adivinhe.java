// Atividade 3
import java.util.Scanner;
import java.util.Random;

public class Adivinhe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // +1 pra sortear de 0 ao 19
        int numeroSorteado = random.nextInt(20) + 1; 
        int palpite;
        int tentativas = 0;
        
        System.out.println("Tente adivinhar o número que está entre 1 e 20!!");

        do {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite > numeroSorteado) {
                System.out.println("Errou!! seu palpite é maior que o número!");
            } else if (palpite < numeroSorteado) {
                System.out.println("Errou! Seu palpite é menor que o número!");
            } else {
                System.out.println("Parabéns!! Você acertou em " + tentativas + " tentativas!");
            }
        } while (palpite != numeroSorteado);

        scanner.close();
    }
}
