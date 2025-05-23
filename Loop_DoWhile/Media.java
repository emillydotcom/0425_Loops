// Atividade 4
import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota;
        double somaNotas = 0;
        int quantidadeNotas = 0;
        char continuar;

        do {
            System.out.print("Por favor, digite a nota (0 a 10): ");
            nota = scanner.nextDouble();

            if (nota >= 0 && nota <= 10) {
                somaNotas += nota;
                quantidadeNotas++;
            } else {
                System.out.println("Nota inválida! Por favor digite uma nota entre 0 e 10.");
            }

            System.out.print("Deseja inserir outra nota? (s/n): ");
            continuar = scanner.next().toLowerCase().charAt(0); 
            // Pegar a primeira letra e transformar em minúscula p nao dar erro por causa da forma sim e s ou n e nao

        } while (continuar == 's');

        if (quantidadeNotas > 0) {
            double media = somaNotas / quantidadeNotas;
            System.out.println("Média das notas: " + media);
        } else {
            System.out.println("Nenhuma nota válida foi inserida.");
        }

        scanner.close();
    }
}
