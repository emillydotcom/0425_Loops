// Atividade 2
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;
        // option em inglês pq 'opcao' sem acento é feio

        do {
            System.out.println("\nMenu:");
            System.out.println("1 - Adicionar");
            System.out.println("2 - Remover");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Item adicionado!");
                    break;
                case 2:
                    System.out.println("Item removido!");
                    break;
                case 3:
                    System.out.println("Saindo do programa...");
                    break;
                
            }
        } while (option != 3);

        // penando mais uma vez até descobrir como fazer p ele parar de executar tudo :/

        scanner.close();
    }
}
