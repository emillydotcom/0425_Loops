// Atividade 3
import java.util.Scanner;

public class InsiraSenha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String senhaCorreta = "1403"; 
        String senhaDigitada = ""; 

        while (!senhaDigitada.equals(senhaCorreta)) {
            System.out.print("Digite a senha: ");
            senhaDigitada = scanner.nextLine(); 

            if (!senhaDigitada.equals(senhaCorreta)) {
                System.out.println("Senha incorreta, por favor, tente novamente.");
            }
        }

        System.out.println("Acesso concedido!");

        scanner.close(); 
        // eu penei tentando comparar com '==' no while e dava erro :/ 
    }
}
